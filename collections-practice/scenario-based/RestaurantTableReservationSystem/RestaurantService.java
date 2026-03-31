package RestaurantTableReservationSystem;
import java.util.*;

public class RestaurantService {
	
	    private Map<Integer, Table> tableMap;
	    private List<Reservation> reservationList;

	    public RestaurantService() 
	    {
	        tableMap = new HashMap<>();
	        reservationList = new ArrayList<>();

	        tableMap.put(1, new Table(1));
	        tableMap.put(2, new Table(2));
	        tableMap.put(3, new Table(3));
	    }

	    public void reserveTable(int tableNumber, String timeSlot)
	            throws TableAlreadyReservedException {

	        Table table = tableMap.get(tableNumber);

	        if (table.isReserved())
	        {
	            throw new TableAlreadyReservedException( "Table " + tableNumber + " is already reserved");
	        }

	        table.setReserved(true);
	        reservationList.add(new Reservation(tableNumber, timeSlot));

	        System.out.println("Table " + tableNumber +
	                " reserved for " + timeSlot);
	    }

	    public void cancelReservation(int tableNumber) {

	        Table table = tableMap.get(tableNumber);
	        table.setReserved(false);

	        for (int i = 0; i < reservationList.size(); i++) 
	        {
	            if (reservationList.get(i).getTableNumber() == tableNumber) 
	            {
	                reservationList.remove(i);
	                break;
	            }
	        }

	        System.out.println("Reservation cancelled for table " + tableNumber);
	    }

	    public void showAvailableTables() {

	        System.out.println("Available Tables:");
	        for (Table table : tableMap.values()) 
	        {
	            if (!table.isReserved()) 
	            {
	                System.out.println("Table " + table.getTableNumber());
	            }
	        }
	    }

}
