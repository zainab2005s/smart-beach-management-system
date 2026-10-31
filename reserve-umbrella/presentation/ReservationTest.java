package presentation;

    import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReservationTest {
    /**
     * this test do test reservation creation and getter methods
     */

   @Test
   public void testReservationCreationAndGetters() {
       Reservation reservation = new Reservation(
               "Zainab",
               "Marassi Beach",
               "2026-11-01",
               "Umbrella near water",
               5.0
       );
       assertEquals("Zainab", reservation.getVisitorName());
       assertEquals("Marassi Beach", reservation.getBeachName());
       assertEquals("2026-11-01", reservation.getDate());
       assertEquals("Umbrella near water", reservation.getFacility());
       assertEquals(5.0, reservation.getPrice());
       assertFalse(reservation.isConfirmed());
   }

   /**
    * this test updating the confirmation status
    */
   @Test
   public void testSetConfirmed() {
       Reservation reservation = new Reservation(
               "Zainab",
               "Marassi Beach",
               "2026-11-01",
               "Beach chair",
               2.0
       );
       assertFalse(reservation.isConfirmed());
       reservation.setConfirmed(true);
       assertTrue(reservation.isConfirmed());
   }
   /**
    * this test reservation test output
    */

   @Test
   public void testToStringFormatting() {
       Reservation reservation = new Reservation(
               "Zainab",
               "Marassi Beach",
               "2026-11-01",
               "Beach chair",
               2.0
       );
       String output = reservation.toString();
       assertTrue(output.contains("Zainab"));
       assertTrue(output.contains("Marassi Beach"));
       assertTrue(output.contains("Pending"));
       reservation.setConfirmed(true);
       String confirmedOutput = reservation.toString();
       assertTrue(confirmedOutput.contains("Confirmed"));
   }
}

