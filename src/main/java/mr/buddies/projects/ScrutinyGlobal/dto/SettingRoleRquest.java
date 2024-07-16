package mr.buddies.projects.ScrutinyGlobal.dto;

public class SettingRoleRquest {
	
	private Integer userId;
	private String accountType;
    private String successURL;
    private String terminateURL;
    private String quotaFullURL;
    private String securityTerminateURL;
    private String registerationNumber;
    private String panNumber;
    private String bankBranchAddress;
    private String accountNumber;
    private String ifscCode;
    private String bankAccountType;
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
	public String getRegisterationNumber() {
		return registerationNumber;
	}
	public void setRegisterationNumber(String registerationNumber) {
		this.registerationNumber = registerationNumber;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getBankBranchAddress() {
		return bankBranchAddress;
	}
	public void setBankBranchAddress(String bankBranchAddress) {
		this.bankBranchAddress = bankBranchAddress;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getBankAccountType() {
		return bankAccountType;
	}
	public void setBankAccountType(String bankAccountType) {
		this.bankAccountType = bankAccountType;
	}
	public SettingRoleRquest(Integer userId, String accountType, String successURL, String terminateURL,
			String quotaFullURL, String securityTerminateURL, String registerationNumber, String panNumber,
			String bankBranchAddress, String accountNumber, String ifscCode, String bankAccountType, String description,
			String contactName, String contactEmail, String alternateNumber, String website, String industry) {
		super();
		this.userId = userId;
		this.accountType = accountType;
		this.successURL = successURL;
		this.terminateURL = terminateURL;
		this.quotaFullURL = quotaFullURL;
		this.securityTerminateURL = securityTerminateURL;
		this.registerationNumber = registerationNumber;
		this.panNumber = panNumber;
		this.bankBranchAddress = bankBranchAddress;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.bankAccountType = bankAccountType;
		this.description = description;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.alternateNumber = alternateNumber;
		this.website = website;
		this.industry = industry;
	}




    
}
