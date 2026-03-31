package stream_api;
import java.util.*;

class Movie {
    String name;
    double rating;
    int year;

    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }
    
    public String toString() {
        return name + " " + rating;
    }
}

public class TopFiveTrendingMovies {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("A", 8.9, 2023),
            new Movie("B", 9.2, 2024),
            new Movie("C", 7.5, 2022),
            new Movie("D", 9.0, 2024),
            new Movie("E", 8.8, 2023),
            new Movie("F", 9.5, 2024)
        );
        
        movies.stream()
        		.sorted((a,b)->Double.compare(b.rating,a.rating)).limit(5)
        				.forEach(System.out::println);

    }
}