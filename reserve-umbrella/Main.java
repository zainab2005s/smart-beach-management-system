    
    import java.util.Scanner;

import business.ReservationService;
import data.ReservationResopsitory;
import presentation.Reservation;

/**

 * Presentation layer: displays the reservation menu to the visitor.

 */

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    private static final String[] BEACHES = {

        "Marassi Beach", "Al Jazayer Beach", "Bilaj Al Jazayer"

    };

    private static final String[] FACILITIES = {

        "Umbrella near water", "Beach chair", "Umbrella + two chairs"

    };

    public static void main(String[] args) {

        ReservationResopsitory repository = new ReservationResopsitory();

        ReservationService service = new ReservationService(repository);

        System.out.println("=== Smart Beach Management System ===");

        System.out.print("Enter visitor name: ");

        String visitorName = scanner.nextLine().trim();

        if (visitorName.isBlank()) {

            System.out.println("Visitor name is required.");

            scanner.close();

            return;

        }

        while (true) {

            System.out.println("\n=== Reserve Umbrella Screen ===");

            for (int i = 0; i < BEACHES.length; i++) {

                System.out.println((i + 1) + ". " + BEACHES[i]);

            }

            System.out.println("Enter E to exit.");

            System.out.print("Select beach: ");

            String choice = scanner.nextLine().trim();

            if (choice.equalsIgnoreCase("E")) {

                System.out.print("Confirm exit? (Y/N): ");

                if (scanner.nextLine().trim().equalsIgnoreCase("Y")) {

                    System.out.println("Returning to the main menu...");

                    break;

                }

                continue;

            }

            int beachIndex;

            try {

                beachIndex = Integer.parseInt(choice) - 1;

            } catch (NumberFormatException e) {

                System.out.println("Invalid beach selection.");

                continue;

            }

            if (beachIndex < 0 || beachIndex >= BEACHES.length) {

                System.out.println("Invalid beach selection.");

                continue;

            }

            String beach = BEACHES[beachIndex];

            System.out.print("Enter date (YYYY-MM-DD): ");

            String date = scanner.nextLine().trim();

            String error = service.validateRequest(visitorName, beach, date);

            if (error != null) {

                System.out.println(error);

                continue;

            }

            System.out.println("\nAvailable facilities:");

            for (int i = 0; i < FACILITIES.length; i++) {

                String facility = FACILITIES[i];

                System.out.printf("%d. %s - %.2f BD (%d available)%n",

                        i + 1, facility, service.getPrice(facility),

                        service.getAvailableCount(beach, facility));

            }

            System.out.print("Select facility (1-3): ");

            int facilityIndex;

            try {

                facilityIndex = Integer.parseInt(scanner.nextLine().trim()) - 1;

            } catch (NumberFormatException e) {

                System.out.println("Invalid facility selection.");

                continue;

            }

            if (facilityIndex < 0 || facilityIndex >= FACILITIES.length) {

                System.out.println("Invalid facility selection.");

                continue;

            }

            Reservation reservation = service.createReservation(

                    visitorName, beach, date, FACILITIES[facilityIndex]);

            if (reservation == null) {

                System.out.println(

                        "Unavailable facility or invalid reservation. Try again.");

                continue;

            }

            System.out.println(reservation);

            System.out.print("Confirm reservation? (Y/N): ");

            if (!scanner.nextLine().trim().equalsIgnoreCase("Y")) {

                System.out.println("Reservation cancelled.");

                continue;

            }

            boolean finished = false;

            while (!finished) {

                System.out.println("\n1. Try payment again");

                System.out.println("2. Use another payment method");

                System.out.println("3. Cancel reservation");

                System.out.print("Choose: ");

                String paymentChoice = scanner.nextLine().trim();

                if (paymentChoice.equals("3")) {

                    System.out.println("Reservation cancelled.");

                    break;

                }

                if (!paymentChoice.equals("1") && !paymentChoice.equals("2")) {

                    System.out.println("Invalid option.");

                    continue;

                }

                System.out.print("Simulate payment (Y = success, N = failed): ");

                boolean paid = scanner.nextLine().trim().equalsIgnoreCase("Y");

                if (!paid) {

                    System.out.println("Payment failed. Please try again.");

                    continue;

                }

                if (service.confirmReservation(reservation, true)) {

                    System.out.println("Reservation confirmed successfully!");

                    System.out.println(reservation);

                    System.out.println("Details are ready to print.");

                } else {

                    System.out.println("Facility unavailable. Please try again.");

                }

                finished = true;

            }

        }

        scanner.close();

    }

}
 

