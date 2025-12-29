package scenario_based;

import java.util.*;

public class MovieApp
{
	public static void main(String[] args) {
        //Open scanner
		
        Scanner kb = new Scanner(System.in);
        char choice;

        do {
            System.out.println(" Movie Ticket Booking --:");
            //Taking user inputs
            
            System.out.print("Enter movie type\n1-Action\n2-Comedy\n13-Drama:- ");
            int type = kb.nextInt();

            System.out.print("Enter seat type\n1-Gold\n2-Silver :- ");
            int seat = kb.nextInt();

            System.out.print("Do you want snacks then enter\n1-Yes\n2-No:- ");
            int snack =kb.nextInt();

            int total = 0;

            // Movie price using switch
            switch (type) {
                case 1:
                    total += 200;
                    break;
                case 2:
                    total += 150;
                    break;
                case 3:
                    total += 180;
                    break;
                default:
                    System.out.println("Invalid movie type!");
            }

            //Seat price using if
            if (seat == 1) 
            {
                
            	total += 100;
            } 
            else if (seat == 2)
            {
                total += 50;
            } 
            else
            {
                System.out.println("Invalid seat type!");
            }

            //Snacks price add
            if (snack== 1)
            {
                total += 80;
            }
            //Display
            
            System.out.println("Total Ticket Price = ₹" + total);

            System.out.println("Book ticket for another customer enter (y/n):-");
            
            choice = kb.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
        
        //Scanner closed
        
        kb.close();
    }

}
