package mr.buddies.projects.ScrutinyGlobal.dto;

import java.util.List;

public class UserFilter {
	
	private List<String> accountType;
	private List<String> country;
	private List<String> profession;
	private boolean aprove;
	public List<String> getAccountType() {
		return accountType;
	}
	public void setAccountType(List<String> accountType) {
		this.accountType = accountType;
	}
	public List<String> getCountry() {
		return country;
	}
	public void setCountry(List<String> country) {
		this.country = country;
	}
	public List<String> getProfession() {
		return profession;
	}
	public void setProfession(List<String> profession) {
		this.profession = profession;
	}
	public boolean isAprove() {
		return aprove;
	}
	public void setAprove(boolean aprove) {
		this.aprove = aprove;
	}
	public UserFilter(List<String> accountType, List<String> country, List<String> profession, boolean aprove) {
		super();
		this.accountType = accountType;
		this.country = country;
		this.profession = profession;
		this.aprove = aprove;
	}
	@Override
	public String toString() {
		return "UserFilter [accountType=" + accountType + ", country=" + country + ", profession=" + profession
				+ ", aprove=" + aprove + "]";
	}
	
	

}
