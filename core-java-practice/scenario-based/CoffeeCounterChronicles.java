package scenario_based;
import java.util.*;
public class CoffeeCounterChronicles {
	
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);
		
		// Gst variable is being made final so that it cannot be changed
		// Gst is 18%
		final double Gst=0.18;
		
		while(true){
			
			System.out.println("Welcome to Ravi Coffee Cafe-:");
			System.out.println("Available Coffees-:");
			
			//Types of Coffee Available
			System.out.println("1-: Latte");
			System.out.println("2-: Espresso");
			System.out.println("3-: Cappuccino");
			System.out.println("4-: Mocha");
			
			// User should type exit to stop
			System.out.println("Type 'exit' to stop");
			
			//Take the name of the Coffee from the user
			System.out.println("Enter the Coffee Name-:");
			String coffeeName=kb.next();
			
		    // exit condition applied
			if(coffeeName.equalsIgnoreCase("exit")) {
				
				System.out.println("Thank you for visiting the CAFE");
				break;
			}
			
			// User Input Quantity in integer
			System.out.println("Enter Quantity of the Coffee-:");
			
			int quantity=kb.nextInt();
			
			// Price of each coffee will be stored in this
			double price=0.0;
			
			// Making it case-insensitive
			coffeeName=coffeeName.toLowerCase();
			
			switch(coffeeName) {
			
				case "latte":
					price=50;
					break;
				case "espresso":
					price=30;
					break;
				case "cappuccino":
					price=40;
					break;
				case "mocha":
					price=60;
					break;
				default:
					System.out.println("This Coffee is not Available");
					
			}
			
			double totalPrice=price * quantity;
			
			//Gst Calculted
			double totalGst=Gst * totalPrice;
			
			// Total Amount to be paid;
			double totalAmount=totalPrice+totalGst;
			
			
			// Display the Bill
			System.out.println("BILL DETAILS ----:");
			
            System.out.println("Coffee Type-:" + coffeeName);
            
            System.out.println("Quantity   -:" + quantity);
            
            System.out.println("Total      -:" + totalPrice);
            
            System.out.println("GST (18%)  -:" + totalGst);
            
            System.out.println("Final Bill -:" + totalAmount);
            
            System.out.println("--Thank You--");
			
			
				
					
					

		}
		kb.close();
		
		
		
	}
	
	

}
