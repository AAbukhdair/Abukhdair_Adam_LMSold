/**
 * Author: Adam Abukhdair
 * Course: CEN-3024C
 * Date: May 19, 2024
 *
 * Class: Book
 * This class represents a book in the Library Management System.
 * It includes details such as the title, author, and ISBN of the book.
 */

public class Book {
    private String title;
    private String author;
    private String ISBN;

    /**
     * Constructor: Book
     * Initializes a new instance of the Book class with the specified title, author, and ISBN.
     *
     * @param title The title of the book.
     * @param author The author of the book.
     * @param ISBN The ISBN of the book.
     */
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
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

    /**
     * Method: getISBN
     * Returns the ISBN of the book.
     *
     * @return The ISBN of the book.
     */
    public String getISBN() {
        return ISBN;
    }
}
