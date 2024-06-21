package mr.buddies.projects.ScrutinyGlobal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import mr.buddies.projects.ScrutinyGlobal.model.CountryData;
import mr.buddies.projects.ScrutinyGlobal.repo.CountryRepository;

@Service
public class CountryService {

		
	@Autowired
	private CountryRepository countryRepository;
	
	public void saveCountry(CountryData countryData) {
		
		countryRepository.save(countryData);
	}

	public List<CountryData> getALlCountries(){
		return countryRepository.findAll();
	}
	
}
