package control_flow;
import java.util.*;
public class MutpilicationTable {
	
	public static void main(String[] args) {

        Scanner kb= new Scanner(System.in);
        // enter input from the user
        
        System.out.print("Enter a number: ");
        
        int number =kb.nextInt();

        for (int i = 6; i <= 9; i++) {
        	
            int result = number * i;
            
            System.out.println(number + " * " + i + " = " + result);
        }

       kb.close();
    }

}
