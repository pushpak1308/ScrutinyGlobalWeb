package mr.buddies.projects.ScrutinyGlobal.services;

import mr.buddies.projects.ScrutinyGlobal.exception.ErrorMsgException;
import mr.buddies.projects.ScrutinyGlobal.helper.SessionStore;
import mr.buddies.projects.ScrutinyGlobal.model.CustomUserDetails;
import mr.buddies.projects.ScrutinyGlobal.model.RegisterUser;
import mr.buddies.projects.ScrutinyGlobal.model.User;
import mr.buddies.projects.ScrutinyGlobal.repo.RegisterUserRepository;
import mr.buddies.projects.ScrutinyGlobal.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

@Service
public class CustomUserDetailsService implements UserDetailsService {

//    @Autowired
//    private UserRepository userRepository;
    
    @Autowired
	private RegisterUserRepository registerUserRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

//        final User user = this.userRepository.findByUsername(userName);
        
        final RegisterUser registerUser =registerUserRepository.findByEmail(userName);

        
        if (registerUser == null) {
            throw new UsernameNotFoundException("User not found !!");
        }
        else {
            HttpSession session=SessionStore.getSession();
            session.setAttribute("userAproval", registerUser.getAprove());
        	return new CustomUserDetails(registerUser);
        }



    }
}
