package control_flow;
import java.util.*;
public class NaturalNumber {
	public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
      // Take Input
        System.out.print("Enter a number: ");
        int number = kb.nextInt();

        // Check for natural number 
        if (number > 0) {

            int sum = number * (number + 1) / 2;

            System.out.println( "The sum of " + number + " natural numbers is " + sum);

        } 
        else {
        	
            System.out.println("The number " + number + " is not a natural number");
        }

      kb.close();
    }

}
