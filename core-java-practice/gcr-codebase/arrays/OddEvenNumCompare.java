package arrays;
import java.util.*;

public class OddEvenNumCompare {
	
	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

       //  Define Array
        int[] num = new int[5];

        // Take input from the user
        System.out.println("Enter 5 numbers:-");
        
        for (int i = 0; i < num.length; i++) 
        	
        {
            num[i] = kb.nextInt();
        }

        // Number Check
        
       
        for (int i = 0; i < num.length; i++) {

            if (num[i] > 0)
            {
                if (num[i] % 2 == 0) 
                {
                    System.out.println(num[i] + " is Positive and Even");
                } 
                else 
                {
                    System.out.println(num[i] + " is Positive and Odd");
                }
            } 
            else if (num[i] < 0) 
            {
                System.out.println(num[i] + " is Negative");
            } 
            else 
            {
                System.out.println(num[i] + " is Zero");
            }
        }

        // Compare first and last elements of array
        
        
        
        if (num[0]==num[num.length - 1])
        {
            System.out.println("First and last element are equal");
        } 
        else if (num[0] > num[num.length - 1]) 
        {
            System.out.println("First element is greater than last element");
        } 
        else
        {
            System.out.println("First element is less than last element");
        }
        // scanner close
        kb.close();
    }

}
