package genrics;
import java.util.*;

abstract class warehouseItem{
	
	private String name;

     warehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

     abstract String getCategory();
}

//Electonic class

class Electronics extends warehouseItem{

	Electronics(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return "Electronics";
	}
	
}
// Groceries
class Groceries extends warehouseItem {
    public Groceries(String name) {
        super(name);
    }

    @Override
    public String getCategory() {
        return "Groceries";
    }
}

//furniture
class Furniture extends warehouseItem {
    public Furniture(String name) {
        super(name);
    }

    @Override
    public String getCategory() {
        return "Furniture";
    }
}

class storage<T extends warehouseItem>{
	
	List<T> items=new ArrayList<>();
	
	public void addItem(T item) {
		items.add(item);
	}
	
	public List<T> getItem() {
		return items;
	
	}
	
}


class warehouseUtil{
	
	public static void  display(List<? extends warehouseItem> items) {
		
		for(warehouseItem item:items) {
			
			System.out.println(item.getName()+" -category is-"+item.getCategory());
			
		}
		
		
	}
	
}
	
	

public class Warehouse{
	
	public static void main(String[] args) {

        storage<Electronics> electronicsStorage = new storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Mobile"));

        storage<Groceries> groceriesStorage = new storage<>();
        groceriesStorage.addItem(new Groceries("Rice"));
        groceriesStorage.addItem(new Groceries("Milk"));

        System.out.println("Electronics Storage:");
        warehouseUtil.display(electronicsStorage.getItem());

        System.out.println("\nGroceries Storage:");
        warehouseUtil.display(groceriesStorage.getItem());
    }

}
