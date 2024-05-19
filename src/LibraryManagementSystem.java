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
        // Create a catalog
        Catalog catalog = new Catalog();

        // Create some books
        Book book1 = new Book("1", "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("2", "1984", "George Orwell");

        // Add books to the catalog
        catalog.addBook(book1);
        catalog.addBook(book2);

        // Create a user
        User user = new User("001", "John Doe", "john.doe@example.com");

        // Process a transaction (checkout a book)
        Transaction transaction = new Transaction();
        transaction.borrowBook("1", "001", "2024-06-19");

        // Search for a book
        Search search = new Search(catalog);
        System.out.println("Search results for '1984': " + search.searchByTitle("1984"));

        // List all overdue items (dummy output for demonstration)
        System.out.println("All transactions: " + transaction.listOverdueItems());
    }
}
