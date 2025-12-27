package extras;
import java.util.*;

public class NumberGuessingGame
{

	    //Open Scanner
	    static Scanner kb = new Scanner(System.in);
	
	    //method to generate random guess
	    public static int generateGuess()
	    {
	        return (int)(Math.random() * 100) + 1;
	    }
	
	    //method to take user feedback
	    public static String getUserFeedback(int guess)
	    {
	        System.out.print("Is " + guess + " high, low or correct : ");
	        return kb.next();
	    }
	
	    // method to decide next step
	    public static void processFeedback(String feedback)
	    {
	        if (feedback.equalsIgnoreCase("high"))
	            System.out.println("Guess was high");
	        else if (feedback.equalsIgnoreCase("low"))
	            System.out.println("Guess was low");
	        else
	            System.out.println("Guess was correct");
	    }
	
	    public static void main(String[] args)
	    {
	        String feedback = "";
	
	        // Display
	        System.out.println("Think of a number between 1 and 100");
	
	        while (!feedback.equalsIgnoreCase("correct"))
	        {
	            // calling method
	            int guess = generateGuess();
	
	            // calling method
	            feedback = getUserFeedback(guess);
	
	            // calling method
	            processFeedback(feedback);
	        }
	
	        //Display
	        System.out.println("Computer guessed your number");
	
	        //Scanner closed
	        kb.close();
	    }
}
