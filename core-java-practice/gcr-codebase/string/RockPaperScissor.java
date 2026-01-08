package string;
import java.util.*;

public class RockPaperScissor {
	
	 public static String getComputerChoice() {
	        int choice = (int) (Math.random() * 3);

	        if (choice == 0)
	            return "Rock";
	        else if (choice == 1)
	            return "Paper";
	        else
	            return "Scissors";
	    }

	    // Find winner between user and computer
	 
	    public static String findWinner(String user, String computer) 
	    {

	        if (user.equals(computer)) 
	        {
	            return "Draw";
	        }

	        if (user.equals("Rock") && computer.equals("Scissors") || user.equals("Paper") && computer.equals("Rock") ||
	            user.equals("Scissors") && computer.equals("Paper"))
	        {
	            return "User";
	        }
	        else {
	            return "Computer";
	        }
	    }

	    //Calculate wins and percentages
	    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) 
	    {

	        String[][] stats = new String[2][3];

	        double userPercent = ((double) userWins / totalGames) * 100;
	        double computerPercent = ((double) computerWins / totalGames) * 100;

	        stats[0][0] = "User";
	        stats[0][1] = String.valueOf(userWins);
	        stats[0][2] = String.format("%.2f", userPercent) + "%";

	        stats[1][0] = "Computer";
	        stats[1][1] = String.valueOf(computerWins);
	        stats[1][2] = String.format("%.2f", computerPercent) + "%";

	        return stats;
	    }

	    //Display game results and final stats
	    public static void displayResults(String[][] gameResults, String[][] stats) {

	        System.out.println("Game\tUser\tComputer\tResult");
	     

	        for (int i = 0; i < gameResults.length; i++) {
	            System.out.println((i + 1) + "\t" +gameResults[i][0] + "\t" +gameResults[i][1] + "\t\t" +
	                    gameResults[i][2]);
	        }

	        System.out.println("Player\tWins\tWinning Percentage");
	

	        for (int i = 0; i < stats.length; i++) {
	            System.out.println(stats[i][0] + "\t" +
	                    stats[i][1] + "\t" +
	                    stats[i][2]);
	        }
	    }

	  
	    public static void main(String[] args) {

	        Scanner kb = new Scanner(System.in);

	        System.out.print("Enter number of games: ");
	        int games = kb.nextInt();

	        String[][] gameResults = new String[games][3];

	        int userWins = 0;
	        int computerWins = 0;

	        for (int i = 0; i < games; i++) {

	            System.out.print("\nGame " + (i + 1) + " - Enter your choice (Rock/Paper/Scissors): ");
	            String userChoice = kb.next();

	            String computerChoice = getComputerChoice();
	            String winner = findWinner(userChoice, computerChoice);

	            if (winner.equals("User"))
	                userWins++;
	            else if (winner.equals("Computer"))
	                computerWins++;

	            gameResults[i][0] = userChoice;
	            gameResults[i][1] = computerChoice;
	            gameResults[i][2] = winner;
	        }

	        String[][] stats = calculateStats(userWins, computerWins, games);

	        displayResults(gameResults, stats);

	        kb.close();
	    }

}
