import java.util.ArrayList;
import java.util.List;

/**
 * Author: Adam Abukhdair
 * Course: CEN-3024C
 * Date: May 19, 2024
 *
 * Class: Transaction
 * This class manages borrowing and returning of books.
 * It includes methods to borrow a book, return a book, and list overdue items.
 */

public class Transaction {
    private List<String> transactions;

    /**
     * Constructor: Transaction
     * Initializes a new instance of the Transaction class.
     */
    public Transaction() {
        this.transactions = new ArrayList<>();
    }

    /**
     * Method: borrowBook
     * Records a book borrowing transaction.
     *
     * @param bookId The ID of the book to be borrowed.
     * @param userId The ID of the user borrowing the book.
     * @param dueDate The due date for the borrowed book.
     * @return True if the transaction was recorded successfully, false otherwise.
     */
    public boolean borrowBook(String bookId, String userId, String dueDate) {
        String transaction = "Borrowed: " + bookId + " by " + userId + " due on " + dueDate;
        return transactions.add(transaction);
    }

    /**
     * Method: returnBook
     * Records a book return transaction.
     *
     * @param bookId The ID of the book to be returned.
     * @param userId The ID of the user returning the book.
     * @return True if the transaction was recorded successfully, false otherwise.
     */
    public boolean returnBook(String bookId, String userId) {
        String transaction = "Returned: " + bookId + " by " + userId;
        return transactions.add(transaction);
    }

    /**
     * Method: listOverdueItems
     * Lists all overdue items.
     *
     * @return A list of overdue items.
     */
    public List<String> listOverdueItems() {
        // This method would typically check current date vs. due dates and list overdue items.
        // For simplicity, we'll return the entire transaction list.
        return transactions;
    }
}
