package mr.buddies.projects.ScrutinyGlobal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import mr.buddies.projects.ScrutinyGlobal.model.SurveyListDetails;
import mr.buddies.projects.ScrutinyGlobal.repo.SurveyRepository;

@Service
public class SurveyService {
	
	@Autowired
	private SurveyRepository surveyRepository;
	
	public boolean saveSurveyLis(List<SurveyListDetails> surveyList) {
		
		try {					
			surveyRepository.saveAll(surveyList);
			return true;
			
		}catch(Exception e) {
			System.out.println("exception"+e);
			return false;
		}
		
	}

}
