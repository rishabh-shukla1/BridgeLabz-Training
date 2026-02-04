package stream_api;

import java.util.*;

public class Emails {
    static void sendEmailNotification(String email){
        System.out.println("Sent to "+email);
    }

    public static void main(String[] args) {

        List<String> emails =
            List.of("a@gmail.com","b@gmail.com");

        emails.forEach(
            Emails::sendEmailNotification);
    }
}
