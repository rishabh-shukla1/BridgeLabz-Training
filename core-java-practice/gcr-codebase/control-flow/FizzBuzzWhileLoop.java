package control_flow;
import java.util.*;
public class FizzBuzzWhileLoop {
	public static void main(String[] args) {

        Scanner kb= new Scanner(System.in);
        
        // take the limit from the user
        
        System.out.print("Enter a positive integer: ");
        
        int limitnum = kb.nextInt();

        
        if (limitnum <= 0) {
        	
            System.out.println("Please enter positive integer");
        } 
        else {

            int count = 1;

            while (count <= limitnum) {

                if (count % 3 == 0 && count % 5 == 0) {
                	
                    System.out.println("FizzBuzz");
                } 
                else if (count % 3 == 0) {
                	
                    System.out.println("Fizz");
                    
                } 
                else if (count % 5 == 0) {
                	
                    System.out.println("Buzz");
                } 
                else {
                	
                    System.out.println(count);
                }

                count++;
            }
        }

        kb.close();
    }
	

}
