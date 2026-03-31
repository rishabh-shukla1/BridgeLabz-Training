package string;
import java.util.*;

public class NumberFormatString {
	
    static void generateException(String text)
    {
        System.out.println("Generating Exception");
        
        int num = Integer.parseInt(text);
        
        System.out.println("Number:-" + num);
    }

    
    static void handleException(String text)
    {
        System.out.println("Handling Exception-:");
        
        try 
        {
            int num = Integer.parseInt(text);
            System.out.println("Number:-" + num);
            
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException Caught: " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException Caught: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //input as String
        
        System.out.print("Enter a value: ");
        String s = sc.nextLine();

        //generates exception
        generateException(s);

        //handles exception
        handleException(s);

        sc.close();
    }
}