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
    private String id;
    private String name;
    private String contactInfo;

    /**
     * Constructor: User
     * Initializes a new instance of the User class with the specified name and user ID.
     *
     * @param id The unique identifier of the user.
     * @param name The name of the user.
     * @param contactInfo The contact information of the user.
     */
    public User(String id, String name, String contactInfo) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    /**
     * Method: getId
     * Returns the ID of the user.
     *
     * @return The ID of the user.
     */
    public String getId() {
        return id;
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
     * Method: getContactInfo
     * Returns the contact information of the user.
     *
     * @return The contact information of the user.
     */
    public String getContactInfo() {
        return contactInfo;
    }
}
