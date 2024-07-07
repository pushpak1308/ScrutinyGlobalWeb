package mr.buddies.projects.ScrutinyGlobal.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BankDetails")
public class BankDetailsModel {
	
	@Id
	private Integer bankDetailsId;
	private String projectMappingId;
	private String bankName;
	private String bankAddress;
	private String accountType;
	private String ifscCode;
	private String swiftCode;
	private String benificierName;
	private String accountNumber;
	private String nameOfBussiness;
	private String panNumber;
	private String registrinationNmber;
	private String DateOfEstablishment;
	public Integer getBankDetailsId() {
		return bankDetailsId;
	}
	public void setBankDetailsId(Integer bankDetailsId) {
		this.bankDetailsId = bankDetailsId;
	}
	public String getProjectMappingId() {
		return projectMappingId;
	}
	public void setProjectMappingId(String projectMappingId) {
		this.projectMappingId = projectMappingId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getSwiftCode() {
		return swiftCode;
	}
	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}
	public String getBenificierName() {
		return benificierName;
	}
	public void setBenificierName(String benificierName) {
		this.benificierName = benificierName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getNameOfBussiness() {
		return nameOfBussiness;
	}
	public void setNameOfBussiness(String nameOfBussiness) {
		this.nameOfBussiness = nameOfBussiness;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getRegistrinationNmber() {
		return registrinationNmber;
	}
	public void setRegistrinationNmber(String registrinationNmber) {
		this.registrinationNmber = registrinationNmber;
	}
	public String getDateOfEstablishment() {
		return DateOfEstablishment;
	}
	public void setDateOfEstablishment(String dateOfEstablishment) {
		DateOfEstablishment = dateOfEstablishment;
	}
	public BankDetailsModel(Integer bankDetailsId, String projectMappingId, String bankName, String bankAddress,
			String accountType, String ifscCode, String swiftCode, String benificierName, String accountNumber,
			String nameOfBussiness, String panNumber, String registrinationNmber, String dateOfEstablishment) {
		super();
		this.bankDetailsId = bankDetailsId;
		this.projectMappingId = projectMappingId;
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.accountType = accountType;
		this.ifscCode = ifscCode;
		this.swiftCode = swiftCode;
		this.benificierName = benificierName;
		this.accountNumber = accountNumber;
		this.nameOfBussiness = nameOfBussiness;
		this.panNumber = panNumber;
		this.registrinationNmber = registrinationNmber;
		DateOfEstablishment = dateOfEstablishment;
	}
	public BankDetailsModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
