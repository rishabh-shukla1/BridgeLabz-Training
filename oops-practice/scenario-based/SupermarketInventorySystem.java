package scenario_based;

import java.util.*;

abstract class Product {

    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    abstract void display();

    double totalValue() {
        return price * quantity;
    }
}

class Electronics extends Product {

    int warranty;

    Electronics(String name, double price, int quantity, int warranty) {
        super(name, price, quantity);
        this.warranty = warranty;
    }

    void display() {
        System.out.println(name + " - Price: " + price +
                ", Quantity: " + quantity +
                ", Warranty: " + warranty + " months");
    }
}

class Clothing extends Product {

    String size;

    Clothing(String name, double price, int quantity, String size) {
        super(name, price, quantity);
        this.size = size;
    }

    void display() {
        System.out.println(name + " - Price: " + price +
                ", Quantity: " + quantity +
                ", Size: " + size);
    }
}

public class SupermarketInventorySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        List<Product> inventory = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();

            if(line.trim().isEmpty()){
                i--;
                continue;
            }

            String[] parts = line.split(", ");

            if (parts[0].equals("Electronics")) {

                Product p = new Electronics(
                        parts[1],
                        Double.parseDouble(parts[2]),
                        Integer.parseInt(parts[3]),
                        Integer.parseInt(parts[4])
                );

                inventory.add(p);
                System.out.println("Product added to inventory: " + parts[1]);
            }

            else if (parts[0].equals("Clothing")) {

                Product p = new Clothing(
                        parts[1],
                        Double.parseDouble(parts[2]),
                        Integer.parseInt(parts[3]),
                        parts[4]
                );

                inventory.add(p);
                System.out.println("Product added to inventory: " + parts[1]);
            }
        }

        System.out.println("Inventory:");

        double total = 0;

        for (Product p : inventory) {
            p.display();
            total += p.totalValue();
        }

        System.out.printf("Total value of the inventory: %.2f", total);
    }
}