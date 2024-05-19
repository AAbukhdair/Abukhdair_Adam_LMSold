import static org.junit.Assert.*;
import org.junit.Test;

public class LibraryTests {
    @Test
    public void testCreateBook() {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        assertEquals("The Great Gatsby", book.getTitle());
        assertEquals("F. Scott Fitzgerald", book.getAuthor());
        assertEquals("1234567890", book.getISBN());
    }

    @Test
    public void testCreateUser() {
        User user = new User("John Doe", "001");
        assertEquals("John Doe", user.getName());
        assertEquals("001", user.getUserId());
    }

    @Test
    public void testCheckoutBook() {
        User user = new User("John Doe", "001");
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        Transaction transaction = new Transaction(user, book, "2024-12-31");
        transaction.checkout();
    }
}
