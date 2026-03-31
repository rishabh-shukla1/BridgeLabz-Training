package control_flow;
import java.util.Scanner;
public class AbundantNumberCheck {
	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // User integer input
        System.out.println("Enter Number-:");
        
        int number =kb.nextInt();

        
        int sum = 0;

        
        for (int i = 1; i < number; i++) 
        {
        	//calculation 
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        // Check Abundant condition
        if (sum > number)
        {
            System.out.println(number + " is an Abundant Number");
        } 
        else
        {
            System.out.println(number + " is not an Abundant Number");
        }

        kb.close();
    }

}
