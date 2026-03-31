package collectors;

import java.util.*;
import java.util.stream.Collectors;

class Book {

    private String genre;
    private int pages;

    public Book(String genre, int pages) {
        this.genre = genre;
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }
}

public class LibraryBookStatistics {
	
	public static void main(String args[]) {
		
		List<Book> books = List.of(
			    new Book("Fiction", 300),
			    new Book("Fiction", 500),
			    new Book("Science", 400),
			    new Book("Science", 600)
			);
		
		Map<String,IntSummaryStatistics> ans=
				books.stream().collect(Collectors.groupingBy(Book::getGenre,Collectors.summarizingInt(Book::getPages)));
		
		
		System.out.println(ans);

	}

}
