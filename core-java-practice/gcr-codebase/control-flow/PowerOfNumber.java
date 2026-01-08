package control_flow;
import java.util.*;
public class PowerOfNumber {
	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
         // Take input from user
        System.out.print("Enter the base number: ");
        int number =kb.nextInt();
        //Take input from user
        System.out.print("Enter the power: ");
        int pow = kb.nextInt();

        // Check the number is  positive integers
        if (number <= 0 || pow < 0) {
        	
            System.out.println("Please enter a valid positive integers");
        } 
        else {

            int result = 1;
            // calculations
            for (int i = 1; i <= pow; i++) {
            	
                result = result * number;
            }

            System.out.println("Result:- " + result);
        }

        kb.close();
    }

}
