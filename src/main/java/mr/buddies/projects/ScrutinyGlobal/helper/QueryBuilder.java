package mr.buddies.projects.ScrutinyGlobal.helper;

public class QueryBuilder {
	
	public static final String findAllUserForAprovel="SELECT new mr.buddies.projects.ScrutinyGlobal.dtoRegisterRequest(ru.user_id, ru.account_type, ru.city, ru.country, ru.country_code, ru.dob, ru.email, ru.monthly_salary, ru.name, ru.number, ru.otp, ru.password, ru.profession, ru.state,  ru.zipcode, ru.acount_type) FROM register_user ru WHERE ru.aprove = 0";

}
