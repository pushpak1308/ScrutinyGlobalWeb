package mr.buddies.projects.ScrutinyGlobal.dto;

public class SettingRoleRquest {
	
	private Integer userId;
	private String accountType;
    private String successURL;
    private String terminateURL;
    private String quotaFullURL;
    private String securityTerminateURL;
    private String description;
    private String contactName;
    private String contactEmail;
    private String alternateNumber;
    private String website;
    private String industry;
    
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getAlternateNumber() {
		return alternateNumber;
	}
	public void setAlternateNumber(String alternateNumber) {
		this.alternateNumber = alternateNumber;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public SettingRoleRquest(Integer userId, String accountType, String successURL, String terminateURL,
			String quotaFullURL, String securityTerminateURL, String description, String contactName,
			String contactEmail, String alternateNumber, String website, String industry) {
		super();
		this.userId = userId;
		this.accountType = accountType;
		this.successURL = successURL;
		this.terminateURL = terminateURL;
		this.quotaFullURL = quotaFullURL;
		this.securityTerminateURL = securityTerminateURL;
		this.description = description;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.alternateNumber = alternateNumber;
		this.website = website;
		this.industry = industry;
	}



    
}
