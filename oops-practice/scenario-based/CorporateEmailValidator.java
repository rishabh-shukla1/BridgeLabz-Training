package scenario_based;

import java.util.*;
import java.util.regex.*;

public class CorporateEmailValidator {

    static boolean validate(String email) {

        String regex ="^[a-z]{3,}\\.[a-z]{3,}\\d{4,}@(sales|marketing|IT|product)\\.company\\.com$";

        return Pattern.matches(regex, email);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            String email = sc.nextLine();

            if (validate(email))
                System.out.println("Access Granted");
            else
                System.out.println("Access Denied");
        }
    }
}