package mr.buddies.projects.ScrutinyGlobal.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "InvoiceDetails")
public class InvoiceModel {
	
	@Id
	private Integer invoiceId;
	private String projectMappingId;
	private String country;
	private String currency;
	public Integer getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getProjectMappingId() {
		return projectMappingId;
	}
	public void setProjectMappingId(String projectMappingId) {
		this.projectMappingId = projectMappingId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public InvoiceModel(Integer invoiceId, String projectMappingId, String country, String currency) {
		super();
		this.invoiceId = invoiceId;
		this.projectMappingId = projectMappingId;
		this.country = country;
		this.currency = currency;
	}
	
	

}
