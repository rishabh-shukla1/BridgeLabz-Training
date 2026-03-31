package methods;


public class SpringSeason {
	
	 public static void main(String[] args) {

	        // User Input month
	        int month = Integer.parseInt(args[0]);

	        // User Input day
	        int day = Integer.parseInt(args[1]);

	        // calling method
	        boolean result = checkSpringSeason(month, day);

	        // Display
	        if (result)
	            System.out.println("Its a Spring Season");
	        else
	            System.out.println("Not a Spring Season");
	    }

	    // method to check spring season
	    public static boolean checkSpringSeason(int m, int d)
	    {
	        if ((m == 3 && d >= 20) || (m == 4) || (m == 5) || (m == 6 && d <= 20))
	            return true;

	        return false;
	    }

}
