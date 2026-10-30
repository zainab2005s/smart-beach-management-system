
package test.uc2login.business;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import uc2login.business.AuthenticationService;
import uc2login.business.PasswordUtils;
import uc2login.data.User;
import uc2login.data.UserRepository;

public class AuthenticationServiceTest {

    private AuthenticationService createService() {
        UserRepository records = new UserRepository();
        String securePassword = PasswordUtils.hashPassword("Beach123!");

        records.addUser(new User(
            "visitor@smartbeach.com",
            securePassword,
            "Visitor"
        ));

        return new AuthenticationService(records);
    }

    @Test
    void validInputIsAccepted() {
        AuthenticationService service = createService();

        assertTrue(service.validateInput(
            "visitor@smartbeach.com", "Beach123!"
        ));
    }

    @Test
    void emptyOrMissingInputIsRejected() {
        AuthenticationService service = createService();

        assertFalse(service.validateInput("", "Beach123!"));
        assertFalse(service.validateInput("   ", "Beach123!"));
        assertFalse(service.validateInput("visitor@smartbeach.com", ""));
        assertFalse(service.validateInput(null, "Beach123!"));
        assertFalse(service.validateInput("visitor@smartbeach.com", null));
    }

    @Test
    void registeredUserCanBeFound() {
        AuthenticationService service = createService();

        assertTrue(service.userExists("visitor@smartbeach.com"));
        assertFalse(service.userExists("unknown@smartbeach.com"));
        assertFalse(service.userExists(null));
    }

    @Test
    void correctCredentialsAllowLogin() {
        AuthenticationService service = createService();

        assertTrue(service.login(
            "visitor@smartbeach.com", "Beach123!"
        ));
    }

    @Test
    void incorrectCredentialsAreRejected() {
        AuthenticationService service = createService();

        assertFalse(service.login(
            "visitor@smartbeach.com", "Wrong123!"
        ));
        assertFalse(service.login(
            "unknown@smartbeach.com", "Beach123!"
        ));
        assertFalse(service.login("", "Beach123!"));
    }
}

