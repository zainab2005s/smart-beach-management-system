
package test.uc2login.data;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import uc2login.data.User;

/**
 * Unit tests for the registered user data class.
 */
public class UserTest {

    @Test
    void userDetailsAreStoredCorrectly() {
        User beachVisitor = new User(
            "visitor@smartbeach.com",
            "sampleHash123",
            "Visitor"
        );

        assertEquals("visitor@smartbeach.com", beachVisitor.getEmail());
        assertEquals("sampleHash123", beachVisitor.getPasswordHash());
        assertEquals("Visitor", beachVisitor.getRole());
    }

    @Test
    void anotherUserHasIndependentDetails() {
        User beachAdmin = new User(
            "admin@smartbeach.com",
            "adminHash456",
            "Admin"
        );

        assertEquals("admin@smartbeach.com", beachAdmin.getEmail());
        assertEquals("adminHash456", beachAdmin.getPasswordHash());
        assertEquals("Admin", beachAdmin.getRole());
    }
}
