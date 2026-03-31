package control_flow;
import java.util.*;
public class SumUntilZeroUsingWhile {
	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        double total = 0.0;

       //Infinite loop as user can enter as many values as he can
        while (true) {
        	//Input from user
        	System.out.println("Enter Number:-");
            double val =kb.nextDouble();

            // Break if user enters 0 or negative value
            if (val <= 0) {
                break;
            }

            total = total + val;
        }

       
        System.out.println("Total = " + total);

        kb.close();
    }

}
