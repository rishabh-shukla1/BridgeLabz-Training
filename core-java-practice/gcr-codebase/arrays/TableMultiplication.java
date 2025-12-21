package array;

import java.util.*;
public class TableMultiplication {
	 public static void main(String[] args) {

	        Scanner kb = new Scanner(System.in);

	        //User input
	        
	        System.out.print("Enter a number:-");
	        
	        int num = kb.nextInt();

	        // Define integer array
	        int[] table = new int[10];

	       
	        for (int i = 1; i <= 10; i++)
	        {
	            table[i - 1] = num * i;
	        }

	        // Display the result
	       
	        for (int i = 1; i <= 10; i++)
	        {
	            System.out.println(num + " * " + i + " = " + table[i - 1]);
	        }

	        kb.close();
	    }

}
