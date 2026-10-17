  import java.time.LocalDate;
import java.time.format.DateTimeParseException;
/**
* Business layer: validates requests and confirms reservations.
*/
public class ReservationService {

   private final ReservationResopsitory repository;
   public ReservationService(ReservationResopsitory repository) {
       this.repository = repository;
   }
   public String validateRequest(String visitorName, String beach,
                                 String date) {
       if (visitorName == null || visitorName.isBlank()) {
           return "Visitor name is required.";
       }
       if (beach == null || beach.isBlank()) {
           return "Please select a beach.";
       }
       try {
           LocalDate selectedDate = LocalDate.parse(date);
           if (selectedDate.isBefore(LocalDate.now())) {
               return "The reservation date cannot be in the past.";
           }
       } catch (DateTimeParseException | NullPointerException e) {
           return "Invalid date. Use YYYY-MM-DD.";
       }
       return null;
   }
   public double getPrice(String facility) {
       switch (facility) {
           case "Umbrella near water": return 5.0;
           case "Beach chair": return 2.0;
           case "Umbrella + two chairs": return 7.0;
           default: return -1.0;
       }
   }
   public int getAvailableCount(String beach, String facility) {
       return repository.getAvailableCount(beach, facility);
   }
   public Reservation createReservation(String visitorName,
                                        String beach, String date,
                                        String facility) {
       if (validateRequest(visitorName, beach, date) != null) {
           return null;
       }
       double price = getPrice(facility);
       if (price < 0 || getAvailableCount(beach, facility) <= 0) {
           return null;
       }
       return new Reservation(visitorName, beach, date, facility, price);
   }
   public boolean confirmReservation(Reservation reservation,
                                     boolean paymentSuccessful) {
       if (reservation == null || !paymentSuccessful
               || reservation.isConfirmed()) {
           return false;
       }
       boolean reserved = repository.reserve(
               reservation.getBeachName(), reservation.getFacility()
       );
       if (reserved) {
           reservation.setConfirmed(true);
       }
       return reserved;
   }
}  
