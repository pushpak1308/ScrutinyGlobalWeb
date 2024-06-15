package mr.buddies.projects.ScrutinyGlobal.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mr.buddies.projects.ScrutinyGlobal.filter.CustomFilter;

@Configuration
public class FilterConfig {
	
	  @Bean
	    public FilterRegistrationBean<CustomFilter> loggingFilter(){
	        FilterRegistrationBean<CustomFilter> registrationBean = new FilterRegistrationBean<>();

	        registrationBean.setFilter(new CustomFilter());
	        registrationBean.addUrlPatterns("/ScrutinyGlobal/otpsend","/login"); // Apply filter to specific URL patterns

	        return registrationBean;
	    }

}
