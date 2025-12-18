package programming_elements;
import java.util.*;

public class BasicCalculator {
	 public static void main(String[] args) {

	        
	        Scanner kb= new Scanner(System.in);

	        // first input
	        System.out.print("Enter first number: ");
	        double number1 = kb.nextDouble();

	        // second number
	        System.out.print("Enter second number: ");
	        double number2 = kb.nextDouble();

	        //addition
	        double add = number1 + number2;
	        //subtraction 
	        double sub = number1 - number2;
	        //multiply
	        double mult = number1 * number2;
	        //divide
	        double div = number1 / number2;

	        
	        System.out.println(
	            "The addition, subtraction, multiplication and division value of 2 numbers "+ number1 + " and " + number2 + " is "
	            + add + ", " + sub + ", " + mult + ", and " + div );
	        
	        kb.close();

	        
	    }
	}
	


