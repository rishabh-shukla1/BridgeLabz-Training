package control_flow;
import java.util.*;

public class RocketLaunchUsingFor {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Taking user input
	        System.out.println("Enter the CountDown-:");
	        int countDown = sc.nextInt();

	        // Countdown using for loop
	        
	        for (int i = countDown; i >= 1; i--) {
	            System.out.println(i);
	        }

	        System.out.println("Launch!");

	        sc.close();
	    }

}
