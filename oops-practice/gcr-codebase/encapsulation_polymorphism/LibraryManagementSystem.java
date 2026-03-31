package encapsulation_polymorphism;

interface Reservable
{
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

abstract class LibraryItem
{
    // Encapsulated fields
    private int itemId;
    private String title;
    private String author;
    private String borrowerName;  
    private boolean isAvailable = true;

    // Constructor
    LibraryItem(int itemId, String title, String author)
    {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails()
    {
        System.out.println("Item ID :-" + itemId);
        System.out.println("Title   :-" + title);
        System.out.println("Author  :- " + author);
    }

    //Protected methods for child classes
    protected void setBorrower(String name)
    {
        this.borrowerName = name;
        this.isAvailable = false;
    }

    protected void setAvailable()
    {
        this.borrowerName = null;
        this.isAvailable = true;
    }

    protected boolean isAvailable()
    {
        return isAvailable;
    }
}
class Book extends LibraryItem implements Reservable
{
    Book(int id, String title, String author)
    {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration()
    {
        return 14;   
    }

    @Override
    public void reserveItem(String borrowerName)
    {
        if (isAvailable())
        {
            setBorrower(borrowerName);
            System.out.println("Book reserved for " + borrowerName);
        }
        else
        {
            System.out.println("Book is already reserved");
        }
    }

    @Override
    public boolean checkAvailability()
    {
        return isAvailable();
    }
}

class Magazine extends LibraryItem implements Reservable
{
    Magazine(int id, String title, String author)
    {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration()
    {
        return 7;   // 7 days
    }

    @Override
    public void reserveItem(String borrowerName)
    {
        if (isAvailable())
        {
            setBorrower(borrowerName);
            System.out.println("Magazine reserved for " + borrowerName);
        }
        else
        {
            System.out.println("Magazine is already reserved");
        }
    }

    @Override
    public boolean checkAvailability()
    {
        return isAvailable();
    }
}

class DVD extends LibraryItem implements Reservable
{
    DVD(int id, String title, String author)
    {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration()
    {
        return 3;   
    }

    @Override
    public void reserveItem(String borrowerName)
    {
        if (isAvailable())
        {
            setBorrower(borrowerName);
            System.out.println("DVD reserved for :-" + borrowerName);
        }
        else
        {
            System.out.println("DVD is already reserved");
        }
    }

    @Override
    public boolean checkAvailability()
    {
        return isAvailable();
    }
}



public class LibraryManagementSystem {
	
	public static void main(String[] args)
    {
        LibraryItem i1 = new Book(101, "Java Programming", "James Gosling");
        LibraryItem i2 = new Magazine(102, "Tech Today", "Editorial Team");
        LibraryItem i3 = new DVD(103, "OOP Concepts", "Tech Films");

        LibraryItem[] items = { i1, i2, i3 };

        for (LibraryItem item : items)
        {
            item.getItemDetails();
            System.out.println("Loan Duration :-" + item.getLoanDuration() + " days");

            Reservable r = (Reservable) item;
            System.out.println("Available :-" + r.checkAvailability());

            r.reserveItem("Rishabh");

            System.out.println("----------------------------------");
        }
    }

}
