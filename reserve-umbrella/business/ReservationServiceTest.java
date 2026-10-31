package business;
   
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import data.ReservationResopsitory;
import presentation.Reservation;

import static org.junit.jupiter.api.Assertions.*;
public class ReservationServiceTest {
   private ReservationResopsitory repository;
   private ReservationService service;
   @BeforeEach
   public void setUp() {
       repository = new ReservationResopsitory();
       service = new ReservationService(repository);
   }
   @Test
   public void testValidateRequestValid() {
       String error = service.validateRequest(
               "Zainab",
               "Marassi Beach",
               "2026-12-01"
       );
       assertNull(error);
   }
   @Test
   public void testValidateRequestBlankName() {
       String error = service.validateRequest(
               "",
               "Marassi Beach",
               "2026-12-01"
       );
       assertEquals("Visitor name is required.", error);
   }
   @Test
   public void testValidateRequestPastDate() {
       String error = service.validateRequest(
               "Zainab",
               "Marassi Beach",
               "2020-01-01"
       );
       assertEquals(
               "The reservation date cannot be in the past.",
               error
       );
   }
   @Test
   public void testValidateRequestInvalidDateFormat() {
       String error = service.validateRequest(
               "Zainab",
               "Marassi Beach",
               "not-a-date"
       );
       assertEquals(
               "Invalid date. Use YYYY-MM-DD.",
               error
       );
   }
   @Test
   public void testGetPrice() {
       assertEquals(
               5.0,
               service.getPrice("Umbrella near water")
       );
       assertEquals(
               2.0,
               service.getPrice("Beach chair")
       );
       assertEquals(
               7.0,
               service.getPrice("Umbrella + two chairs")
       );
       assertEquals(
               -1.0,
               service.getPrice("Unknown Facility")
       );
   }
   @Test
   public void testCreateReservation() {
       Reservation res = service.createReservation(
               "Zainab",
               "Bilaj Al Jazayer",
               "2026-12-01",
               "Beach chair"
       );
       assertNotNull(res);
       assertEquals("Zainab", res.getVisitorName());
       assertEquals(2.0, res.getPrice());
       assertFalse(res.isConfirmed());
   }
   @Test
   public void testConfirmReservationSuccess() {
       Reservation res = service.createReservation(
               "Zainab",
               "Bilaj Al Jazayer",
               "2026-12-01",
               "Beach chair"
       );
       boolean confirmed = service.confirmReservation(res, true);
       assertTrue(confirmed);
       assertTrue(res.isConfirmed());
       assertEquals(
               4,
               repository.getAvailableCount(
                       "Bilaj Al Jazayer",
                       "Beach chair"
               )
       );
   }
   @Test
   public void testConfirmReservationFailedPayment() {
       Reservation res = service.createReservation(
            "Zainab",
               "Bilaj Al Jazayer",
               "2026-12-01",
               "Beach chair"
       );
       boolean confirmed = service.confirmReservation(res, false);
       assertFalse(confirmed);
       assertFalse(res.isConfirmed());
       assertEquals(
               5,
               repository.getAvailableCount(
                       "Bilaj Al Jazayer",
                       "Beach chair"
               )
       );
   }
}