package control_flow;

import java.util.*;

public class GreatestFactorUsingWhile {
	
	public static void main(String[] args) {
   
        Scanner kb = new Scanner(System.in);
        // Take a positive number from the user
        
        System.out.print("Enter a positive integer:-");
       
        int number = kb.nextInt();

        // Check the input greater than 1 or not
        if (number <= 1) {
        	
            System.out.println("Please enter an integer greater than 1-:");
        } 
        else 
        {

            int greatestFact = 1;
            // initialising the counter
            int counter = number - 1;

            while (counter >= 1) {

                if (number % counter == 0) 
                {
                    greatestFact = counter;
                    
                    break;
                }

                counter--;
            }

            System.out.println(
                "Greatest factor of "+ greatestFact);
        }

        kb.close();
    }
	

}
