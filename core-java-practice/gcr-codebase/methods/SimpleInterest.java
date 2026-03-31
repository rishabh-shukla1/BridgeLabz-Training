package methods;
import java.util.*;

public class SimpleInterest
{
	
	public static void main(String[] args) 
	{
        Scanner kb= new Scanner(System.in);
        //User Input Principal
        System.out.print("Enter Principal:-");
        double p = kb.nextDouble();
        //User Input Rate
        System.out.print("Enter Rate:-");
       
        double r = kb.nextDouble();
        //User Input rate
        System.out.print("Enter Time:-");
        
        double t = kb.nextDouble();
        // Function Calling
        double si = findInterest(p, r, t);

        System.out.println("The Simple Interest is " + si +" for Principal " + p + ", Rate of Interest " + r + " and Time " + t);

        kb.close();
    }
    // Function written here of simple interest
	
    public static double findInterest(double principal, double rate, double time)
    {
        return (principal * rate * time) / 100;
    }

}
