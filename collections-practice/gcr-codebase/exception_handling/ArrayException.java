package exception_handling;

public class ArrayException {
	
	 public static void main(String[] args) {

	        int[] arr = {10, 20, 30, 40, 50};
	        int index = -1;

	        try {
	            System.out.println("Value at index " + index + ": " + arr[index]);
	        }
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Invalid index!");
	        }
	        catch (NullPointerException e) {
	            System.out.println("Array is not initialized!");
	        }

	    }

}
