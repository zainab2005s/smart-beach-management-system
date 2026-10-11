package uc2login.business;

import uc2login.data.User;
import uc2login.data.UserRepository;

/**
 * Business Layer class responsible for user authentication.
 * Validates login inputs and checks registered user credentials.
 */
public class AuthenticationService {

    private final UserRepository userRepository;

    /**
     * Creates the authentication service.
     *
     * @param userRepository repository containing registered users
     */
    public AuthenticationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Checks that email and password are not empty.
     *
     * @param email user's email address
     * @param password user's password
     * @return true if both fields contain values
     */
    public boolean validateInput(String email, String password) {
        return email != null && !email.trim().isEmpty()
                && password != null && !password.isEmpty();
    }

    /**
     * Checks whether a registered user exists with the given email.
     *
     * @param email user's email address
     * @return true if the account exists
     */
    public boolean userExists(String email) {
        return email != null && userRepository.findByEmail(email) != null;
    }

    /**
     * Authenticates a user using email and password.
     *
     * @param email user's email address
     * @param password user's password
     * @return true if the credentials are correct
     */
    public boolean login(String email, String password) {
        if (!validateInput(email, password)) {
            return false;
        }

        User user = userRepository.findByEmail(email);

        if (user == null) {
            return false;
        }

        return PasswordUtils.verifyPassword(
                password, user.getPasswordHash());
    }
}