package lambda_expressions;

import java.util.*;

public class Uppercase {
    public static void main(String[] args) {

        List<String> names =
            List.of("rahul","anita");

        names.stream().map(a->a.toUpperCase()).forEach(System.out::println);
    }
}
