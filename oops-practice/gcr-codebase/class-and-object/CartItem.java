package class_and_object;

public class CartItem 
{
	
		String itemName;
	    double price;
	    int quantity;
	
	    //method to add items
	    public void addItem(int q)
	    {
	        quantity = quantity + q;
	        System.out.println("Added " + q + " of " + itemName + " to the cart.");
	    }
	
	    //method to remove items
	    public void removeItem(int q)
	    {
	        if (quantity >= q)
	        {
	            quantity = quantity - q;
	            System.out.println("Removed " + q + " of " + itemName + " from the cart.");
	        }
	    }
	
	    // method to display total cost
	    public void displayTotal()
	    {
	        double total = price * quantity;
	        System.out.println("Total cost:-" + total);
	    }
	
	    public static void main(String[] args)
	    {
	        CartItem c = new CartItem();
	        c.itemName = "Laptop";
	        c.price = 999.99;
	        c.quantity = 1;
	
	        System.out.println("Item: " + c.itemName + ", Price: $" + c.price + ", Quantity: " + c.quantity);
	
	        c.addItem(2);
	        c.removeItem(1);
	        c.displayTotal();
	    }

}
