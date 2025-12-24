package methods;

public class OtpGenerator 
{
	//otp generated here
	
	 public static int generateOTP()
	    {
	        return (int)(Math.random() * 900000) + 100000;
	    }

	    // method to check uniqueness
	    public static boolean isUnique(int[] a)
	    {
	        for (int i = 0; i < a.length; i++)
	        {
	            for (int j = i + 1; j < a.length; j++)
	            {
	                if (a[i] == a[j])
	                    return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args)
	    {
	        int[] otp = new int[10];

	        // calling method
	        for (int i = 0; i < 10; i++)
	        {
	            otp[i] = generateOTP();
	            
	            System.out.println("OTP " + (i + 1) + " -: " + otp[i]);
	        }

	        // Display
	        System.out.println("All OTPs are unique -: " + isUnique(otp));
	    }

}
