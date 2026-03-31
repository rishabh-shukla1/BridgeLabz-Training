package constructor;

public class HotelBooking 
{
	
		private String guestName;
	    private String roomType;
	    private int nights;
	
	    //Default Constructor
	    HotelBooking() 
	    {
	        guestName = "Guest";
	        roomType = "Standard";
	        nights = 1;
	    }
	
	    //Parameterized Constructor
	    HotelBooking(String guestName, String roomType, int nights) 
	    {
	        this.guestName = guestName;
	        this.roomType = roomType;
	        this.nights = nights;
	    }
	
	    //Copy Constructor
	    HotelBooking(HotelBooking hb) {
	        this.guestName = hb.guestName;
	        this.roomType = hb.roomType;
	        this.nights = hb.nights;
	    }
	
	    public void display() {
	        System.out.println("Guest Name :-" + guestName);
	        System.out.println("Room Type  :-" + roomType);
	        System.out.println("Nights     :-" + nights);
	    }
	
	    public static void main(String[] args) 
	    {
	    	//default
	        HotelBooking b1 = new HotelBooking();   
	        //parameterized
	        HotelBooking b2 = new HotelBooking("Rishabh", "Deluxe", 3); 
	        //copy
	        HotelBooking b3 = new HotelBooking(b2);
	
	        System.out.println("Default Booking:-");
	        b1.display();
	
	        System.out.println("Parameterized Booking:-");
	        b2.display();
	
	        System.out.println("Copied Booking:-");
	        b3.display();
	    }

}
