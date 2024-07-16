package mr.buddies.projects.ScrutinyGlobal.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ClientDetails")
public class ClientDetails {

	@Id
	private Integer clientId;
    private String contactName;
    private String contactEmail;
    private String alternateNumber;
    private String website;
    private String industry;
	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
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
	public ClientDetails(Integer clientId, String contactName, String contactEmail, String alternateNumber,
			String website, String industry) {
		super();
		this.clientId = clientId;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.alternateNumber = alternateNumber;
		this.website = website;
		this.industry = industry;
	}

	public ClientDetails() {
		super();

	}
    
    
}
