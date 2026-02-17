package address.book.presentation;

import java.util.Scanner;

import address.book.model.Contact;
import address.book.repository.JSONRepository;
import address.book.service.AddressBookService;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        AddressBookService service =
                new AddressBookService(new JSONRepository());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String firstName = scanner.nextLine();

        Contact contact = new Contact(
                firstName,
                "Shukla",
                "Kanpur",
                "Kanpur",
                "UP",
                "208001",
                "9999999999",
                "test@gmail.com"
        );

        service.addContact(contact);

        service.sortByName();

        service.saveAsync();  // Non-blocking save

        service.getContacts().forEach(System.out::println);
    }
}
