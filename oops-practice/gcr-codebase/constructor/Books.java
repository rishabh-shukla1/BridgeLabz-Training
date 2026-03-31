package constructor;

public class Books
{
		
		private String title;
	    private String author;
	    private double price;
	    private boolean available;
	
	    //Constructor
	    Books(String title, String author, double price) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.available = true;   // book is available when created
	    }
	
	    //Method to borrow a book
	    public void borrowBook() {
	        if (available)
	        {
	            available = false;
	            System.out.println("You have successfully borrowed " + title );
	        } 
	        else {
	            System.out.println("Sorry The book " + title + " is not available.");
	        }
	    }
	
	    // Method to display book details
	    public void display() {
	        System.out.println("Title      :-" + title);
	        System.out.println("Author     :-" + author);
	        System.out.println("Price      :-" + price);
	        System.out.println("Available  :-" + (available ? "Yes" : "No"));
	    }
	
	    public static void main(String[] args)
	    {
	        Books b1 = new Books("Java Basics", "James Gosling", 450);
	
	        b1.display();
	        b1.borrowBook();   
	        b1.borrowBook();   
	    }

}
