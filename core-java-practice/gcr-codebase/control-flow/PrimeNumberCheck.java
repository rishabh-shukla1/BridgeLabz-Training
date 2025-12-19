package control_flow;

import java.util.*;

public class PrimeNumberCheck {
	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // Take number from user
        System.out.println("Enter a  number-:");
        int number = kb.nextInt();

        boolean isPrime = true;

        // Prime check numbers greater than 1
        if (number <= 1) 
        {
            isPrime = false;
        } 
        else 
        {
            // Check divisibility
        	
            for (int i = 2; i < number; i++) {
            	
                if (number % i == 0) 
                {
                    isPrime = false;
                    
                    break; 
                }
            }
        }

       //result
        if (isPrime)
        {
            System.out.println( "The Number is Prime Number");
        } else {
            System.out.println( "The Number is not a Prime Number");
        }
        

        kb.close();
    }

}
