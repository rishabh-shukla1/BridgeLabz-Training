package Regex;

import java.util.*;
public class Username {
	
	public static void main(String args[]) {
		
		
		String regex="^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
		
		String[] usernames = {
	            "user_123",
	            "123user",
	            "us",
	            "valid_user1"
	        };

	        for (String username : usernames) {
	            if (username.matches(regex)) {
	                System.out.println(username + "-: Valid");
	            } else {
	                System.out.println(username + "-: Invalid");
	            }
	        }
		
		
		
	}

}
