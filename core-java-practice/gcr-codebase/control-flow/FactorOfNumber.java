package control_flow;
import java.util.*;
public class FactorOfNumber {
	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        //  Take input from user
        System.out.print("Enter a positive integer: ");
        
        int number = kb.nextInt();

        // Check for positive integer
        if (number <= 0) {
        	
            System.out.println("Please enter a positive integer");
        } 
        // if the n
        else {

            System.out.println("Factors are:-");

            for (int div = 1; div < number; div++) {
              // applied suitable formula as given
                if (number % div == 0) {
                	
                    System.out.println(div);
                }
            }
        }

        kb.close();
    }

}
