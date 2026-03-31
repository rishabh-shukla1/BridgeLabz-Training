package stream_api;

import java.util.*;

public class Welcome {
    public static void main(String[] args) {

        List<String> users =
            List.of("Ravi","Anu");

        users.forEach(u -> 
            System.out.println("Welcome "+u));
    }
}

