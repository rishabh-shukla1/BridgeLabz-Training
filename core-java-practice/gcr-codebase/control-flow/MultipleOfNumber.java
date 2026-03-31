package control_flow;

import java.util.Scanner;

public class MultipleOfNumber {
	
	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        //UserInput
        System.out.print("Enter a positive number less than 100:-");
        
        int number = kb.nextInt();

        // Check input
        if (number <= 0 || number >= 100) {
        	
            System.out.println("Please enter a positive number less than 100");
            
        } 
        else {

            int c = number - 1;

            while (c > 1) {

                if (number % c == 0)
                {
                    System.out.println(c);
                }

                c--;
            }
        }

        kb.close();
    }

}
