package mr.buddies.projects.ScrutinyGlobal.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import mr.buddies.projects.ScrutinyGlobal.model.SurveyListDetails;

public class ProjectRequest {

	    private String projectName;
	    private String description;
	    private String audienceType;
	    private String projectHeadId;
	    private String preSaleSPOC;
	    private String clientMappingId;
	    private List<SurveyListDetails> surveyList;
	    private Integer projectMinimumFee;
	    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	    private Date projectStartTime;
	    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	    private Date projectEndTime;
		public String getProjectName() {
			return projectName;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getAudienceType() {
			return audienceType;
		}
		public void setAudienceType(String audienceType) {
			this.audienceType = audienceType;
		}
		public String getProjectHeadId() {
			return projectHeadId;
		}
		public void setProjectHeadId(String projectHeadId) {
			this.projectHeadId = projectHeadId;
		}
		public String getPreSaleSPOC() {
			return preSaleSPOC;
		}
		public void setPreSaleSPOC(String preSaleSPOC) {
			this.preSaleSPOC = preSaleSPOC;
		}
		public String getClientMappingId() {
			return clientMappingId;
		}
		public void setClientMappingId(String clientMappingId) {
			this.clientMappingId = clientMappingId;
		}
		public List<SurveyListDetails> getSurveyList() {
			return surveyList;
		}
		public void setSurveyList(List<SurveyListDetails> surveyList) {
			this.surveyList = surveyList;
		}
		public Integer getProjectMinimumFee() {
			return projectMinimumFee;
		}
		public void setProjectMinimumFee(Integer projectMinimumFee) {
			this.projectMinimumFee = projectMinimumFee;
		}
		public Date getProjectStartTime() {
			return projectStartTime;
		}
		public void setProjectStartTime(Date projectStartTime) {
			this.projectStartTime = projectStartTime;
		}
		public Date getProjectEndTime() {
			return projectEndTime;
		}
		public void setProjectEndTime(Date projectEndTime) {
			this.projectEndTime = projectEndTime;
		}
		public ProjectRequest(String projectName, String description, String audienceType, String projectHeadId,
				String preSaleSPOC, String clientMappingId, List<SurveyListDetails> surveyList,
				Integer projectMinimumFee, Date projectStartTime, Date projectEndTime) {
			super();
			this.projectName = projectName;
			this.description = description;
			this.audienceType = audienceType;
			this.projectHeadId = projectHeadId;
			this.preSaleSPOC = preSaleSPOC;
			this.clientMappingId = clientMappingId;
			this.surveyList = surveyList;
			this.projectMinimumFee = projectMinimumFee;
			this.projectStartTime = projectStartTime;
			this.projectEndTime = projectEndTime;
		}
	    
}
