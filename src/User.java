/**
 * Author: Adam Abukhdair
 * Course: CEN-3024C
 * Date: May 19, 2024
 *
 * Class: User
 * This class represents a user in the Library Management System. 
 * It includes details such as the name and user ID of the user.
 */

public class User {
    private String name;
    private String userId;

    /**
     * Constructor: User
     * Initializes a new instance of the User class with the specified name and user ID.
     *
     * @param name The name of the user.
     * @param userId The user ID of the user.
     */
    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    /**
     * Method: getName
     * Returns the name of the user.
     *
     * @return The name of the user.
     */
    public String getName() {
        return name;
    }

    /**
     * Method: getUserId
     * Returns the user ID of the user.
     *
     * @return The user ID of the user.
     */
    public String getUserId() {
        return userId;
    }
}
