package control_flow;
import java.util.*;
public class CheckLargest {
	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        //first input
        System.out.print("Enter first number:-");
        int number1 = kb.nextInt();
        //second input
        System.out.print("Enter second number:-");
        int number2 = kb.nextInt();
        //third input
        System.out.print("Enter third number:-");
        int number3 = kb.nextInt();

        boolean FLargest = (number1 > number2) && (number1 > number3);
        
        boolean SecLargest = (number2 > number1) && (number2 > number3);
        
        boolean TLargest = (number3 > number1) && (number3 > number2);

        System.out.println("Is the first number the largest? " + FLargest);
        
        System.out.println("Is the second number the largest? " + SecLargest);
        
        System.out.println("Is the third number the largest? " + TLargest);

        kb.close();
    }
}
