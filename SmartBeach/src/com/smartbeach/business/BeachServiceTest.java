package com.smartbeach.business;

import com.smartbeach.data.Beach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BeachServiceTest {

    // Test retrieving available beaches through the service layer
    @Test
    public void testViewAvailableBeaches() {

        System.out.println("Testing available beaches retrieval...");

        BeachService service = new BeachService();

        List<Beach> beaches = service.viewAvailableBeaches();

        assertNotNull(beaches);
        assertEquals(3, beaches.size());

        System.out.println("Test Passed: Service returned all beaches successfully.");
    }

    // Test retrieving details of an existing beach
    @Test
    public void testGetBeachDetails() {

        System.out.println("Testing beach details retrieval...");

        BeachService service = new BeachService();

        Beach beach = service.getBeachDetails("Marassi Beach");

        assertNotNull(beach);
        assertEquals("Marassi Beach", beach.getName());

        System.out.println("Test Passed: Beach details retrieved successfully.");
    }

    // Test retrieving details of a non-existing beach
    @Test
    public void testGetBeachDetailsNotFound() {

        System.out.println("Testing retrieval of non-existing beach details...");

        BeachService service = new BeachService();

        Beach beach = service.getBeachDetails("Unknown Beach");

        assertNull(beach);

        System.out.println("Test Passed: Non-existing beach returned null.");
    }
}