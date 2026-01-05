package encapsulation_polymorphism;

interface Taxable{
	
	double calculateTax();
	String getTaxDetails();
	
}

abstract class Product{
	
	private int productId;
	private String name;
	private double price;
	
	Product(int productId, String name , double price){
		this.productId=productId;
		this.name=name;
		setPrice(price);
		
	}
	
	public abstract double calculateDiscount();
	
	public double getPrice() {
		
		return price;
	}
	
	public void setPrice(double price) {
		
		if(price>0)
		{
			this.price=price;
			
		}
		else {
			
			System.out.println("Invalid");
		}
		
		
	}
	
	public String getName() {
		
		return name;
	}
	
	
	 // Concrete method
    public void display()
    {
        System.out.println("Product ID :- " + productId);
        System.out.println("Name       :- " + name);
        System.out.println("Price      :- " + price);
    }


	
	
	
	
}
class Electronics extends Product implements Taxable{

	Electronics(int productId, String name, double price) {
		super(productId, name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateTax() {
		// TODO Auto-generated method stub
		 return getPrice() * 0.18; 
	}

	@Override
	public String getTaxDetails() {
		// TODO Auto-generated method stub
		return "Electronics Tax: 18% GST";
	}

	@Override
	public double calculateDiscount() {
		// TODO Auto-generated method stub
		return getPrice() * 0.10;   // 10% discount
	}

	
	
}

class Clothing extends Product implements Taxable{

	Clothing(int productId, String name, double price) {
		super(productId, name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateTax() {
		// TODO Auto-generated method stub
		return getPrice() * 0.05;   // 5% GST
	}

	@Override
	public String getTaxDetails() {
		// TODO Auto-generated method stub
		 return "Clothing Tax: 5% GST";
	}

	@Override
	public double calculateDiscount() {
		// TODO Auto-generated method stub
		return getPrice() * 0.20;   // 20% discount
	}
	
}
class Groceries extends Product
{
    public Groceries(int id, String name, double price)
    {
        super(id, name, price);
    }

    public double calculateDiscount()
    {
        return getPrice() * 0.05;   // 5% discount
    }
}
public class EcommercePlatform 
{
	
	public static void main(String[] args)
    {
        Product p1 = new Electronics(101, "Laptop", 60000);
        Product p2 = new Clothing(102, "Jacket", 4000);
        Product p3 = new Groceries(103, "Rice", 1200);

        Product[] products = { p1, p2, p3 };

        for (Product p : products)
        {
            calculateFinalPrice(p);
            System.out.println("----------------------------");
        }
    }
	// Polymorphic method
    public static void calculateFinalPrice(Product p)
    {
        double price = p.getPrice();
        double discount = p.calculateDiscount();
        double tax = 0;

        if (p instanceof Taxable)
        {
            Taxable t = (Taxable) p;
            tax = t.calculateTax();
            System.out.println(t.getTaxDetails());
        }
        else
        {
            System.out.println("No tax applicable");
        }

        double finalPrice = price + tax - discount;

        p.display();
        System.out.println("Discount :- " + discount);
        System.out.println("Tax      :- " + tax);
        System.out.println("Final Price :- " + finalPrice);
    }

}
