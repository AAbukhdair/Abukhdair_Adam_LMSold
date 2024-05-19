/**
 * Author: Adam Abukhdair
 * Course: CEN-3024C
 * Date: May 19, 2024
 *
 * Class: Transaction
 * This class represents a transaction in the Library Management System.
 * It includes details such as the user, book, and due date of the transaction.
 */

public class Transaction {
    private User user;
    private Book book;
    private String dueDate;

    /**
     * Constructor: Transaction
     * Initializes a new instance of the Transaction class with the specified user, book, and due date.
     *
     * @param user The user involved in the transaction.
     * @param book The book involved in the transaction.
     * @param dueDate The due date for the book to be returned.
     */
    public Transaction(User user, Book book, String dueDate) {
        this.user = user;
        this.book = book;
        this.dueDate = dueDate;
    }

    /**
     * Method: checkout
     * Processes the checkout of a book to a user.
     */
    public void checkout() {
        System.out.println("Book " + book.getTitle() + " checked out to " + user.getName() + ".");
    }

    /**
     * Method: returnBook
     * Processes the return of a book by a user.
     */
    public void returnBook() {
        System.out.println("Book " + book.getTitle() + " returned by " + user.getName() + ".");
    }
}
