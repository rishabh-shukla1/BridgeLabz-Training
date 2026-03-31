package scenario_based;

import java.util.*;

public class FestivalLuckyDraw 
{
	public static void main(String[] args) 
	{

        //Open Scanner
        Scanner kb = new Scanner(System.in);

        String status = "yes";

       
        while (status.equalsIgnoreCase("yes"))
        {
            //User Input number
            System.out.print("Enter your lucky number :-");
            
            int num= kb.nextInt();

            //checking invalid input
            if (num<= 0)
            {
                System.out.println("Invalid number please try again later");
                continue;
            }

           
            if (num % 3 == 0 && num % 5 == 0)
            {
                System.out.println("Congratulations! You won");
            }
            else
            {
                System.out.println("Sorry");
            }

            //asking for next visitor
            System.out.print("Next visitor enter (yes/no) :-");
            
            status = kb.next();
        }

        //Scanner closed
        kb.close();
    }

}
