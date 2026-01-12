package scenario_based.ECommerceOrderManagementSystem;

public class Product {
	
	private int productId;
	private String name;
	private double price;
	
	 Product(int productId, String name, double price) {
		
		this.productId = productId;
		this.name = name;
		this.price = price;
	}

	 public int getProductId() {
		 return productId;
	 }

	 public double getPrice() {
		 return price;
	 }

	 public void setPrice(double price) {
		 this.price = price;
	 }
	 
	 void displayProduct() {
		 
		 System.out.println("ProductId	:-" +productId);
		 System.out.println("Name		:-"+ name);
		  System.out.println("Price		:-"+ price);
		 
	 }
	 
}
