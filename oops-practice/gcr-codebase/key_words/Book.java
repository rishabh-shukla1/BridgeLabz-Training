package key_words;

public class Book 
{
	 // Static variable
    private static String libraryName = "Egmore Library";

    // Final variable
    private final String isbn;

    private String title;
    private String author;

    // Constructor using this
    Book(String title, String author, String isbn)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method
    public static void displayLibraryName()
    {
        System.out.println("Library Name: " + libraryName);
    }

    // Display using instanceof
    public void display()
    {
        if (this instanceof Book)
        {
            System.out.println("Title:-" + title);
            System.out.println("Author:-" + author);
            System.out.println("ISBN:-" + isbn);
        }
    }

    public static void main(String[] args)
    {
        Book b = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        Book.displayLibraryName();
        b.display();
    }

}
