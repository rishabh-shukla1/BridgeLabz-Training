package string;

public class NullPointerExceptionProgram {


	public static void generateException()
	{
        String text = null;   
        
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleException()
    {
        String text = null;   

        try {
     
            System.out.println(text.length());
        } 
        catch (NullPointerException e)
        {
            System.out.println("NullPointerException handled successfully");
            System.out.println("Error message:-" + e);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Calling method to generate exception:");
        // This will cause runtime exception


        System.out.println("Calling method to handle exception:");
        handleException();
    }
}


