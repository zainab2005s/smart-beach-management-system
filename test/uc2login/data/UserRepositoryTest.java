
package test.uc2login.data;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import uc2login.data.User;
import uc2login.data.UserRepository;

public class UserRepositoryTest {

    @Test
    void registeredVisitorCanBeFound() {
        UserRepository beachRecords = new UserRepository();
        User visitor = new User(
            "visitor@smartbeach.com",
            "visitorHash123",
            "Visitor"
        );

        beachRecords.addUser(visitor);

        User result = beachRecords.findByEmail("visitor@smartbeach.com");

        assertNotNull(result);
        assertEquals("visitor@smartbeach.com", result.getEmail());
        assertEquals("Visitor", result.getRole());
    }

    @Test
    void unknownEmailReturnsNull() {
        UserRepository beachRecords = new UserRepository();

        assertNull(beachRecords.findByEmail("unknown@smartbeach.com"));
    }

    @Test
    void addedUsersAreStoredSeparately() {
        UserRepository beachRecords = new UserRepository();

        beachRecords.addUser(new User("visitor@smartbeach.com", "hash111", "Visitor"));
        beachRecords.addUser(new User("admin@smartbeach.com", "hash222", "Admin"));

        assertEquals("Visitor",
            beachRecords.findByEmail("visitor@smartbeach.com").getRole());
        assertEquals("Admin",
            beachRecords.findByEmail("admin@smartbeach.com").getRole());
    }
}
