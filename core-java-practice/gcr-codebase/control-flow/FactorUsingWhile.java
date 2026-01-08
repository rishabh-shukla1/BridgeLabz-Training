package control_flow;

import java.util.*;
public class FactorUsingWhile {
	
	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
  
        // Take input from user
        System.out.print("Enter a positive integer:-");
        int number = kb.nextInt();

        // check  positive number
        if (number <= 0) {
        	
            System.out.println("Please enter a valid positive integer.");
        }
        
        else {

            System.out.println("Factors of the number are-:");
            //basically c is the counter
            
            int c = 1;

            while (c < number) {

                if (number % c== 0) {
                    System.out.println(c);
                    
                }

                c++;
            }
        }

        kb.close();
    }

}
