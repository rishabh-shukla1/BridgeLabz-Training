package methods;
import java.util.*;

public class CheckNumber
{
	public static void main(String[] args)
	{

        // Open Scanner
        Scanner kb = new Scanner(System.in);

        //User Input number
        System.out.print("Enter a number : ");
        int num = kb.nextInt();

        //calling method
        int result = findNumberType(num);

        //Display
        System.out.println("Result = " + result);

        //Scanner closed
        kb.close();
    }

    // method to check positive, negative or zero
	
    public static int findNumberType(int n)
    {
        if (n > 0) {
            return 1;
        }
        else if (n < 0) {
            return -1;
        }
        else {
            return 0;
        }
    }

}
