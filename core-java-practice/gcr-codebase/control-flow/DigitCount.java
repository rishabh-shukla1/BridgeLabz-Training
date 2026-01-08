package control_flow;
import java.util.*;
public class DigitCount {
	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // Integer input from user
        System.out.println("Enter the number-:");
        
        int num = kb.nextInt();
        
    
        int count = 0;

       
        if (num == 0)
        {
            count = 1;
        }
        else
        {

            
            while (num != 0) {

                // Remove last digit
                num = num / 10;

               
                count++;
            }
        }

        // result
        
        System.out.println("Number of digits -: " + count);

        kb.close();
    }

}
