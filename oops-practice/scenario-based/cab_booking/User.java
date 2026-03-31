package scenario_based.cab_booking;

public class User 
{
	private int UserId;
	private String name;
	
	 User(int userId, String name) {
		
		UserId = userId;
		this.name = name;
	}
	 
	 public int userId() {
		 return UserId;
	 }
	 
	 public String name() {
		 return name;
	 }
	
	

}
