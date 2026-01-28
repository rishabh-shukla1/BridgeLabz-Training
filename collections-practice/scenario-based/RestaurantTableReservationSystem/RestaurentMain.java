package RestaurantTableReservationSystem;

public class RestaurentMain {
	
	 public static void main(String[] args) {

	        RestaurantService service = new RestaurantService();

	        try {
	            service.reserveTable(1, "6 PM - 7 PM");
	            service.reserveTable(2, "7 PM - 8 PM");
	            service.reserveTable(1, "8 PM - 9 PM");
	        }
	        catch (TableAlreadyReservedException e)
	        {
	            System.out.println(e.getMessage());
	            
	        }

	        service.showAvailableTables();

	        service.cancelReservation(1);

	        service.showAvailableTables();
	    }

}
