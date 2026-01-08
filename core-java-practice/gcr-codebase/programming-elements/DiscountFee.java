package programming_elements;
import java.util.*;
public class DiscountFee {
	public static void main(String[] args) {

        
        Scanner kb = new Scanner(System.in);

        // value fee from the student
        System.out.print("Enter the course fee (INR): ");
        double fee = kb.nextDouble();

        //  discount percentage offered
        System.out.print("Enter the discount percentage: ");
        double disPercent = kb.nextDouble();

        // Calculating 
        double dis = (fee * disPercent) / 100;

        // Calculating the final amount
        double finalfees = fee - dis;

    
        
        System.out.println("The discount amount is INR " + dis +
                           " and final discounted fee is INR " + finalfees);
        
        kb.close();

      
    }

}
