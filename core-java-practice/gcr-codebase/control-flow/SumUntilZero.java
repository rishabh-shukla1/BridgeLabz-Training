package control_flow;
import java.util.*;
public class SumUntilZero {
	
	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

       
        double total = 0.0;

        //  first input
        System.out.println("Enter the Value-:");
        
        double value = kb.nextDouble();

        // Calculation
        while (value != 0) {
        	
            total = total + value;
            
            value = kb.nextDouble();
        }

      
        System.out.println("Total = " + total);
        

        kb.close();
    }

}
