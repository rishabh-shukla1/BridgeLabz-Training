package Smart_University_Library_Management_System;

public class LibraryApp {
    public static void main(String[] args) {

        // Singleton
        LibraryCatalog catalog = LibraryCatalog.getInstance();

        // Factory
        User student = UserFactory.createUser("student");
        User faculty = UserFactory.createUser("faculty");

        // Observer
        catalog.addObserver((Observer) student);
        catalog.addObserver((Observer) faculty);

        // Builder
        Book book = new Book.BookBuilder("Data Structures")
                .author("Cormen")
                .edition("3rd")
                .genre("CS")
                .build();

        // Notification trigger
        catalog.addBook("Data Structures by Cormen");
    }
}