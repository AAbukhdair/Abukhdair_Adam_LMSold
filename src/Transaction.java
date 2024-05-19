public class Transaction {
    private User user;
    private Book book;
    private String dueDate;

    public Transaction(User user, Book book, String dueDate) {
        this.user = user;
        this.book = book;
        this.dueDate = dueDate;
    }

    public void checkout() {
        System.out.println("Book " + book.getTitle() + " checked out to " + user.getName() + ".");
    }

    public void returnBook() {
        System.out.println("Book " + book.getTitle() + " returned by " + user.getName() + ".");
    }
}
