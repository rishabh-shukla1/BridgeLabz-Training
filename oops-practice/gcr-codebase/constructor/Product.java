package constructor;

public class Product {
	
		  // Instance variables
	    private String productName;
	    private double price;
	
	    //Class variable (static)
	    private static int totalProducts = 0;
	
	    // Constructor
	    Product(String productName, double price)
	    {
	        this.productName = productName;
	        this.price = price;
	        totalProducts++;  
	    }
	
	    //Instance method
	    public void displayProductDetails()
	    {
	        System.out.println("Product Name :-" + productName);
	        System.out.println("Price        :-" + price);
	    }
	
	    // Class method
	    public static void displayTotalProducts() 
	    {
	        System.out.println("Total Products Created :-" + totalProducts);
	    }
	    //Main
	    public static void main(String[] args)
	    {
	        Product p1 = new Product("Laptop", 65000);
	        Product p2 = new Product("Mobile", 30000);
	        Product p3 = new Product("Headphones", 2500);
	
	        System.out.println("Product 1:");
	        p1.displayProductDetails();
	
	        System.out.println("Product 2:");
	        p2.displayProductDetails();
	
	        System.out.println("Product 3:");
	        p3.displayProductDetails();
	
	        System.out.println();
	        Product.displayTotalProducts();   
	    }

}
