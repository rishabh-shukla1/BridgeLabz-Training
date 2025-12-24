package methods;
import java.util.*;

public class SmallestLargest {
	
	 public static void main(String[] args) {

	        //Open Scanner
	        Scanner kb = new Scanner(System.in);

	        //User Input first number
	        System.out.println("Enter first Number:-");
	        int a = kb.nextInt();
	        System.out.println("Enter Second Number:-");
	        //User Input second number
	        int b = kb.nextInt();
	        System.out.println("Enter Third Number:-");
	        //User Input third number
	        int c = kb.nextInt();

	        //calling method
	        int[] result = findSmallestAndLargest(a, b, c);

	        // Display
	        
	        System.out.println("Smallest = " + result[0]);
	        System.out.println("Largest = " + result[1]);

	        //Scanner closed
	        kb.close();
	    }

	    //method to find smallest and largest
	    public static int[] findSmallestAndLargest(int x, int y, int z)
	    {
	        int small = x;
	        int larg = x;

	        if (y < small) small = y;
	        if (z < small) small = z;

	        if (y > larg) larg = y;
	        if (z > larg) larg = z;

	        return new int[]{small, larg};
	    }

}
