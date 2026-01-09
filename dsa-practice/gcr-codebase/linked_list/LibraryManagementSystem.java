package linked_list;

class LibNode{
	String bookTitle;
	String author;
	int bookId;
	boolean available;
	
	LibNode next;
	LibNode prev;
    LibNode(String bookTitle, String author, int bookId, boolean available) {
	
		this.bookTitle = bookTitle;
		this.author = author;
		this.bookId = bookId;
		this.available = available;
		this.next=null;
		this.prev=null;
	}
	
}
  
class LibraryLinkedList{
	
	LibNode head;
	LibNode tail;
	public void addFirst(String bookTitle, String author, int bookId, boolean available) {
		
		linked_list.LibNode node=new LibNode( bookTitle, author, bookId, available);
		if(head==null)
		{
			head=tail=node;
			return;
			
		}
		
		node.next=head;
		head.prev=node;
		head=node;
		
	
	}
	
	public void addLast(String bookTitle, String author, int bookId, boolean available)
	{
		LibNode node=new LibNode( bookTitle, author, bookId, available);
		
		if(tail==null)
		{
			head=tail=node;
			return ;	
		}
		
		tail.next=node;
		node.prev=tail;
		tail=node;
	}
	
	public void addAtPosition(int pos,String bookTitle, String author, int bookId, boolean available) {
		
		LibNode node=new LibNode( bookTitle, author, bookId, available);
		if(pos==0)
		{
			addFirst( bookTitle, author, bookId, available);
			return ;

		}
		
		LibNode temp=head;
		
		for(int i=1;i<pos && temp!=null ;i++)
		{
			temp=temp.next;
			
		}
		node.next=temp.next;
		node.next.prev=node;
		temp.next=node;
		node.prev=temp;

	}
	
	public void removeById(int id)
	{
		LibNode temp=head;
		
		if(head==null)
		{
			System.out.println("Empty Linked list");
			return;
		}
		if(head.bookId==id) {
			head=head.next;
			if(head.prev!=null)
			head.prev=null;
			
			System.out.println("Book removed");
			return;
		}
			
		
		while(temp.next!=null && temp.next.bookId!=id) {
			
			temp=temp.next;
			
		}
		if(temp.next==null) {
			System.out.println("Book not found");
			return ;
		}
		
		if(temp.next.next==null) {
			temp.next=null;
		}
		else 
		{
		temp.next=temp.next.next;
		temp.next.next.prev=temp;
		}
		
	}
	
	
	public void search(String title, String author) {

        LibNode temp = head;

        while (temp != null) {
            if (temp.bookTitle.equalsIgnoreCase(title) || temp.author.equalsIgnoreCase(author)) {
                display(temp);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    
    public void updateAvailability(int id, boolean status) {

        LibNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                temp.available = status;
                System.out.println("Availability updated");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

   
    public void display(LibNode b) {

        System.out.println("ID: " + b.bookId);
        System.out.println("Title: " + b.bookTitle);
        System.out.println("Author: " + b.author);
        System.out.println("Available: " + b.available);
        System.out.println("-------------------------");
    }

   
    public void displayForward() {

        LibNode temp = head;

        while (temp != null) {
            display(temp);
            temp = temp.next;
        }
    }

   
    public void displayReverse() {

        LibNode temp = tail;

        while (temp != null) {
            display(temp);
            temp = temp.prev;
        }
    }
    
    public void countBooks() {

        int count = 0;
        LibNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total Books = " + count);
    }
	
	
}

public class LibraryManagementSystem {
	
	public static void main(String[] args)
	
	{

        LibraryLinkedList lib = new LibraryLinkedList();

        lib.addLast("Java", "James", 101, true);
        lib.addLast("Python", "Guido", 102, false);
        lib.addFirst("C++", "Bjarne", 103, true);
        lib.addAtPosition(1, "DSA", "Narasimha", 104, true);

        System.out.println("---- Forward ----");
        lib.displayForward();

        System.out.println("---- Reverse ----");
        lib.displayReverse();

        System.out.println("---- Search ----");
        lib.search("Java", "");

        System.out.println("---- Update ----");
        lib.updateAvailability(102, true);
        lib.search("", "Guido");

        System.out.println("---- Remove ----");
        lib.removeById(103);
        lib.displayForward();

        lib.countBooks();
    }

}
