package mr.buddies.projects.ScrutinyGlobal.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpFilter;

import org.springframework.stereotype.Component;

import mr.buddies.projects.ScrutinyGlobal.helper.SessionStore;

import java.io.IOException;

public class CustomFilter extends HttpFilter {
	
	 @Override
	    public void init(FilterConfig filterConfig) throws ServletException {
	        // Initialization logic if needed
	    }

	    @Override
	    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
	            throws IOException, ServletException {
	    	System.out.println("in filter");
	        HttpSession session = request.getSession();
	        
	        session.setMaxInactiveInterval(1800); // 1800 seconds = 30 minutes

	        // Set an attribute in the session
//	        if (session.getAttribute("username") == null) {
//	            session.setAttribute("username", "JohnDoe");
//	        }
	        SessionStore sessionStore=new SessionStore(session); 
//	         Proceed with the next filter in the chain
	        chain.doFilter(request, response);
	    }

	    @Override
	    public void destroy() {
	        // Cleanup logic if needed
	    }

}
