package methods;


public class FootballTeam
{
	
	// method to generate random heights
    public static int[] generateHeights()
    {
        int[] height= new int[11];

        for (int i = 0; i < height.length; i++)
        {
        	
            height[i] = (int)(Math.random() * 101) + 150;
        }

        return height;
    }

    //method to find sum
    public static int findSum(int[] arr)
    {
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
            
        }
        return sum;
    }

    //method to find mean
    public static double findMean(int[] arr)
    {
    	
        return (double)findSum(arr) / arr.length;
    }

    //method to find shortest
    public static int findShortest(int[] arr)
    {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] < min) 
            {
                min = arr[i];
            }
        }

        return min;
    }

    //method to find tallest
    public static int findTallest(int[] a)
    {
        int max = a[0];

        for (int i = 1; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }
        }

        return max;
    }

    public static void main(String[] args)
    {
        //calling method
        int[] heights = generateHeights();

        //Display
        System.out.println("Heights of players:- ");
        for (int i = 0; i < heights.length; i++)
        {
            System.out.print(heights[i] + " ");
        }
        System.out.println();
   
        
        System.out.println("Shortest Height-:" + findShortest(heights));
        System.out.println("Tallest Height-:" + findTallest(heights));
        System.out.println("Mean Height-:" + findMean(heights));
    }
	

}
