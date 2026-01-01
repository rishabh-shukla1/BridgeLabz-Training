package constructor;

public class Book {
	
	 private String title;
	    private String author;
	    private double price;

	    //Default constructor
	    Book() {
	        title = "Unknown";
	        author = "Unknown";
	        price = 0;
	    }

	    //Parameterized constructor
	    Book(String title, String author, double price)
	    {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	    }

	    public void display() {
	        System.out.println(title + " -- " + author + "=:" + price);
	    }

}
