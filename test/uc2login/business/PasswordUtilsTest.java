package test.uc2login.business;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import uc2login.business.PasswordUtils;

public class PasswordUtilsTest {

    @Test
    public void testCorrectPassword() {
        String password = "Beach123!";
        String hashedPassword = PasswordUtils.hashPassword(password);

        assertTrue(PasswordUtils.verifyPassword(password, hashedPassword));
    }

    @Test
    public void testWrongPassword() {
        String password = "Beach123!";
        String hashedPassword = PasswordUtils.hashPassword(password);

        assertFalse(PasswordUtils.verifyPassword("Wrong123", hashedPassword));
    }

    @Test
    public void testDifferentSalts() {
        String password = "Beach123!";

        String hash1 = PasswordUtils.hashPassword(password);
        String hash2 = PasswordUtils.hashPassword(password);

        assertNotEquals(hash1, hash2);
    }
}