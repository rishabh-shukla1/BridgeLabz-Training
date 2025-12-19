package control_flow;

import java.util.*;
public class SumNaturalNumberUsingWhile {
	public static void main(String[] args) {

        Scanner kb= new Scanner(System.in);

        // Take user input
        System.out.println("Enter The number of Natural Number-:");
        int n = kb.nextInt();

        // Check if n is a natural number
        if (n <= 0)
        {
            System.out.println("Please enter a natural number");
        } 
        else
        {

            // Sum using while loop
            int sum = 0;
            int i = 1;
            while (i <= n)
            {
                sum = sum+ i;
                
                i++;
            }

            // Sum using formula
            int sumF = n * (n + 1) / 2;

            
            System.out.println("Sum using while loop-: " + sum);
            
            System.out.println("Sum using formula -: " + sumF);

            // Compare 
            if (sum == sumF)
            {
                System.out.println("Both computations are correct");
                
            } 
            else 
            {
                System.out.println("Results do not match");
            }
        }

        kb.close();
    }

}
