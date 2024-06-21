package mr.buddies.projects.ScrutinyGlobal.controller;

import mr.buddies.projects.ScrutinyGlobal.exception.ErrorMsgException;
import mr.buddies.projects.ScrutinyGlobal.helper.JwtUtil;
import mr.buddies.projects.ScrutinyGlobal.helper.SessionStore;
import mr.buddies.projects.ScrutinyGlobal.model.JwtRequest;
import mr.buddies.projects.ScrutinyGlobal.model.JwtResponse;
import mr.buddies.projects.ScrutinyGlobal.services.CustomUserDetailsService;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class JwtController {

    @Autowired
    private AuthenticationManager authenticationManager;


    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws ErrorMsgException,Exception  {

        System.out.println("Inside Controller");
        System.out.println(jwtRequest);
        try {

            this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(), jwtRequest.getPassword()));


        }catch (BadCredentialsException e)
        {
            e.printStackTrace();
            throw new ErrorMsgException(e.getMessage());
        }
//        UserDetails userDetails=null;
        HttpSession session=SessionStore.getSession();
        System.out.println(session.getAttribute("userAproval")+"-----userAproval");
        if(session.getAttribute("userAproval").equals(0))
        {
        	throw new ErrorMsgException("Waiting for aproval");
        }
        UserDetails userDetails = this.customUserDetailsService.loadUserByUsername(jwtRequest.getUsername());
		
        //fine area..
      
        String token = this.jwtUtil.generateToken(userDetails);
        System.out.println("JWT " + token);

        //{"token":"value"}

        return ResponseEntity.ok(new JwtResponse(token));

    }
}
