package mr.buddies.projects.ScrutinyGlobal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mr.buddies.projects.ScrutinyGlobal.model.RegisterUser;
import mr.buddies.projects.ScrutinyGlobal.repo.RegisterUserRepository;

@Service
public class RegisterUserService {
	
	@Autowired
	private RegisterUserRepository registerUserRepository;
	
		public boolean saveRegisterUser(RegisterUser registerUser) {
			
			try {
				registerUserRepository.save(registerUser);
				return true;
				
			}catch(Exception e) {
				
				return false;
			}
			
		}

}
