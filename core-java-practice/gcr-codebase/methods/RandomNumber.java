package methods;


public class RandomNumber 
{
	  public static void main(String[] args) {

	        // calling method
	        int[] number = generate4DigitRandomArray(5);

	        // Display array
	        for (int i = 0; i < number.length; i++)
	        {
	            System.out.print(number[i] + " ");
	        }
	        System.out.println();

	        // calling method
	        double[] result = findAverageMinMax(number);

	        // Display
	        System.out.println("Average -:" + result[0]);
	        
	        System.out.println("Minimum -:" + result[1]);
	        
	        System.out.println("Maximum -:" + result[2]);
	        
	        
	    }

	    //method to generate 4 digit random numbers
	    public static int[] generate4DigitRandomArray(int size)
	    {
	        int[] arr = new int[size];

	        for (int i = 0; i < size; i++)
	        {
	            arr[i] = (int)(Math.random() * 9000) + 1000;
	        }

	        return arr;
	    }

	    // method to find average, min and max
	    public static double[] findAverageMinMax(int[] num)
	    {
	        int min = num[0];
	        int max = num[0];
	        int sum = 0;

	        for (int i = 0; i < num.length; i++)
	        {
	            sum = sum + num[i];

	            min = Math.min(min, num[i]);
	            
	            max = Math.max(max, num[i]);
	        }

	        double avg = (double) sum / num.length;

	        return new double[]{avg, min, max};
	        
	    }
	}