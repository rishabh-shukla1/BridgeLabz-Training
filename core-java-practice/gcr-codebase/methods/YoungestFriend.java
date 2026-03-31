package methods;
import java.util.*;

public class YoungestFriend {
	public static void main(String[] args) {

        // Open Scanner
        Scanner kb = new Scanner(System.in);

        // array for age
        int[] age = new int[3];

        // array for height
        double[] height = new double[3];

        // taking age input
        System.out.println("Enter ages of Amar, Akbar and Anthony");
        for (int i = 0; i < 3; i++)
        {
            age[i] = kb.nextInt();
        }

        // taking height input
        System.out.println("Enter heights of Amar, Akbar and Anthony");
        for (int i = 0; i < 3; i++)
        {
            height[i] = kb.nextDouble();
        }

        // calling methods
        int youngest = findYoungest(age);
        int tallest = findTallest(height);

        // Display
        System.out.println("Youngest friend index = " + youngest);
        System.out.println("Tallest friend index = " + tallest);

        // Scanner closed
        kb.close();
    }

    // method to find youngest
    public static int findYoungest(int[] age)
    {
        int minIndex = 0;

        for (int i = 1; i < age.length; i++)
        {
            if (age[i] < age[minIndex])
                minIndex = i;
        }

        return minIndex;
    }

    // method to find tallest
    public static int findTallest(double[] height)
    {
        int maxIndex = 0;

        for (int i = 1; i < height.length; i++)
        {
            if (height[i] > height[maxIndex])
                maxIndex = i;
        }

        return maxIndex;
    }

}
