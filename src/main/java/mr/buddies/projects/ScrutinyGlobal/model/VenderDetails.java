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
    private String alternateNumber;
    private String registerationNumber;
    private String panNumber;
    private String bankBranchAddress;
    private String accountNumber;
    private String ifscCode;
    private String bankAccountType;
    private String signatureField;
    private String docMappingId;
	private String accountType;

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

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
	public String getAlternateNumber() {
		return alternateNumber;
	}
	public void setAlternateNumber(String alternateNumber) {
		this.alternateNumber = alternateNumber;
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
	public String getSignatureField() {
		return signatureField;
	}
	public void setSignatureField(String signatureField) {
		this.signatureField = signatureField;
	}
	public String getDocMappingId() {
		return docMappingId;
	}
	public void setDocMappingId(String docMappingId) {
		this.docMappingId = docMappingId;
	}
	public VenderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VenderDetails(Integer venderId, String successURL, String terminateURL, String quotaFullURL,
			String securityTerminateURL, String alternateNumber, String registerationNumber, String panNumber,
			String bankBranchAddress, String accountNumber, String ifscCode, String bankAccountType, String signatureField,
			String docMappingId) {
		super();
		this.venderId = venderId;
		this.successURL = successURL;
		this.terminateURL = terminateURL;
		this.quotaFullURL = quotaFullURL;
		this.securityTerminateURL = securityTerminateURL;
		this.alternateNumber = alternateNumber;
		this.registerationNumber = registerationNumber;
		this.panNumber = panNumber;
		this.bankBranchAddress = bankBranchAddress;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.bankAccountType = bankAccountType;
		this.signatureField = signatureField;
		this.docMappingId = docMappingId;
	}

    
    
}
