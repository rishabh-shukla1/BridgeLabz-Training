package scenario_based.HotelManagementSystem;

public class Guest {

	 private String GuestName;
	 private int GuestId;
	 
	  Guest(String guestName, int guestId) {
	
		GuestName = guestName;
		GuestId = guestId;
	 }

	  public String getGuestName() {
		  return GuestName;
	  }
	  
	  public int getGuestId() {
		  return GuestId;
	  }	 
	 
}
