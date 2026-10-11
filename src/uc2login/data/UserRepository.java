package uc2login.data;

import java.util.HashMap;
import java.util.Map;

/**
 * Data Layer class responsible for storing and retrieving
 * registered users in the Smart Beach Management System.
 */
public class UserRepository {

    private final Map<String, User> users = new HashMap<>();

    /**
     * Creates the repository and initializes its user storage.
     */
    public UserRepository() {
    }

    /**
     * Adds a registered user to the repository.
     *
     * @param user the user to store
     */
    public void addUser(User user) {
        users.put(user.getEmail(), user);
    }

    /**
     * Finds a registered user using their email address.
     *
     * @param email the email address to search for
     * @return the matching user, or null if no user exists
     */
    public User findByEmail(String email) {
        return users.get(email);
    }
}