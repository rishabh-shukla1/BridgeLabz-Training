package functional_interfaces;

interface SecurityUtils {

    static boolean isStrongPassword(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[0-9].*");
    }
}

public class PasswordCheck 
{
    public static void main(String[] args)
    {

        String pwd = "Hello123";

        if (SecurityUtils.isStrongPassword(pwd)) 
        {
            System.out.println("Strong Password");
        }
        else 
        {
            System.out.println("Weak Password");
        }
    }
}

