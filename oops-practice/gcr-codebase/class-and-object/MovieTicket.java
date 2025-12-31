package class_and_object;

public class MovieTicket
{
		String movieName;
	    String seatNumber;
	    double price;
	    boolean booked = false;
	
	    //method to book ticket
	    public void bookTicket(String mName, String seat, double amt)
	    {
	        if (booked == false)
	        {
	            movieName = mName;
	            seatNumber = seat;
	            price = amt;
	            booked = true;
	            System.out.println("Ticket booked for movie: " + movieName);
	            System.out.println("Seat Number: " + seatNumber);
	        }
	        else
	        {
	            System.out.println("House full!!! sorry..... Ticket already booked");
	        }
	    }
	
	    // method to display ticket
	    public void displayTicket()
	    {
	        if (booked == true)
	        {
	            System.out.println("Price: $" + price);
	        }
	        else
	        {
	            System.out.println("Ticket have not booked yet");
	        }
	    }
	
	    public static void main(String[] args)
	    {
	        MovieTicket t = new MovieTicket();
	
	        t.displayTicket();
	        t.bookTicket("Dragon", "A10", 120);
	        t.bookTicket("Dragon", "A10", 120);
	        t.bookTicket("Dragon", "A10", 120);
	        t.displayTicket();
	
	        System.out.println();
	        System.out.println("Ticket booked for movie: Dragon");
	        System.out.println("Seat Number: A10");
	        System.out.println("Price: $120.0");
	    }

}
