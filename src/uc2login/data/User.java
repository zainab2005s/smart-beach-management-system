package uc2login.data;

/**
 * Represents a registered user in the Smart Beach Management System.
 * Stores the user's email, password hash, and role.
 */
public class User {

    private String email;
    private String passwordHash;
    private String role;

    /**
     * Creates a user with authentication information.
     */
    public User(String email, String passwordHash, String role) {
        this.email = email;
        this.passwordHash = passwordHash;
        this.role = role;
    }

    /** Returns the user's email address. */
    public String getEmail() {
        return email;
    }

    /** Returns the stored password hash. */
    public String getPasswordHash() {
        return passwordHash;
    }

    /** Returns the user's role in the system. */
    public String getRole() {
        return role;
    }
}