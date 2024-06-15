package mr.buddies.projects.ScrutinyGlobal.repo;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mr.buddies.projects.ScrutinyGlobal.model.RegisterUser;
import mr.buddies.projects.ScrutinyGlobal.dto.RegisterRequest;
import mr.buddies.projects.ScrutinyGlobal.helper.QueryBuilder;

@Repository
public interface RegisterUserRepository extends JpaRepository<RegisterUser, Integer> {
	
	 @Query(value = "SELECT count(email) FROM register_user  WHERE email = :email AND aprove = 0", nativeQuery = true)
	    public Integer findActiveUserByEmail(@Param("email") String email);
	 
//	 @Query(value = "SELECT new mr.buddies.projects.ScrutinyGlobal.dto.RegisterRequest(ru.userId, ru.name, ru.email, ru.password, ru.number, ru.countryCode, ru.dob, ru.country, ru.state, ru.city, ru.zipcode, ru.profession, ru.accountType, ru.monthlySalary, ru.address, ru.otp) FROM RegisterUser ru WHERE ru.aprove = 0", nativeQuery = true)
//	 	public List<RegisterRequest> findAllUserForAprovel();
//	 
	 @Query(value = "SELECT * FROM register_user ru WHERE ru.aprove = 0", nativeQuery = true)
	 	public List<RegisterUser> findAllUserForAprovel();
	 
	 @Modifying
	  @Transactional
	 @Query("UPDATE RegisterUser  ru SET ru.accountType = :accountType , ru.aprove = 1  WHERE ru.userId = :userId")
	 public Integer giveRoleToUser(@Param("accountType") String accountType,@Param("userId") Integer userId);

}
