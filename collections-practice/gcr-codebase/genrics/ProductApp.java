package genrics;
import java.util.*;
	
interface category{
	
	String getCategory();
}

class books implements category{

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return "book";
	}
	
}

class clothing implements category{

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return "clothes";
	}
	
}

class gadget implements category{

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return "gadget";
	}
	
}

class product<T extends category>{
	
	String name ;
	int price;
	T categoty;
	
	public product(String name, int price, T categoty) {
		this.name = name;
		this.price = price;
		this.categoty = categoty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public T getCategoty() {
		return categoty;
	}

	public void setCategoty(T categoty) {
		this.categoty = categoty;
	}
	
	
}

class Discount{
	
	public static <T extends product<?>> void discunt(T prod,int percent) {
		
		int dis=(prod.getPrice()*percent)/100;
		
		prod.setPrice(prod.getPrice()-dis);
		
		System.out.println(prod.getName()+"-new price=:"+prod.getPrice());
		
		
		
		
		
	}
	
}

class ProductCatalog{
	
	  private List<product<? extends category>> products=new ArrayList<>();
	  
	  public void add(product<? extends category> p) {
		  
		  products.add(p);
		  
	  }
	  
	  public  void  show(List<product<? extends category>> p)
	  {
		  for(product<? extends category> prod:p ) {
			  
			  System.out.println(prod.getName()+ "-category-:"+prod.getCategoty()+"-price-:"+prod.getPrice());
			  
		  }
		  
	  }
	
}

public class ProductApp {
	
	public static void main(String[] args) {

        // Create category objects
        books bookCategory = new books();
        clothing clothingCategory = new clothing();
        gadget gadgetCategory = new gadget();

        // Create products with type-safe categories
        product<books> book =
                new product<>("Java Book", 500, bookCategory);

        product<clothing> shirt =
                new product<>("T-Shirt", 1200, clothingCategory);

        product<gadget> phone =
                new product<>("Smart Phone", 20000, gadgetCategory);

        // Apply discounts (generic method)
        Discount.discunt(book, 10);
        Discount.discunt(phone, 5);

        // Create product catalog and add different product types
        ProductCatalog catalog = new ProductCatalog();
        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);

        // Display all products
        System.out.println("\nProduct Catalog:");
        catalog.show(Arrays.asList(book, shirt, phone));
    }

}
