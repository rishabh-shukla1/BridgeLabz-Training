package stream_api;

import java.util.*;

public class Names {
    public static void main(String[] args) {

        List<String> names = 
            List.of("rahul","anita","mohan");

       names.stream().map(m->m.toUpperCase()).forEach(System.out::println);
    }
}

