package com.smartbeach.data;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BeachTest {

    // Test if the beach name is returned correctly
    @Test
    public void testGetName() {

        System.out.println("Testing beach name...");

        Beach beach = new Beach("Marassi Beach", "Diyar Al Muharraq", 36, 150);

        assertEquals("Marassi Beach", beach.getName());

        System.out.println("Test Passed: Beach name is correct.");
    }

    // Test crowded beach status
    @Test
    public void testCrowdedStatus() {

        System.out.println("Testing crowded beach status...");

        Beach beach = new Beach("Bilaj Al Jazayer", "Zallaq", 32, 350);

        assertEquals("Crowded (High Traffic)", beach.getStatus());

        System.out.println("Test Passed: Crowded status detected correctly.");
    }

    // Test hot weather status
    @Test
    public void testHotWeatherStatus() {

        System.out.println("Testing hot weather status...");

        Beach beach = new Beach("Marassi Beach", "Diyar Al Muharraq", 36, 150);

        assertEquals("Open / Very Sunny & Hot", beach.getStatus());

        System.out.println("Test Passed: Hot weather status detected correctly.");
    }

    // Test ideal weather status
    @Test
    public void testIdealWeatherStatus() {

        System.out.println("Testing ideal weather status...");

        Beach beach = new Beach("Al Jazayer Beach", "Zallaq", 30, 90);

        assertEquals("Open / Ideal Weather", beach.getStatus());

        System.out.println("Test Passed: Ideal weather status detected correctly.");
    }
}