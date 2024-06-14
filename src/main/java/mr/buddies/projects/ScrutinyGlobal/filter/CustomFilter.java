package mr.buddies.projects.ScrutinyGlobal.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CustomFilter implements Filter{
	
	 @Override
	    public void init(FilterConfig filterConfig) throws ServletException {
	        // Initialization logic if needed
	    }

	    @Override
	    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	            throws IOException, ServletException {
	    	System.out.println("in filter");
	        HttpServletRequest httpRequest = (HttpServletRequest) request;
//	        HttpSession session = httpRequest.getSession();
//
//	        // Set an attribute in the session
//	        if (session.getAttribute("username") == null) {
//	            session.setAttribute("username", "JohnDoe");
//	        }
//	        System.out.println(session.getAttribute("userEmail")+"-----email");
//			System.out.println(session.getAttribute("userOtp")+"-----userOtp");
//			System.out.println(session.getAttribute("userOtpTime")+"-----userOtpTime");
	        // Proceed with the next filter in the chain
	        chain.doFilter(request, response);
	    }

	    @Override
	    public void destroy() {
	        // Cleanup logic if needed
	    }

}
