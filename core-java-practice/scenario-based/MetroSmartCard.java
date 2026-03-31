package scenario_based;
import java.util.*;

public class MetroSmartCard {
	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter initial smart card balance: ");
        int balance = kb.nextInt();

        while (balance > 0) {

            System.out.print("Enter distance in km  or -1 to quit :-- ");
            int dist = kb.nextInt();

            // Exit condition
            if (dist == -1
            		) {
                break;
            }

            // Fare calculation 
            int fare = (dist <= 5) ? 10 :(dist <= 15) ? 20 : 30;

            // Check balance
            
            if (fare <= balance)
            {
                balance -= fare;
                System.out.println("Fare deducted:		" + fare);
                System.out.println("Remaining balance:	" + balance);
            } 
            else 
            {
                System.out.println("Insufficient balance!");
                break;
            }
        }

        System.out.println("Thank you for using Delhi Metro ");
        //Close scanner 
        
        kb.close();
    }

}
