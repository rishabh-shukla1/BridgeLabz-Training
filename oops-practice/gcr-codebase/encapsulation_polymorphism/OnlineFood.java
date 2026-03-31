package encapsulation_polymorphism;

interface Discountable
{
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem
{
    // Encapsulated fields
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    FoodItem(String itemName, double price, int quantity)
    {
        this.itemName = itemName;
        setPrice(price);
        setQuantity(quantity);
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails()
    {
        System.out.println("Item Name :- " + itemName);
        System.out.println("Price     :- " + price);
        System.out.println("Quantity  :- " + quantity);
    }

    // Getters
    public double getPrice()
    {
        return price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    // Setters with validation
    public void setPrice(double price)
    {
        if (price > 0)
        {
            this.price = price;
        }
        else
        {
            System.out.println("Invalid Price");
        }
    }

    public void setQuantity(int quantity)
    {
        if (quantity > 0)
        {
            this.quantity = quantity;
        }
        else
        {
            System.out.println("Invalid Quantity");
        }
    }
}
class VegItem extends FoodItem implements Discountable
{
    VegItem(String name, double price, int qty)
    {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice()
    {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount()
    {
        return calculateTotalPrice() * 0.10;   // 10% discount
    }

    @Override
    public String getDiscountDetails()
    {
        return "Veg Item Discount 10%";
    }
}
class NonVegItem extends FoodItem implements Discountable
{
    NonVegItem(String name, double price, int qty)
    {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice()
    {
        double base = getPrice() * getQuantity();
        return base + 50;   
    }

    @Override
    public double applyDiscount()
    {
        return calculateTotalPrice() * 0.05;   
    }

    @Override
    public String getDiscountDetails()
    {
        return "Non-Veg Item Discount : 5%";
    }
}

public class OnlineFood
{
    public static void main(String[] args)
    {
        FoodItem f1 = new VegItem("Paneer Pizza", 300, 2);
        FoodItem f2 = new NonVegItem("Chicken Burger", 250, 3);

        FoodItem[] order = { f1, f2 };

        for (FoodItem item : order)
        {
            processOrder(item);
            System.out.println("================");
        }
    }

    public static void processOrder(FoodItem item)
    {
        double total = item.calculateTotalPrice();
        double discount = 0;

        if (item instanceof Discountable)
        {
            Discountable d = (Discountable) item;
            discount = d.applyDiscount();
            System.out.println(d.getDiscountDetails());
        }

        item.getItemDetails();
        System.out.println("Total Price   :- " + total);
        System.out.println("Discount      :- " + discount);
        System.out.println("Final Amount  :- " + (total - discount));
    }
}
