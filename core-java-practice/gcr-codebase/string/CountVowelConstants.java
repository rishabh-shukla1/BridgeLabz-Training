package string;
import java.util.*;

public class CountVowelConstants 
{
	public static void main(String[] args)
    {
        //Open Scanner
        Scanner kb = new Scanner(System.in);

        // User Input
        System.out.print("Enter a string :-");
        String s = kb.nextLine();

        //Calling method
        int[] result = countVC(s);

        // Display
        
        System.out.println("Number of Vowels     :- " + result[0]);
        System.out.println("Number of Consonants :- " + result[1]);

        //Scanner closed
        kb.close();
    }

    //Method to count vowels and consonants
    public static int[] countVC(String str)
    {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if((ch >= 'A' && ch <= 'Z')||(ch >= 'a' && ch <= 'z'))
            {
                ch = Character.toLowerCase(ch);

                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    vowels++;
                }
                else {
                    consonants++;
                }
            }
        }

        return new int[]{vowels, consonants};
    }

}
