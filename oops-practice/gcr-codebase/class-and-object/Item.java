package class_and_object;

public class Item {
    String itemCode;
    String itemName;
    double itemPrice;

    //method to display item
    public void displayItem()
    {
        System.out.println("itemCode : " + itemCode);
        System.out.println("itemPrice : " + itemPrice);
        System.out.println("itemName : " + itemName);
    }

    public static void main(String[] args)
    {
        Item i1 = new Item();
        i1.itemCode = "01AA";
        i1.itemName = "Water bottle";
        i1.itemPrice = 500.0;

        Item i2 = new Item();
        i2.itemCode = "01BB";
        i2.itemName = "Rice";
        i2.itemPrice = 700.0;

        Item i3 = new Item();
        i3.itemCode = "02AA";
        i3.itemName = "blackboard";
        i3.itemPrice = 400.0;

        i1.displayItem();
        System.out.println("============");
        i2.displayItem();
        System.out.println("============");
        i3.displayItem();
        System.out.println("============");
    }

	

}
