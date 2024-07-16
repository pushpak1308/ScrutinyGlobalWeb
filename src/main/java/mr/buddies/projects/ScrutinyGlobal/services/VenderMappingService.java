package mr.buddies.projects.ScrutinyGlobal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mr.buddies.projects.ScrutinyGlobal.model.VenderMappingDetails;
import mr.buddies.projects.ScrutinyGlobal.repo.VenderMappingRepository;

@Service
public class VenderMappingService {

	@Autowired
	private VenderMappingRepository venderMappingRepository;
	
	public boolean saveProject(List<VenderMappingDetails> venderMappingDetails) {
		
		try {					
			venderMappingRepository.saveAll(venderMappingDetails);
			return true;
			
		}catch(Exception e) {
			System.out.println("exception"+e);
			return false;
		}
		
	}
}
