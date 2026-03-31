package linked_list;

class Node{
	
	String ItemName;
	int ItemId;
	int Qantity;
	int Price;
	Node next;
	
  Node(String itemName, int itemId, int qantity, int price) {
		ItemName = itemName;
		ItemId = itemId;
		Qantity = qantity;
		Price = price;
		this.next=null;
		
	}
}

class  InventoryLinkedList{
	
	Node head;
	
	 public void addFirst(String itemName, int itemId, int qantity, int price) {
		 
		 Node node=new Node(itemName,  itemId,  qantity,  price);
		 
		 node.next=head;
		 head=node;
		 
	 }
	 
	 public void addLast(String itemName, int itemId, int qantity, int price) {
		 
		Node node=new Node(itemName,  itemId,  qantity,  price);
		 
		 if(head==null)
		 {
			 head=node;
			 return ;
		 }
		 
		 Node temp=head;
		 while(temp.next!=null)
		 {
			 temp=temp.next;
			 
		 }
		 
		 temp.next=node; 

	 }
	 
	 void addAtPosition(int pos,String itemName, int itemId, int qantity, int price)
	 {
		 Node node=new Node(itemName,  itemId,  qantity,  price);
		 if(pos==0)
		 {
			 addFirst(itemName,  itemId,  qantity, price);
			 return ;
		 }
		 Node temp=head;
		 
		 for(int i=1;i<pos && temp!=null ;i++) {
			 
			 temp=temp.next;
			 
		 }
		 node.next=temp.next;
		 temp.next=node;
	 }  
	 
	 public void removeId(int id) 
	 {
		 Node temp=head;
		 
		 if(head==null)
		 {
			 System.out.println("Invalid id");
			 return ;
		 }
		 
		 if(head.ItemId==id)
		 {
			 head=head.next;
			 return;
		 }
		 
		 while(temp.next!=null && temp.next.ItemId!=id){
			 
			 temp=temp.next;
			 
		 }
		 
		 temp.next=temp.next.next;
		 System.out.println("Id deleted");
		 
	 }
	 
	 public void update(int id,int q)
	 {
		 
		 Node temp=head;
		 
		 while(temp!=null )
		 {
			 if(temp.ItemId==id ) {
				 
				 temp.Qantity=q;
				 return ;
			 }
			 
			 temp=temp.next;
			 
		 }
		 
	 }
	 
	 public void search(int id, String name)
	 {
		 
		 Node temp=head;
		 
		 while(temp!=null )
		 {
			 if(temp.ItemId==id || temp.ItemName==name ) {
				 
				 display(temp);
				 return ;
			 }
			 
			 temp=temp.next;
			 
		 }
		 
	 }
	 
	 public void sortByPrice() {
		 
		 Node i,j;
		 
		 for(i=head;i!=null ;i=i.next) {
			 
			 for(j=i.next;j!=null ;j=j.next) {
				 
				 if(i.Price>j.Price) {
					 swap(i,j);
				 }
				 
			 }
		}
	 }
	 
	 public void sortByName() {
		 
  Node i,j;
		 
		 for(i=head;i!=null ;i=i.next) {
			 
			 for(j=i.next;j!=null ;j=j.next) {
				 
				 if(i.ItemName.compareTo(j.ItemName)>0) {
					 swap(i,j);
				 }
				 
			 }
		}
		 
	 }
	 
	 public void swap(Node a,Node b) {
		 
		 String name = a.ItemName;
	        int id = a.ItemId;
	        int q = a.Qantity;
	        int p = a.Price;

	        a.ItemName = b.ItemName;
	        a.ItemId = b.ItemId;
	        a.Qantity = b.Qantity;
	        a.Price = b.Price;

	        b.ItemName = name;
	        b.ItemId = id;
	        b.Qantity = q;
	        b.Price = p;
		 
	 }
	 
	 public void display(Node t) {
		 
		 System.out.println("Id:-"+t.ItemId);
		 System.out.println("Name:-"+t.ItemName);
		 System.out.println("Price :-"+t.Price);
		 System.out.println("Qnatitiy:-"+t.Qantity);
		 System.out.println("total value of inventory :-"+(t.Price*t.Qantity));
		  
	 }
	 
	 
	 
	 
	
	
	
	
}


public class InventoryManagementSystem {
	 public static void main(String[] args) {

	        InventoryLinkedList list = new InventoryLinkedList();

	        // Adding items
	        list.addLast("Pen", 101, 50, 10);
	        list.addLast("Book", 102, 20, 100);
	        list.addLast("Bag", 103, 10, 500);
	        list.addFirst("Pencil", 104, 100, 5);
	        list.addAtPosition(2, "Notebook", 105, 30, 60);

	        System.out.println("----- Search Item -----");
	        list.search(103, "");

	        System.out.println("----- Update Quantity -----");
	        list.update(102, 40);
	        list.search(102, "");

	        System.out.println("----- Sort By Price -----");
	        list.sortByPrice();
	        list.search(101, "");
	        list.search(102, "");
	        list.search(103, "");
	        list.search(104, "");
	        list.search(105, "");

	        System.out.println("----- Sort By Name -----");
	        list.sortByName();
	        list.search(101, "");
	        list.search(102, "");
	        list.search(103, "");
	        list.search(104, "");
	        list.search(105, "");

	        System.out.println("----- Remove Item -----");
	        list.removeId(103);
	        list.search(103, "");

	    }

}
