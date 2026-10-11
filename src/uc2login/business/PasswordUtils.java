package uc2login.business;

import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.util.Base64;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/**
 * Provides password hashing and verification for user authentication.
 * Uses PBKDF2 with a random salt instead of storing plain-text passwords.
 */
public class PasswordUtils {

    private static final int ITERATIONS = 600000;
    private static final int KEY_LENGTH = 256;
    private static final int SALT_LENGTH = 16;

    /**
     * Generates a salted PBKDF2 hash for a password.
     *
     * @param password the original password
     * @return the stored password hash with its salt
     */
    public static String hashPassword(String password) {
        try {
            byte[] salt = new byte[SALT_LENGTH];
            new SecureRandom().nextBytes(salt);

            byte[] hash = generateHash(password, salt);

            return Base64.getEncoder().encodeToString(salt)
                    + ":"
                    + Base64.getEncoder().encodeToString(hash);

        } catch (Exception e) {
            throw new IllegalStateException("Password hashing failed", e);
        }
    }

    /**
     * Checks whether a password matches a stored hash.
     *
     * @param password password entered by the user
     * @param storedHash stored salt and password hash
     * @return true if the password matches
     */
    public static boolean verifyPassword(String password, String storedHash) {
        if (password == null || storedHash == null) {
            return false;
        }

        try {
            String[] parts = storedHash.split(":");

            if (parts.length != 2) {
                return false;
            }

            byte[] salt = Base64.getDecoder().decode(parts[0]);
            byte[] expectedHash = Base64.getDecoder().decode(parts[1]);
            byte[] actualHash = generateHash(password, salt);

            return java.security.MessageDigest.isEqual(
                    expectedHash, actualHash);

        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Derives a secure password hash using PBKDF2.
     */
    private static byte[] generateHash(String password, byte[] salt)
            throws Exception {

        KeySpec spec = new PBEKeySpec(
                password.toCharArray(),
                salt,
                ITERATIONS,
                KEY_LENGTH);

        return SecretKeyFactory
                .getInstance("PBKDF2WithHmacSHA256")
                .generateSecret(spec)
                .getEncoded();
    }
}