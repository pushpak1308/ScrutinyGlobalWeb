package mr.buddies.projects.ScrutinyGlobal.services;

import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import mr.buddies.projects.ScrutinyGlobal.dto.OtpVerifing;
import mr.buddies.projects.ScrutinyGlobal.exception.UserAlreadyExist;
import mr.buddies.projects.ScrutinyGlobal.model.RegisterUser;
import mr.buddies.projects.ScrutinyGlobal.repo.RegisterUserRepository;

@Service
public class RegisterUserService {
	
	@Autowired
    private JavaMailSender mailSender;
	
	@Autowired
	private RegisterUserRepository registerUserRepository;
	
	 public RegisterUserService(JavaMailSender mailSender) {
	        this.mailSender = mailSender;
	    }
	
		public boolean saveRegisterUser(RegisterUser registerUser) {
			
			try {
				
				
				registerUserRepository.save(registerUser);
				return true;
				
			}catch(Exception e) {
				System.out.println("exception"+e);
				return false;
			}
			
		}
		
		   private void sendSimpleEmail(String toEmail,String subject,String body) {
			   System.out.println("in Mail Send...");
			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom("testingdummy892@gmail.com");
			message.setTo(toEmail);
			message.setText(body);
			message.setSubject(subject);
			mailSender.send(message);
			System.out.println("Mail Send...");
			
			
			}
		   
		   public boolean sendOtpOnMail(String email,HttpSession session) throws UserAlreadyExist {
			   
			   int count=registerUserRepository.findActiveUserByEmail(email);
			   System.out.println("Count is..."+count);
			   if(count>0) 
			   {
				   throw new UserAlreadyExist("This email already exist");
				   
			   }
				   
			 
			   Random random = new Random();
				int newOTP=1000 + random.nextInt(9000);
				session.setAttribute("userEmail", email);
				session.setAttribute("userOtp", newOTP);
				session.setAttribute("userOtpTime", new Date());
				sendSimpleEmail(email,"OTP for registration","your OTP is "+newOTP);
				
				
			   return true;
		   }

}
