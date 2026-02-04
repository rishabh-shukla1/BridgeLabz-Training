package stream_api;

import java.util.*;

public class Sensors {
    public static void main(String[] args) {

        List<Integer> readings =
            List.of(40,80,30,90);

        readings.stream()
                .filter(r -> r > 50)
                .forEach(System.out::println);
    }
}
