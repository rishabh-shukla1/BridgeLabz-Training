package scenario_based.HotelManagementSystem;

public class HotelMain{
	
	public static void main(String args[])
	{
		Guest g1=new Guest("Rishabh",101);
		Guest g2=new Guest("Ram",102);

		Room r1=new DeluxeRoom(01,2000.0);
		
		try {
		Reservation res1=new Reservation(g1,r1,5);
		res1.invoice();
		Reservation res2=new Reservation(g2,r1,5);
		res2.invoice();
		res1.checkOut();
		}
		catch(RoomNotAvailableException e) {
			System.out.println("Error"+e.getMessage());
		}
		
		
	}
}
