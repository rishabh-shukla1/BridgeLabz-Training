package control_flow;
import java.util.*;

public class SmallestCheckOfThreeNumber {
	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        //First Number input
        System.out.print("Enter first number:");
        int number1 = kb.nextInt();
        //Second Number input
        System.out.print("Enter second number: ");
        int number2 = kb.nextInt();
        //Third Number Input
        System.out.print("Enter third number: ");
        int number3 = kb.nextInt();

        boolean isFirstSmallest = (number1 < number2) && (number1 < number3);

        System.out.println("Is the first number the smallest? " + isFirstSmallest
        );

        kb.close();
    }

}
