package extras;

import java.util.*;

public class MaximumThreeNumbers
{
		 //method to take input
	    public static int[] getNumbers(Scanner kb)
	    {
	        int[] num = new int[3];
	
	        System.out.print("Enter first number :-");
	        num[0] = kb.nextInt();
	
	        System.out.print("Enter second number :-");
	        num[1] = kb.nextInt();
	
	        System.out.print("Enter third number :-");
	        num[2] = kb.nextInt();
	
	        return num;
	    }
	
	    //method to find maximum
	    public static int findMaximum(int[] num)
	    {
	        int max = num[0];
	
	        for (int i = 1; i < num.length; i++)
	        {
	            if (num[i] > max)
	                max = num[i];
	        }
	
	        return max;
	    }
	
	    public static void main(String[] args)
	    {
	        //Open Scanner
	        Scanner kb = new Scanner(System.in);
	
	        //calling method
	        int[] val = getNumbers(kb);
	
	        //calling method
	        int max = findMaximum(val);
	
	        // Display
	        System.out.println("Maximum value -:" + max);
	
	        //Scanner closed
	        kb.close();
	    }

}
