package lambda_expressions;

import java.util.*;

class Invoice {
    String id;
    Invoice(String id){
        this.id=id;
    }
}

public class Invoices {
    public static void main(String[] args) {

        List<String> ids =
            List.of("TX1","TX2");

        List<Invoice> invoices =
            ids.stream()
               .map(Invoice::new)
               .toList();

        invoices.forEach(i ->
            System.out.println(i.id));
    }
}
