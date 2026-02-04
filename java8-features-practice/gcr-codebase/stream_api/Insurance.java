package stream_api;

import java.util.*;
import java.util.stream.*;

class Claim {
    String type;
    double amount;

    Claim(String t,double a){
        type=t; amount=a;
    }
}

public class Insurance {
    public static void main(String[] args) {

        List<Claim> claims = List.of(
            new Claim("Health",2000),
            new Claim("Health",3000),
            new Claim("Car",5000)
        );
        
        
        Map<String,Double> avg=claims
        							.stream().collect(Collectors.groupingBy(c->c.type,Collectors.averagingDouble(c->c.amount)));
        
        avg.forEach((k,v)->System.out.println(k+" - "+v));
        							
        		

        
    }
}
