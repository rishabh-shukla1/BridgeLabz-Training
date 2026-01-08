package methods;
import java.util.*;

public class YoungTallestFriend
{
	
	 public static void main(String[] args) {

	        //Open Scanner
	        Scanner kb = new Scanner(System.in);
	        String name[]= {"Amar" , "Akbar" ,"Anthony"};

	        //array for age
	        int[] age = new int[3];

	        //array for height
	        double[] height = new double[3];

	        //taking age input
	        System.out.println("Enter ages of Amar, Akbar and Anthony");
	        
	        for (int i = 0; i < 3; i++)
	        {
	            age[i] = kb.nextInt();
	        }

	        // taking height input
	        
	        System.out.println("Enter heights of Amar, Akbar and Anthony");
	        for (int i = 0; i < 3; i++)
	        {
	            height[i] = kb.nextDouble();
	        }

	        // calling methods
	        int young = findYoungest(age);
	        
	        int tall = findTallest(height);

	        // Display
	        System.out.println("Youngest friend index -:" + name[young] );
	        System.out.println("Tallest friend index -: " + name[tall]);

	        //Scanner closed
	        kb.close();
	    }

	    //method to find youngest
	 
	    public static int findYoungest(int[] age)
	    {
	        int minInd = 0;

	        for (int i = 1; i < age.length; i++)
	        {
	            if (age[i]< age[minInd])
	            {
	                minInd= i;
	            }
	        }

	        return minInd;
	    }

	    //method to find tallest
	    public static int findTallest(double[] height)
	    {
	        int maxInd = 0;

	        for (int i = 1; i< height.length; i++)
	        {
	            if (height[i]> height[maxInd])
	            {
	                maxInd= i;
	            }
	        }

	        return maxInd;
	    }

}
