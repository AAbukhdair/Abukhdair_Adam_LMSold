import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Author: Adam Abukhdair
 * Course: CEN-3024C
 * Date: May 19, 2024
 *
 * Class: LibraryTests
 * This class contains unit tests for the Library Management System.
 * It tests the creation of books and users, as well as the checkout process.
 */

public class LibraryTests {

    /**
     * Method: testCreateBook
     * Tests the creation of a Book object and verifies its properties.
     */
    @Test
    public void testCreateBook() {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        assertEquals("The Great Gatsby", book.getTitle());
        assertEquals("F. Scott Fitzgerald", book.getAuthor());
        assertEquals("1234567890", book.getISBN());
    }

    /**
     * Method: testCreateUser
     * Tests the creation of a User object and verifies its properties.
     */
    @Test
    public void testCreateUser() {
        User user = new User("John Doe", "001");
        assertEquals("John Doe", user.getName());
        assertEquals("001", user.getUserId());
    }

    /**
     * Method: testCheckoutBook
     * Tests the checkout process of a book to a user.
     */
    @Test
    public void testCheckoutBook() {
        User user = new User("John Doe", "001");
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        Transaction transaction = new Transaction(user, book, "2024-12-31");
        transaction.checkout();
    }
}
