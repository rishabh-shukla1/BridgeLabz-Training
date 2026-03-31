package extras;
import java.util.*;

public class Calculator 
{
	 //method to add
	
    public static double add(double a, double b)
    {
        return a + b;
    }

    
    //method to subtract
    
    public static double sub(double a, double b)
    {
        return a - b;
    }

    //method to multiply
    
    public static double mul(double a, double b)
    {
        return a * b;
    }

    //method to divide
    public static double div(double a, double b)
    {
        return a / b;
    }

    public static void main(String[] args)
    {
        //Open Scanner
        Scanner kb = new Scanner(System.in);

        // User Input
        System.out.print("Enter two numbers :-");
        
        double a = kb.nextDouble();
        double b = kb.nextDouble();

        System.out.print("Choose operation + - * / :- ");
        char op = kb.next().charAt(0);

        //Display
        if (op == '+')
        {
            System.out.println(add(a, b));
        }
        else if (op == '-')
        {
            System.out.println(sub(a, b));
        }
        else if (op == '*')
        {
            System.out.println(mul(a, b));
        }
        else
        {
            System.out.println(div(a, b));
        }

        //Scanner closed
        kb.close();
    }

}
