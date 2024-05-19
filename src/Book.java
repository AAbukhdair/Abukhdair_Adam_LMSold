/**
 * Author: Adam Abukhdair
 * Course: CEN-3024C
 * Date: May 19, 2024
 *
 * Class: Book
 * This class represents a book in the Library Management System.
 * It includes details such as the ID, title, and author of the book.
 */

public class Book {
    private String id;
    private String title;
    private String author;

    /**
     * Constructor: Book
     * Initializes a new instance of the Book class with the specified id, title, and author.
     *
     * @param id The unique identifier of the book.
     * @param title The title of the book.
     * @param author The author of the book.
     */
    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    /**
     * Method: getId
     * Returns the ID of the book.
     *
     * @return The ID of the book.
     */
    public String getId() {
        return id;
    }

    /**
     * Method: getTitle
     * Returns the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Method: getAuthor
     * Returns the author of the book.
     *
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }
}
