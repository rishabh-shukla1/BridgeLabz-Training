package methods;
import java.util.*;

public class HandShake {
	 public static void main(String[] args) {

	        // Open Scanner
	        Scanner kb = new Scanner(System.in);

	        // User Input student number
	        System.out.print("Enter number of students : ");
	        int n = kb.nextInt();

	        // calling method 
	        int handshakes = findHandshakes(n);

	        // Display
	        System.out.println("Maximum number of handshakes = " + handshakes);

	        //Scanner closed
	        kb.close();
	    }

	    // method to calculate maximum handshakes
	    public static int findHandshakes(int n)
	    {
	        return (n * (n - 1)) / 2;
	    }

}
