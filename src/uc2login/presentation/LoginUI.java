package uc2login.presentation;

import java.util.Scanner;
import uc2login.business.AuthenticationService;

/**
 * Presentation Layer for the Login use case.
 * Collects user credentials and displays authentication results.
 */
public class LoginUI {

    private final AuthenticationService authenticationService;

    /**
     * Creates the login interface and connects it to the Business Layer.
     */
    public LoginUI(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    /**
     * Displays the login screen and processes user input.
     */
    public void showLogin() {
        @SuppressWarnings("resource")
Scanner scanner = new Scanner(System.in);

        System.out.println("=== Smart Beach Management System ===");
        System.out.println("Welcome Back!");

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        // Check user credentials through the Business Layer.
        if (authenticationService.login(email, password)) {
            System.out.println("Login successful! Welcome to Smart Beach.");
        } else {
            System.out.println("Invalid email or password.");
        }
    }
}