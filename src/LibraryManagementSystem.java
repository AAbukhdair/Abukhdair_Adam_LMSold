/**
 * Author: Adam Abukhdair
 * Course: CEN-3024C
 * Date: May 19, 2024
 *
 * Class: LibraryManagementSystem
 * This class contains the main method and serves as the entry point for the Library Management System.
 * The program aims to provide basic functionalities for managing a library, including book management,
 * user management, and transaction processing (borrow and return books).
 */

public class LibraryManagementSystem {

    /**
     * Method: main
     * The main method serves as the entry point for the Library Management System application.
     * It demonstrates the creation of book and user objects, and processes a checkout transaction.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a book
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");

        // Create a user
        User user = new User("John Doe", "001");

        // Process a transaction (checkout a book)
        Transaction transaction = new Transaction(user, book, "2024-12-31");
        transaction.checkout();
    }
}
