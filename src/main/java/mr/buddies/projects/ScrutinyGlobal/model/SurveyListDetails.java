package mr.buddies.projects.ScrutinyGlobal.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SurveyListDetails")
public class SurveyListDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String projectMappingId;
	private String country;
	private String fr;
	private String loi;
	private String surveyURL;    
    private String cpi;
    private String targetAudience;
    private String completeNeeds;
    private String completePhysical;
    private Long rate;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
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
	public String getFr() {
		return fr;
	}
	public void setFr(String fr) {
		this.fr = fr;
	}
	public String getLoi() {
		return loi;
	}
	public void setLoi(String loi) {
		this.loi = loi;
	}
	
	public String getURL() {
		return surveyURL;
	}
	public void setURL(String surveyURL) {
		this.surveyURL = surveyURL;
	}
	public String getCpi() {
		return cpi;
	}
	public void setCpi(String cpi) {
		this.cpi = cpi;
	}
	public String getTargetAudience() {
		return targetAudience;
	}
	public void setTargetAudience(String targetAudience) {
		this.targetAudience = targetAudience;
	}
	public String getCompleteNeeds() {
		return completeNeeds;
	}
	public void setCompleteNeeds(String completeNeeds) {
		this.completeNeeds = completeNeeds;
	}
	public String getCompletePhysical() {
		return completePhysical;
	}
	public void setCompletePhysical(String completePhysical) {
		this.completePhysical = completePhysical;
	}
	public Long getRate() {
		return rate;
	}
	public void setRate(Long rate) {
		this.rate = rate;
	}
	
	public SurveyListDetails(Integer id, String projectMappingId, String country, String fr, String loi, String surveyURL,
			String cpi, String targetAudience, String completeNeeds, String completePhysical, Long rate) {
		super();
		Id = id;
		this.projectMappingId = projectMappingId;
		this.country = country;
		this.fr = fr;
		this.loi = loi;
		this.surveyURL = surveyURL;
		this.cpi = cpi;
		this.targetAudience = targetAudience;
		this.completeNeeds = completeNeeds;
		this.completePhysical = completePhysical;
		this.rate = rate;
	}
	public SurveyListDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
	
	
	

	

}
