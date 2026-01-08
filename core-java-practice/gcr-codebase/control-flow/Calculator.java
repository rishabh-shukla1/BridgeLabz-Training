package control_flow;
import java.util.*;
public class Calculator {
	public static void main(String[] args) {

        Scanner  kb=new Scanner(System.in);

        // User inputs
        System.out.println("Enter first variable-:");
        double first = kb.nextDouble();
        
        System.out.println("Enter second variable-:");
        double second = kb.nextDouble();
        
        System.out.println("Enter operator");
        String op = kb.next();

        //  switch-case
        switch (op) {

            case "+":
            	
                System.out.println("Result = " + (first + second));
                break;

            case "-":
            	
                System.out.println("Result = " + (first - second));
                break;

            case "*":
            	
                System.out.println("Result = " + (first * second));
                break;

            case "/":
            	
                if (second != 0)
                {
                    System.out.println("Result = " + (first / second));
                } 
                else
                {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            default:
            	
                System.out.println("Invalid Operator");
        }

        kb.close();
    }

}
