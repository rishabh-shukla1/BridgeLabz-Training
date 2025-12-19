package control_flow;
import java.util.*;
public class CheckNumberPositiveNegativeZero {
	  public static void main(String[] args) {

	        Scanner kb = new Scanner(System.in);

	        // Taking input from user
	        int number = kb.nextInt();

	        // Checking
	        if (number > 0)
	        {
	            System.out.println("Positive");
	            
	        } 
	        else if (number < 0)
	        {
	            System.out.println("Negative");
	        } 
	        else 
	        {
	            System.out.println("Zero");
	        }

	        kb.close();
	    }

}
