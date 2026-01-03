package inheritance;

//Superclass
class Book
{
	 String title;
	 int publicationYear;
	
	 Book(String title, int publicationYear)
	 {
	     this.title = title;
	     this.publicationYear = publicationYear;
	 }
}

//Subclass
class Author extends Book
{
	    String name;
	    String bio;

	    Author(String title, int publicationYear, String name, String bio)
	    {
	        super(title, publicationYear);   // call Book constructor
	        this.name = name;
	        this.bio = bio;
	    }

	    void displayInfo()
	    {
	        System.out.println("Book Title      : " + title);
	        System.out.println("Publication Yr : " + publicationYear);
	        System.out.println("Author Name    : " + name);
	        System.out.println("Author Bio     : " + bio);
	    }
}
public class Library {
	
	public static void main(String args[])
	{
		 Author a = new Author("Java Programming", 2024, "James Gosling", "Father of Java");
	     a.displayInfo();
	}

}
