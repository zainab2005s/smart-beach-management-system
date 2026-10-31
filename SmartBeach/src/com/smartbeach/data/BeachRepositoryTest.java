package com.smartbeach.data;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class BeachRepositoryTest {

    // Test retrieving the list of beaches
    @Test
    public void testGetBeachesList() {

        System.out.println("Testing retrieval of beaches list...");

        BeachRepository repository = new BeachRepository();

        List<Beach> beaches = repository.getBeachesList();

        assertNotNull(beaches);
        assertEquals(3, beaches.size());

        System.out.println("Test Passed: Retrieved 3 beaches successfully.");
    }

    // Test searching for an existing beach
    @Test
    public void testFindBeachByName() {

        System.out.println("Testing search for existing beach...");

        BeachRepository repository = new BeachRepository();

        Beach beach = repository.findBeachByName("Marassi Beach");

        assertNotNull(beach);
        assertEquals("Marassi Beach", beach.getName());

        System.out.println("Test Passed: Beach found successfully.");
    }

    // Test searching for a non-existing beach
    @Test
    public void testFindBeachByNameNotFound() {

        System.out.println("Testing search for non-existing beach...");

        BeachRepository repository = new BeachRepository();

        Beach beach = repository.findBeachByName("Unknown Beach");

        assertNull(beach);

        System.out.println("Test Passed: Non-existing beach returned null.");
    }
}