package control_flow;

import java.util.*;
public class OddEven {
	
	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a natural number:-");
        
        // limit number by the user
        int l = kb.nextInt();

        // Check for natural number
        if (l <= 0) 
        {
            System.out.println("Please enter number (greater than 0).");
            
        } 
        else {
        	
        	// i is the iterating element for the loop
        	

            for (int i = 1; i <= l; i++) {

                if (i % 2 == 0) {
                	
                    System.out.println(i + " is an Even number");
                    
                } 
                else {
                    System.out.println(i + " is an Odd number");
                }
            }
        }

        kb.close();
    }

}
