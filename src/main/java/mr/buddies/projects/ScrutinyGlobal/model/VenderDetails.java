package mr.buddies.projects.ScrutinyGlobal.model;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VenderDetails")
public class VenderDetails {
	
	@Id
	private Integer venderId;
    private String successURL;
    private String terminateURL;
    private String quotaFullURL;
    private String securityTerminateURL;
    
	public Integer getVenderId() {
		return venderId;
	}
	public void setVenderId(Integer venderId) {
		this.venderId = venderId;
	}
	public String getSuccessURL() {
		return successURL;
	}
	public void setSuccessURL(String successURL) {
		this.successURL = successURL;
	}
	public String getTerminateURL() {
		return terminateURL;
	}
	public void setTerminateURL(String terminateURL) {
		this.terminateURL = terminateURL;
	}
	public String getQuotaFullURL() {
		return quotaFullURL;
	}
	public void setQuotaFullURL(String quotaFullURL) {
		this.quotaFullURL = quotaFullURL;
	}
	public String getSecurityTerminateURL() {
		return securityTerminateURL;
	}
	public void setSecurityTerminateURL(String securityTerminateURL) {
		this.securityTerminateURL = securityTerminateURL;
	}
	public VenderDetails(Integer venderId, String successURL, String terminateURL, String quotaFullURL,
			String securityTerminateURL) {
		super();
		this.venderId = venderId;
		this.successURL = successURL;
		this.terminateURL = terminateURL;
		this.quotaFullURL = quotaFullURL;
		this.securityTerminateURL = securityTerminateURL;
	}
	public VenderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

    
    
}
