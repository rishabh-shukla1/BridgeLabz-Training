package control_flow;

import java.util.*;
public class RocketLaunch {
	public static void main(String args[]) {
	Scanner kb = new Scanner(System.in);

    // Taking user input
	System.out.println("Enter the countdown-:");
    int count = kb.nextInt();

    // Count using while loop
    while (count >= 1) {
    	
        System.out.println(count);
        
        count--;
    }

    

    kb.close();
}

}
