package control_flow;

import java.util.*;
public class FriendSmallestTallest {
	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // Input Amar ages
        
        System.out.print("Enter Amar age: ");
        int amarAge = kb.nextInt();
        
        //Input Akbar age
        
        System.out.print("Enter Akbar age: ");
        int akbarAge = kb.nextInt();
        
        //Input Anthony age
        
        System.out.print("Enter Anthony age: ");
        int anthonyAge = kb.nextInt();

        // Input  Amar heights
        
        System.out.print("Enter Amar height: ");
        int amarHeight = kb.nextInt();
        //Input Akbar height
        
        System.out.print("Enter Akbar height: ");
        int akbarHeight = kb.nextInt();
        // Input anthony height
        
        System.out.print("Enter Anthony height: ");
        int anthonyHeight = kb.nextInt();

        // Find youngest friend
        
        int youngest = amarAge;
        
        String youngestFriend = "Amar";

        if (akbarAge < youngest) {
            youngest = akbarAge;
            youngestFriend = "Akbar";
        }

        if (anthonyAge < youngest) {
            youngest = anthonyAge;
            youngestFriend = "Anthony";
        }

        // Find tallest friend
        
        int tallest = amarHeight;
        String tallestFriend = "Amar";

        if (akbarHeight > tallest) {
        	
            tallest = akbarHeight;
            
            tallestFriend = "Akbar";
        }

        if (anthonyHeight > tallest) {
        	
            tallest = anthonyHeight;
            tallestFriend = "Anthony";
        }

        // printing results
        System.out.println("Youngest Friend: " + youngestFriend + " Age: " + youngest );
        System.out.println("Tallest Friend: " + tallestFriend + " Height: " + tallest );

        kb.close();
    }

}
