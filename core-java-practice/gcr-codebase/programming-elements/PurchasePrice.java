package programming_elements;
import java.util.*;

public class PurchasePrice {
	
	 public static void main(String[] args) {

	       
	        Scanner kb = new Scanner(System.in);

	        // input unit price 
	        System.out.print("Enter the unit price (INR): ");
	        
	        double unitPrice = kb.nextDouble();

	        // input quantity from user
	        
	        System.out.print("Enter the quantity: ");
	        int quantity = kb.nextInt();

	        // Calculating total purchase cost
	        
	        double tPrice = unitPrice * quantity;

	       
	        System.out.println("The total purchase price is INR " + tPrice +" if the quantity " + quantity +
	                           " and unit price is INR " + unitPrice);

	        kb.close();
	    }

}
