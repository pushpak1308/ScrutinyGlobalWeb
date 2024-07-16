package mr.buddies.projects.ScrutinyGlobal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mr.buddies.projects.ScrutinyGlobal.model.ProjectDetails;
import mr.buddies.projects.ScrutinyGlobal.repo.ProjectRepository;

import java.util.List;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;

	public boolean saveProject(ProjectDetails projectDetails) {
		
		try {					
			projectRepository.save(projectDetails);
			return true;
			
		}catch(Exception e) {
			System.out.println("exception"+e);
			return false;
		}
		
	}


	public List<ProjectDetails> getProjectDetails(){
		return projectRepository.findAll();
	}
	

}
