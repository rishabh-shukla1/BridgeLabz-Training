package linked_list;

class MovieNode
{
    String title;
    String director;
    int year;
    double rating;

    MovieNode next;
    MovieNode prev;

    MovieNode(String title, String director, int year, double rating)
    {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;

        this.next = null;
        this.prev = null;
    }
}

class MovieDoublyLinkedList
{
    MovieNode head;
    MovieNode tail;

    // Add at Beginning
    void addBegining(String title, String director, int year, double rating)
    {
        MovieNode node = new MovieNode(title, director, year, rating);

        if (head == null)
        {
            head = tail = node;
        }
        else
        {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    // Add at End
    void addEnd(String title, String director, int year, double rating)
    {
        MovieNode node = new MovieNode(title, director, year, rating);

        if (head == null)
        {
            head = tail = node;
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    // Add at Position
    void addAtPosition(int pos, String title, String director, int year, double rating)
    {
        if (pos == 0)
        {
            addBegining(title, director, year, rating);
            return;
        }

        MovieNode node = new MovieNode(title, director, year, rating);
        MovieNode temp = head;

        for (int i = 1; i < pos && temp != null; i++)
        {
            temp = temp.next;
        }

        if (temp == null)
        {
            System.out.println("Position out of range");
            return;
        }

        // if inserting at beginning (position 1)
        if (temp == head)
        {
            node.next = head;
            head.prev = node;
            head = node;
            return;
        }

        node.next = temp;
        node.prev = temp.prev;

        temp.prev.next = node;
        temp.prev = node;
    }

    // Delete by Movie Title
    void deleteByTitle(String title)
    {
        if (head == null)
        {
            System.out.println("List is empty");
            return;
        }

        MovieNode temp = head;

        while (temp != null && !temp.title.equalsIgnoreCase(title))
        {
            temp = temp.next;
        }

        if (temp == null)
        {
            System.out.println("Movie not found");
            return;
        }

        if (temp == head)
            head = temp.next;

        if (temp == tail)
            tail = temp.prev;

        if (temp.prev != null)
            temp.prev.next = temp.next;

        if (temp.next != null)
            temp.next.prev = temp.prev;

        System.out.println("Movie deleted");
    }

    // Search by Director
    void searchByDirector(String director)
    {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null)
        {
            if (temp.director.equalsIgnoreCase(director))
            {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No movie found for this director");
    }

    // Search by Rating
    void searchByRating(double rating)
    {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null)
        {
            if (temp.rating == rating)
            {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No movie found with this rating");
    }

    // Update Rating
    void updateRating(String title, double newRating)
    {
        MovieNode temp = head;

        while (temp != null)
        {
            if (temp.title.equalsIgnoreCase(title))
            {
                temp.rating = newRating;
                System.out.println("Rating updated");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found");
    }

    // Display Forward
    void displayForward()
    {
        if (head == null)
        {
            System.out.println("No movies");
            return;
        }

        MovieNode temp = head;

        while (temp != null)
        {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    // Display Reverse
    void displayReverse()
    {
        if (tail == null)
        {
            System.out.println("No movies");
            return;
        }

        MovieNode temp = tail;

        while (temp != null)
        {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    // Display one movie
    void displayMovie(MovieNode m)
    {
        System.out.println("Title: " + m.title +
                ", Director: " + m.director +
                ", Year: " + m.year +
                ", Rating: " + m.rating);
    }
}

public class MovieManagement
{
    public static void main(String[] args)
    {
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();

        list.addBegining("Inception", "Nolan", 2010, 8.8);
        list.addEnd("Interstellar", "Nolan", 2014, 9.0);
        list.addEnd("Avatar", "Cameron", 2009, 8.0);

        list.addAtPosition(1, "Titanic", "Cameron", 1997, 9.1);

        System.out.println("All Movies (Forward):");
        list.displayForward();

        System.out.println("\nAll Movies (Reverse):");
        list.displayReverse();

        System.out.println("\nSearch by Director Nolan:");
        list.searchByDirector("Nolan");

        System.out.println("\nUpdate Rating of Avatar:");
        list.updateRating("Avatar", 8.5);

        System.out.println("\nDelete Titanic:");
        list.deleteByTitle("Titanic");

        System.out.println("\nFinal List:");
        list.displayForward();
    }
}