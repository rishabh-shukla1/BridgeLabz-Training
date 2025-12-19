package control_flow;
import java.util.*;
public class Divisibilty {
	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        //Input
        
        System.out.print("Enter a number:-");
        
        int number = kb.nextInt();

        boolean isDivisible = (number % 5 == 0);

        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible
        );

        kb.close();

       }
}
