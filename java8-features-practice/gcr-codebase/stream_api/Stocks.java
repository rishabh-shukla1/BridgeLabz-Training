package stream_api;

import java.util.*;

public class Stocks {
    public static void main(String[] args) {

        List<Double> prices =
            List.of(120.5,130.2,125.0);

        prices.forEach(p -> 
            System.out.println("Price:-"+p));
    }
}
