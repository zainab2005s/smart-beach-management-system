package uc2login;

import uc2login.business.AuthenticationService;
import uc2login.business.PasswordUtils;
import uc2login.data.User;
import uc2login.data.UserRepository;
import uc2login.presentation.LoginUI;

/**
 * Main class for UC-2: Login.
 * Starts the Smart Beach Management System login demonstration.
 */
public class Main {

    /**
     * Creates a test user and starts the login process.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create the repository to store registered users.
        UserRepository userRepository = new UserRepository();

        // Create a demonstration account with a hashed password.
        User testUser = new User(
                "visitor@smartbeach.com",
                PasswordUtils.hashPassword("Beach123!"),
                "Visitor"
        );

        // Store the demonstration account.
        userRepository.addUser(testUser);

        // Connect the Business Layer to the Data Layer.
        AuthenticationService authenticationService =
                new AuthenticationService(userRepository);

        // Connect the Presentation Layer to the Business Layer.
        LoginUI loginUI = new LoginUI(authenticationService);

        // Start the login process.
        loginUI.showLogin();
    }
}