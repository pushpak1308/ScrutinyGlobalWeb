package mr.buddies.projects.ScrutinyGlobal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ProjectDetails")
public class ProjectDetails {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO, generator = "fourDigitIdGenerator")
	    @GenericGenerator(name = "fourDigitIdGenerator", strategy = "mr.buddies.projects.ScrutinyGlobal.helper.FourDigitIdGenerator")
	    private Integer projectId;
	    private String projectName;
	    private String description;
	    private String audienceType;
	    private String projectHeadId;
	    private String preSaleSPOC;
	    private Integer clientMappingId;
	    private String venderMappingId;
	    private String surveyMappingId;
	    private String docMappingId;
	    private String invoiceMappingId;
	    private String bankDetailId;
	    private Integer projectMinimumFee;

		@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	    private Date projectStartTime;

		@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	    private Date projectEndTime;
	    private Date projectCreateTime;
	    private Date projectUpdateTime;
	    
		public Integer getProjectId() {
			return projectId;
		}
		public void setProjectId(Integer projectId) {
			this.projectId = projectId;
		}
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
	
		public Integer getClientMappingId() {
			return clientMappingId;
		}
		public void setClientMappingId(Integer clientMappingId) {
			this.clientMappingId = clientMappingId;
		}
		public String getVenderMappingId() {
			return venderMappingId;
		}
		public void setVenderMappingId(String venderMappingId) {
			this.venderMappingId = venderMappingId;
		}
		public String getSurveyMappingId() {
			return surveyMappingId;
		}
		public void setSurveyMappingId(String surveyMappingId) {
			this.surveyMappingId = surveyMappingId;
		}
		public String getDocMappingId() {
			return docMappingId;
		}
		public void setDocMappingId(String docMappingId) {
			this.docMappingId = docMappingId;
		}
		public String getInvoiceMappingId() {
			return invoiceMappingId;
		}
		public void setInvoiceMappingId(String invoiceMappingId) {
			this.invoiceMappingId = invoiceMappingId;
		}
		public String getBankDetailId() {
			return bankDetailId;
		}
		public void setBankDetailId(String bankDetailId) {
			this.bankDetailId = bankDetailId;
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
		
		public Date getProjectCreateTime() {
			return projectCreateTime;
		}
		public void setProjectCreateTime(Date projectCreateTime) {
			this.projectCreateTime = projectCreateTime;
		}
		public Date getProjectUpdateTime() {
			return projectUpdateTime;
		}
		public void setProjectUpdateTime(Date projectUpdateTime) {
			this.projectUpdateTime = projectUpdateTime;
		}
		public ProjectDetails(Integer projectId, String projectName, String description, String audienceType,
				String projectHeadId, String preSaleSPOC, Integer clientMappingId, String venderMappingId,
				String surveyMappingId, String docMappingId, String invoiceMappingId, String bankDetailId,
				Integer projectMinimumFee, Date projectStartTime, Date projectEndTime, Date projectCreateTime,
				Date projectUpdateTime) {
			super();
			this.projectId = projectId;
			this.projectName = projectName;
			this.description = description;
			this.audienceType = audienceType;
			this.projectHeadId = projectHeadId;
			this.preSaleSPOC= preSaleSPOC;
			this.clientMappingId = clientMappingId;
			this.venderMappingId = venderMappingId;
			this.surveyMappingId = surveyMappingId;
			this.docMappingId = docMappingId;
			this.invoiceMappingId = invoiceMappingId;
			this.bankDetailId = bankDetailId;
			this.projectMinimumFee = projectMinimumFee;
			this.projectStartTime = projectStartTime;
			this.projectEndTime = projectEndTime;
			this.projectCreateTime = projectCreateTime;
			this.projectUpdateTime = projectUpdateTime;
		}
		public ProjectDetails() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "ProjectDetails [projectId=" + projectId + ", projectName=" + projectName + ", description="
					+ description + ", audienceType=" + audienceType + ", projectHeadId=" + projectHeadId
					+ ", projectSPOC=" + preSaleSPOC + ", clientMappingId=" + clientMappingId + ", venderMappingId="
					+ venderMappingId + ", surveyMappingId=" + surveyMappingId + ", docMappingId=" + docMappingId
					+ ", invoiceMappingId=" + invoiceMappingId + ", bankDetailId=" + bankDetailId
					+ ", projectMinimumFee=" + projectMinimumFee + ", projectStartTime=" + projectStartTime
					+ ", projectEndTime=" + projectEndTime + ", createTime=" + projectCreateTime + ", updateTime=" + projectUpdateTime
					+ "]";
		}
	    
	    
	    
	    

}
