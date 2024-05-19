import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: Adam Abukhdair
 * Course: CEN-3024C
 * Date: May 19, 2024
 *
 * Class: Search
 * This class provides search functionality for books in the Library Management System.
 * It includes methods to search for books by title, author, and ISBN.
 */

public class Search {
    private Catalog catalog;

    /**
     * Constructor: Search
     * Initializes a new instance of the Search class with the specified catalog.
     *
     * @param catalog The catalog to be searched.
     */
    public Search(Catalog catalog) {
        this.catalog = catalog;
    }

    /**
     * Method: searchByTitle
     * Searches for books by title.
     *
     * @param title The title to search for.
     * @return A list of books that match the title.
     */
    public List<Book> searchByTitle(String title) {
        return catalog.getBooks().stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }

    /**
     * Method: searchByAuthor
     * Searches for books by author.
     *
     * @param author The author to search for.
     * @return A list of books that match the author.
     */
    public List<Book> searchByAuthor(String author) {
        return catalog.getBooks().stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    /**
     * Method: searchByISBN
     * Searches for books by ISBN.
     *
     * @param ISBN The ISBN to search for.
     * @return A list of books that match the ISBN.
     */
    public List<Book> searchByISBN(String ISBN) {
        return catalog.getBooks().stream()
                .filter(book -> book.getId().equalsIgnoreCase(ISBN))
                .collect(Collectors.toList());
    }
}
