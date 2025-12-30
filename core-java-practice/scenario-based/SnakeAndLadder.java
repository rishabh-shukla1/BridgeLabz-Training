package scenario_based;

import java.util.*;

public class SnakeAndLadder 
{
	 public static void main(String[] args) 
	    {
	        Random random = new Random();

	        // UC-1   ->1 or 2
	        int turn = random.nextInt(2) + 1;  
	        int diceCount[] = new int[2];
	        int totalCount[] = new int[2];

	        System.out.println("Snake and Ladder Game Started");

	        // UC-2,3,4,5,6,7
	        while (totalCount[0] < 100 && totalCount[1] < 100)
	        {
	            // UC-2
	            int dice = random.nextInt(6) + 1;

	            // UC-3
	            // 0=No Play, 1=Ladder, 2=Snake
	            int option = random.nextInt(3);   

	            diceCount[turn - 1]++;

	            System.out.println("Player " + turn + " rolling the dice :- " + dice);

	            if (option == 0)
	            {
	                System.out.println("No Play");
	            }
	            else if (option == 1)
	            {
	                System.out.println("Ladder");
	                totalCount[turn - 1] += dice;
	            }
	            else
	            {
	                System.out.println("Snake");
	                totalCount[turn - 1] -= dice;
	            }

	            //UC-4
	            if (totalCount[turn - 1] < 0)
	            {
	                totalCount[turn - 1] = 0;
	            }

	            //UC-5
	            if (totalCount[turn - 1] > 100)
	            {
	                totalCount[turn - 1] -= dice;
	            }

	            System.out.println("Player " + turn + " Position :-> " + totalCount[turn - 1]);

	            // extra turn on ladder
	            if (option != 1 && turn == 1)
	            {
	                turn = 2;
	            }
	            else if (option != 1 && turn == 2)
	            {
	                turn = 1;
	            }
	        }

	        
            //UC 6,7
	        if (totalCount[0] == 100)
	        {
	            System.out.println("Player 1 Won the Game");
	        }
	        else
	        {
	            System.out.println("Player 2 Won the Game");
	        }

	        System.out.println("Player 1 Dice Count :-> " + diceCount[0]);
	        System.out.println("Player 2 Dice Count :-> " + diceCount[1]);
	    }

}
