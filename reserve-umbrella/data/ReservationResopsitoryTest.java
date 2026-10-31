package data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ReservationResopsitoryTest {
   private ReservationResopsitory repository;
   @BeforeEach
   public void setUp() {
       repository = new ReservationResopsitory();
   }
   @Test
   public void testInitialInventoryCount() {
       int count = repository.getAvailableCount(
               "Marassi Beach",
               "Umbrella near water"
       );
       assertEquals(5, count);
   }
   @Test
   public void testReserveSuccessfully() {
       boolean success = repository.reserve(
               "Marassi Beach",
               "Umbrella near water"
       );
       assertTrue(success);
       assertEquals(
               4,
               repository.getAvailableCount(
                       "Marassi Beach",
                       "Umbrella near water"
               )
       );
   }
   @Test
   public void testReserveUntilDepleted() {
       String beach = "Al Jazayer Beach";
       String facility = "Beach chair";
       for (int i = 0; i < 5; i++) {
           assertTrue(repository.reserve(beach, facility));
       }
       assertFalse(repository.reserve(beach, facility));
       assertEquals(
               0,
               repository.getAvailableCount(beach, facility)
       );
   }
   @Test
   public void testGetAvailableCountForInvalidKey() {
       int count = repository.getAvailableCount(
               "Invalid Beach",
               "Invalid Facility"
       );
       assertEquals(0, count);
   }
} 
