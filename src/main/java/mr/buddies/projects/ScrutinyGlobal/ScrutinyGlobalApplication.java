package mr.buddies.projects.ScrutinyGlobal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("mr.buddies.projects.ScrutinyGlobal.repo")
public class ScrutinyGlobalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScrutinyGlobalApplication.class, args);
	}

}
