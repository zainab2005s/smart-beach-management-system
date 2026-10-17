public class Reservation {
    /**
* Represents a reservation in the Smart Beach Management System.
*/
   private final String visitorName;
   private final String beachName;
   private final String date;
   private final String facility;
   private final double price;
   private boolean confirmed;
   public Reservation(String visitorName, String beachName,
                      String date, String facility, double price) {
       this.visitorName = visitorName;
       this.beachName = beachName;
       this.date = date;
       this.facility = facility;
       this.price = price;
       this.confirmed = false;
   }
   public String getVisitorName() { return visitorName; }
   public String getBeachName() { return beachName; }
   public String getDate() { return date; }
   public String getFacility() { return facility; }
   public double getPrice() { return price; }
   public boolean isConfirmed() { return confirmed; }
   public void setConfirmed(boolean confirmed) {
       this.confirmed = confirmed;
   }
   @Override
   public String toString() {
       return "\n--- Reservation Details ---"
               + "\nVisitor: " + visitorName
               + "\nBeach: " + beachName
               + "\nDate: " + date
               + "\nFacility: " + facility
               + "\nPrice: " + String.format("%.2f BD", price)
               + "\nStatus: " + (confirmed ? "Confirmed" : "Pending");
   }
}
