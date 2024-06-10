package mr.buddies.projects.ScrutinyGlobal.controller;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mr.buddies.projects.ScrutinyGlobal.dto.RegisterRequest;
import mr.buddies.projects.ScrutinyGlobal.helper.MD5Util;
import mr.buddies.projects.ScrutinyGlobal.model.CountryData;
import mr.buddies.projects.ScrutinyGlobal.model.JwtResponse;
import mr.buddies.projects.ScrutinyGlobal.model.RegisterUser;
import mr.buddies.projects.ScrutinyGlobal.services.CountryService;
import mr.buddies.projects.ScrutinyGlobal.services.RegisterUserService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/ScrutinyGlobal")
public class RegisterController {
	
	@Autowired
	private RegisterUserService registerUserService;
	
	@Autowired
	private CountryService countryService;
	
	@PostMapping("/saveRegisterUser")
	public ResponseEntity<?> saveRegisterUser(@RequestBody RegisterRequest registerRequest) throws Exception{
		
		RegisterUser registerUser =new RegisterUser();
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaa"+registerRequest.getDob());
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		registerUser.setName(registerRequest.getName());
		registerUser.setEmail(registerRequest.getEmail());
		registerUser.setPassword(MD5Util.hash(registerRequest.getPassword()));
		registerUser.setNumber(registerRequest.getNumber());
		registerUser.setCountryCode(registerRequest.getCountryCode());
		registerUser.setDob(registerRequest.getDob());
		registerUser.setCountry(registerRequest.getCountry());
		registerUser.setState(registerRequest.getState());
		registerUser.setCity(registerRequest.getCity());
		registerUser.setZipcode(registerRequest.getZipcode());
		registerUser.setProfession(registerRequest.getProfession());
		registerUser.setAcountType(registerRequest.getAcountType());
		registerUser.setMonthlySalary(registerRequest.getMonthlySalary());
		registerUser.setOtp(0000);
		registerUser.setAprove(0);
		registerUser.setCreateTime(new Date());
		registerUser.setUpdateTime(new Date());
		
		 try {
			 registerUserService.saveRegisterUser(registerUser);
			 
	          

	        } catch (UsernameNotFoundException e) {
	            e.printStackTrace();
	            throw new Exception("Bad Credentials");
	        }catch (BadCredentialsException e)
	        {
	            e.printStackTrace();
	            throw new Exception("Bad Credentials");
	        }
		 
		 return ResponseEntity.ok(registerRequest);
	}
	
	@PostMapping("/saveCountry")
	public boolean saveCountry(@RequestBody CountryData countryData) throws Exception {
		
		 try {
			 countryService.saveCountry(countryData);		
	          

	        } catch (UsernameNotFoundException e) {
	            e.printStackTrace();
	            throw new Exception("Bad Credentials");
	        }catch (BadCredentialsException e)
	        {
	            e.printStackTrace();
	            throw new Exception("Bad Credentials");
	        }
		 return true;
	}

}
