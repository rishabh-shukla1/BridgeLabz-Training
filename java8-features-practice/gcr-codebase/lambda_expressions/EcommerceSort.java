package lambda_expressions;

import java.util.*;

class Product {
    String name;
    double price;
    double rating;

    Product(String n,double p,double r){
        name=n; price=p; rating=r;
    }
}

public class EcommerceSort {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Phone",500,4.5));
        list.add(new Product("Laptop",1000,4.8));
        list.add(new Product("Tablet",300,4.2));
        
        list.sort((a,b)->Double.compare(b.price,a.price));
        
        list.forEach(p ->
        System.out.println(p.name+" "+p.price));
    }
}
