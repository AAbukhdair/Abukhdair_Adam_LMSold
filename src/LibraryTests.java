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
        Book book = new Book("1", "The Great Gatsby", "F. Scott Fitzgerald");
        assertEquals("1", book.getId());
        assertEquals("The Great Gatsby", book.getTitle());
        assertEquals("F. Scott Fitzgerald", book.getAuthor());
    }

    /**
     * Method: testCreateUser
     * Tests the creation of a User object and verifies its properties.
     */
    @Test
    public void testCreateUser() {
        User user = new User("001", "John Doe", "john.doe@example.com");
        assertEquals("001", user.getId());
        assertEquals("John Doe", user.getName());
        assertEquals("john.doe@example.com", user.getContactInfo());
    }

    /**
     * Method: testCheckoutBook
     * Tests the checkout process of a book to a user.
     */
    @Test
    public void testCheckoutBook() {
        User user = new User("001", "John Doe", "john.doe@example.com");
        Book book = new Book("1", "The Great Gatsby", "F. Scott Fitzgerald");
        Transaction transaction = new Transaction();
        assertTrue(transaction.borrowBook("1", "001", "2024-06-19"));
    }
}

