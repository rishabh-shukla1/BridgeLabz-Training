package class_and_object;

public class PalindromeChecker
{
	
	    String text;
		
	    //method to check palindrome
	    public boolean isPalindrome()
	    {
	        String clean = text.replaceAll(" ", "").toLowerCase();
	        String r= "";
	
	        for (int i = clean.length() - 1; i >= 0; i--)
	        {
	            r = r + clean.charAt(i);
	        }
	
	        if (clean.equals(r)) {
	            return true;
	        }
	        else {
	            return false;
	        }
	    }
	
	    // method to display result
	    public void displayResult()
	    {
	        if (isPalindrome())
	            System.out.println(text + " is palindrome");
	        else
	            System.out.println(text + " is not Palindrome");
	    }
	
	    public static void main(String[] args)
	    {
	        PalindromeChecker p1 = new PalindromeChecker();
	        p1.text = "A man a plan a canal Panama";
	
	        PalindromeChecker p2 = new PalindromeChecker();
	        p2.text = "Hello";
	
	        p1.displayResult();
	        p2.displayResult();
	    }
			

}
