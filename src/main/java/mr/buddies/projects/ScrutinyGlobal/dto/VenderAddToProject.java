package mr.buddies.projects.ScrutinyGlobal.dto;

import java.util.List;

import mr.buddies.projects.ScrutinyGlobal.model.VenderMappingDetails;

public class VenderAddToProject {

	private Integer projectId;
	   List<VenderMappingDetails> venderMappingDetails;
	
	   public VenderAddToProject(Integer projectId, List<VenderMappingDetails> venderMappingDetails) {
		super();
		this.projectId = projectId;
		this.venderMappingDetails = venderMappingDetails;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public List<VenderMappingDetails> getVenderMappingDetails() {
		return venderMappingDetails;
	}
	public void setVenderMappingDetails(List<VenderMappingDetails> venderMappingDetails) {
		this.venderMappingDetails = venderMappingDetails;
	}
	
	   
	
}
