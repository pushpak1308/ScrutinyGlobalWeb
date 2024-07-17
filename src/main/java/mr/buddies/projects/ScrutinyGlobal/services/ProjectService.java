package mr.buddies.projects.ScrutinyGlobal.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mr.buddies.projects.ScrutinyGlobal.dto.SettingRoleRquest;
import mr.buddies.projects.ScrutinyGlobal.dto.VenderAddToProject;
import mr.buddies.projects.ScrutinyGlobal.model.ClientDetails;
import mr.buddies.projects.ScrutinyGlobal.model.DocumentDetails;
import mr.buddies.projects.ScrutinyGlobal.model.ProjectDetails;
import mr.buddies.projects.ScrutinyGlobal.model.RegisterUser;
import mr.buddies.projects.ScrutinyGlobal.model.VenderDetails;
import mr.buddies.projects.ScrutinyGlobal.model.VenderMappingDetails;
import mr.buddies.projects.ScrutinyGlobal.repo.DocumentRepository;
import mr.buddies.projects.ScrutinyGlobal.repo.ProjectRepository;
import mr.buddies.projects.ScrutinyGlobal.repo.RegisterUserRepository;
import mr.buddies.projects.ScrutinyGlobal.repo.VenderMappingRepository;
import mr.buddies.projects.ScrutinyGlobal.repo.VenderRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	@Autowired
	private VenderMappingRepository venderMappingRepository;
	
	@Autowired
	private VenderRepository venderRepository;
	
	@Autowired
	private DocumentRepository documentRepository;

	public Integer saveProject(ProjectDetails projectDetails) {
		
		try {					
			ProjectDetails projectDetail=projectRepository.save(projectDetails);
			return projectDetail.getProjectId();
			
		}catch(Exception e) {
			System.out.println("exception"+e);
			return 0;
		}
		
	}
	 @Transactional
	   public boolean setDocumentDetailsForProject(Integer mappingId,DocumentDetails documentDetails) {
		 
		 String DocMappingId="";
		 Random random = new Random();
		 int number=1000 + random.nextInt(9000);	
		 DocMappingId="D"+number;
		  Integer check=projectRepository.setDocumentId(DocMappingId, mappingId);
		  if(check==1) {
			  documentDetails.setMappingId(DocMappingId);
				 documentRepository.save(documentDetails);
				 return true;
		  }else
				 return false;		 
	 }
	 @Transactional
	 public boolean setDocumentDetailsForVender(Integer mappingId,DocumentDetails documentDetails) {
		 
		 String DocMappingId="";
		 Random random = new Random();
		 int number=1000 + random.nextInt(9000);	
		 DocMappingId="V"+number;
		 Integer check=venderRepository.setDocumentId(DocMappingId, mappingId);
		 if(check==1) {
			  documentDetails.setMappingId(DocMappingId);
				 documentRepository.save(documentDetails);
				 return true;
		  }else 	
				 return false;		 
	 }
	
	   @Transactional
	   public boolean setVenderMappingDetails(VenderAddToProject venderAddToProject) {
		   
		   String VenderMappingId=projectRepository.getVenderMappingId(venderAddToProject.getProjectId());
		    
		   if(VenderMappingId==null) {			  
				if(!venderAddToProject.getVenderMappingDetails().isEmpty()) {
					Random random = new Random();
					int number=1000 + random.nextInt(9000);	
					VenderMappingId="V"+number;
				}
			    projectRepository.setVenderId(VenderMappingId, venderAddToProject.getProjectId());
		   }
		  
		
		List<VenderMappingDetails> venderList=new ArrayList<>();
		 for (VenderMappingDetails venderItems : venderAddToProject.getVenderMappingDetails()) {
			 VenderMappingDetails venderDetail=new VenderMappingDetails();
			 venderDetail.setVenderId(venderItems.getVenderId());
			 venderDetail.setVenderMappingId(VenderMappingId);
			 venderDetail.setSuccessURL(venderItems.getSuccessURL());
			 venderDetail.setTerminateURL(venderItems.getTerminateURL());
			 venderDetail.setQuotaFullURL(venderItems.getQuotaFullURL());
			 venderDetail.setSecurityTerminateURL(venderItems.getSecurityTerminateURL());
			 venderDetail.setRate(venderItems.getRate());			 
			 venderList.add(venderDetail);
		 
       }
		  venderMappingRepository.saveAll(venderList);
		   
		  return true;
		   
	   }
	   
	   public List<Map<String,Object>> getProjectList() throws Exception {		   
		   
		 
			   return projectRepository.getProjectsList();     
		   
		   
	   }
	
	   public List<Map<String,Object>> getProjectVenderList(String projectMappingId) throws Exception {		   
		   
			 
		   return venderMappingRepository.getProjectVenderList(projectMappingId);     
	   
	   
   }
	   
	   
	   

}
