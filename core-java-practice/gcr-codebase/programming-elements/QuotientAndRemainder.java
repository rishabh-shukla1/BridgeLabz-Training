package programming_elements;
import java .util.*;

public class QuotientAndRemainder {
	 public static void main(String[] args) {

	      
	        Scanner kb = new Scanner(System.in);

	        // first number 
	        System.out.print("Enter the first number: ");
	        
	        int number1 = kb.nextInt();

	        // Take second number
	        
	        System.out.print("Enter the second number:- ");
	        
	        int number2 = kb.nextInt();

	        //  quotient
	        
	        int quotient = number1 / number2;

	        //  remainder 
	        
	        int remainder = number1 % number2;

	        
	        System.out.println("The Quotient is " + quotient +" and Reminder is " + remainder +" of two number " + number1 +
	                           " and " + number2);

	       
	        kb.close();
	    }

	

}
