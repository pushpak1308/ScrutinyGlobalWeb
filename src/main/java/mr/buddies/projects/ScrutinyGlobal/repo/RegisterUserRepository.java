package mr.buddies.projects.ScrutinyGlobal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mr.buddies.projects.ScrutinyGlobal.model.RegisterUser;

@Repository
public interface RegisterUserRepository extends JpaRepository<RegisterUser, Integer> {
	
	 @Query(value = "SELECT count(email) FROM register_user  WHERE email = :email AND aprove = 0", nativeQuery = true)
	    Integer findActiveUserByEmail(@Param("email") String email);

}
