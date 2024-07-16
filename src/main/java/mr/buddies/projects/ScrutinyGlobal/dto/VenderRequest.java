package mr.buddies.projects.ScrutinyGlobal.dto;

public class VenderRequest {

	 private String venderName;
	 private String email;
	 private String number;
	 private String alternateNumber;
	 private String address;
	 private String city;
	 private String pincode;
	 private String country;
	 private String successURL;
	 private String terminateURL;
	 private String quotaFullURL;
	 private String registerationNumber;
	 private String panNumber;
	 private String bankBranchAddress;
	 private String accountNumber;
	 private String ifscCode;
	 private String accountType;
	 
	 
	public VenderRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VenderRequest(String venderName, String email, String number, String alternateNumber, String address,
			String city, String pincode, String country, String successURL, String terminateURL, String quotaFullURL,
			String registerationNumber, String panNumber, String bankBranchAddress, String accountNumber,
			String ifscCode, String accountType) {
		super();
		this.venderName = venderName;
		this.email = email;
		this.number = number;
		this.alternateNumber = alternateNumber;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.country = country;
		this.successURL = successURL;
		this.terminateURL = terminateURL;
		this.quotaFullURL = quotaFullURL;
		this.registerationNumber = registerationNumber;
		this.panNumber = panNumber;
		this.bankBranchAddress = bankBranchAddress;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.accountType = accountType;
	}
	public String getVenderName() {
		return venderName;
	}
	public void setVenderName(String venderName) {
		this.venderName = venderName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAlternateNumber() {
		return alternateNumber;
	}
	public void setAlternateNumber(String alternateNumber) {
		this.alternateNumber = alternateNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	 
	 
	 
}
