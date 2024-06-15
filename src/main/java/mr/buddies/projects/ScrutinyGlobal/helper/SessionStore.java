package mr.buddies.projects.ScrutinyGlobal.helper;

import javax.servlet.http.HttpSession;

public class SessionStore {
	
	private static HttpSession httpSession;
	
	public SessionStore(HttpSession httpSession) {
		this.httpSession=httpSession;
		
	}
	
	public static HttpSession getSession() {
		return httpSession;
		
	}
	

}
