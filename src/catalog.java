import java.util.ArrayList;
import java.util.List;

/**
 * Author: Adam Abukhdair
 * Course: CEN-3024C
 * Date: May 19, 2024
 *
 * Class: Catalog
 * This class manages the collection of books in the Library Management System.
 * It includes methods to add, remove, and update book records.
 */

public class Catalog {
    private List<Book> books;

    /**
     * Constructor: Catalog
     * Initializes a new instance of the Catalog class.
     */
    public Catalog() {
        this.books = new ArrayList<>();
    }

    /**
     * Method: addBook
     * Adds a book to the catalog.
     *
     * @param book The book to be added.
     * @return True if the book was added successfully, false otherwise.
     */
    public boolean addBook(Book book) {
        return books.add(book);
    }

    /**
     * Method: removeBook
     * Removes a book from the catalog by its ID.
     *
     * @param bookId The ID of the book to be removed.
     * @return True if the book was removed successfully, false otherwise.
     */
    public boolean removeBook(String bookId) {
        return books.removeIf(book -> book.getId().equals(bookId));
    }

    /**
     * Method: updateBook
     * Updates the details of a book in the catalog.
     *
     * @param book The updated book object.
     * @return True if the book was updated successfully, false otherwise.
     */
    public boolean updateBook(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(book.getId())) {
                books.set(i, book);
                return true;
            }
        }
        return false;
    }

    /**
     * Method: getBooks
     * Returns the list of books in the catalog.
     *
     * @return The list of books in the catalog.
     */
    public List<Book> getBooks() {
        return books;
    }
}
