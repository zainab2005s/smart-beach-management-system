import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        presentation.Reservation reservation5 = new presentation.Reservation("", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending", "Invalid date. Use YYYY-MM-DD.", "Invalid date. Use YYYY-MM-DD.", (double) 'a');
        double double6 = reservation5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        int int10 = reservationResopsitory0.getAvailableCount("", "hi!");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        int int14 = reservationService11.getAvailableCount("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "Visitor name is required.");
        presentation.Reservation reservation19 = reservationService11.createReservation("Visitor name is required.", "", "Invalid date. Use YYYY-MM-DD.", "");
        presentation.Reservation reservation25 = new presentation.Reservation("Visitor name is required.", "Invalid date. Use YYYY-MM-DD.", "Invalid date. Use YYYY-MM-DD.", "", (double) (byte) 1);
        java.lang.String str26 = reservation25.toString();
        boolean boolean28 = reservationService11.confirmReservation(reservation25, false);
        double double30 = reservationService11.getPrice("\n--- Reservation Details ---\nVisitor: \nBeach: Invalid date. Use YYYY-MM-DD.\nDate: hi!\nFacility: Visitor name is required.\nPrice: -1.00 BD\nStatus: Confirmed");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(reservation19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending" + "'", str26, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "Visitor name is required.", "Visitor name is required.", "Invalid date. Use YYYY-MM-DD.", (double) ' ');
        java.lang.String str6 = reservation5.getFacility();
        double double7 = reservation5.getPrice();
        double double8 = reservation5.getPrice();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str6, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        double double3 = reservationService1.getPrice("");
        presentation.Reservation reservation9 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean11 = reservationService1.confirmReservation(reservation9, false);
        java.lang.String str12 = reservation9.getBeachName();
        java.lang.String str13 = reservation9.getVisitorName();
        java.lang.String str14 = reservation9.getVisitorName();
        reservation9.setConfirmed(false);
        reservation9.setConfirmed(true);
        java.lang.String str19 = reservation9.getBeachName();
        double double20 = reservation9.getPrice();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        double double3 = reservationService1.getPrice("");
        presentation.Reservation reservation9 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean11 = reservationService1.confirmReservation(reservation9, false);
        double double13 = reservationService1.getPrice("Visitor name is required.");
        data.ReservationResopsitory reservationResopsitory14 = null;
        business.ReservationService reservationService15 = new business.ReservationService(reservationResopsitory14);
        double double17 = reservationService15.getPrice("");
        presentation.Reservation reservation22 = reservationService15.createReservation("hi!", "hi!", "", "hi!");
        java.lang.String str26 = reservationService15.validateRequest("Visitor name is required.", "hi!", "");
        data.ReservationResopsitory reservationResopsitory27 = null;
        business.ReservationService reservationService28 = new business.ReservationService(reservationResopsitory27);
        double double30 = reservationService28.getPrice("");
        presentation.Reservation reservation36 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean38 = reservationService28.confirmReservation(reservation36, false);
        boolean boolean40 = reservationService15.confirmReservation(reservation36, false);
        boolean boolean42 = reservationService1.confirmReservation(reservation36, false);
        java.lang.String str43 = reservation36.getBeachName();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNull(reservation22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str26, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        int int10 = reservationResopsitory0.getAvailableCount("Visitor name is required.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed");
        boolean boolean13 = reservationResopsitory0.reserve("Please select a beach.", "");
        int int16 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: hi!\nDate: Visitor name is required.\nFacility: \nPrice: 100.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        double double3 = reservationService1.getPrice("");
        presentation.Reservation reservation9 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean11 = reservationService1.confirmReservation(reservation9, false);
        double double12 = reservation9.getPrice();
        java.lang.String str13 = reservation9.getDate();
        reservation9.setConfirmed(true);
        java.lang.String str16 = reservation9.getDate();
        java.lang.String str17 = reservation9.getBeachName();
        java.lang.String str18 = reservation9.getVisitorName();
        java.lang.String str19 = reservation9.getVisitorName();
        java.lang.String str20 = reservation9.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed" + "'", str20, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        boolean boolean10 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        presentation.Reservation reservation17 = new presentation.Reservation("Visitor name is required.", "hi!", "", "", 10.0d);
        boolean boolean19 = reservationService11.confirmReservation(reservation17, false);
        int int22 = reservationService11.getAvailableCount("", "Please select a beach.");
        int int25 = reservationService11.getAvailableCount("", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending");
        java.lang.String str29 = reservationService11.validateRequest("\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending");
        java.lang.String str33 = reservationService11.validateRequest("", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \nBeach: Invalid date. Use YYYY-MM-DD.\nDate: hi!\nFacility: Visitor name is required.\nPrice: -1.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str29, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Visitor name is required." + "'", str33, "Visitor name is required.");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: \nPrice: 100.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \nFacility: \nPrice: 100.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed", (double) (short) 100);
        java.lang.String str6 = reservation5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending" + "'", str6, "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        boolean boolean10 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        double double13 = reservationService11.getPrice("hi!");
        presentation.Reservation reservation19 = new presentation.Reservation("hi!", "hi!", "Visitor name is required.", "", 100.0d);
        java.lang.String str20 = reservation19.getFacility();
        boolean boolean22 = reservationService11.confirmReservation(reservation19, true);
        int int25 = reservationService11.getAvailableCount("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "Please select a beach.");
        data.ReservationResopsitory reservationResopsitory26 = new data.ReservationResopsitory();
        int int29 = reservationResopsitory26.getAvailableCount("hi!", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        business.ReservationService reservationService30 = new business.ReservationService(reservationResopsitory26);
        presentation.Reservation reservation36 = new presentation.Reservation("Visitor name is required.", "hi!", "", "", 10.0d);
        java.lang.String str37 = reservation36.getFacility();
        java.lang.String str38 = reservation36.toString();
        java.lang.String str39 = reservation36.getBeachName();
        java.lang.String str40 = reservation36.getBeachName();
        boolean boolean42 = reservationService30.confirmReservation(reservation36, false);
        presentation.Reservation reservation48 = new presentation.Reservation("", "Invalid date. Use YYYY-MM-DD.", "hi!", "Visitor name is required.", (double) (-1L));
        java.lang.String str49 = reservation48.getDate();
        boolean boolean51 = reservationService30.confirmReservation(reservation48, true);
        java.lang.String str52 = reservation48.getFacility();
        boolean boolean54 = reservationService11.confirmReservation(reservation48, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending" + "'", str38, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Visitor name is required." + "'", str52, "Visitor name is required.");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        int int4 = reservationResopsitory0.getAvailableCount("", "Invalid date. Use YYYY-MM-DD.");
        boolean boolean7 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed");
        business.ReservationService reservationService8 = new business.ReservationService(reservationResopsitory0);
        presentation.Reservation reservation14 = new presentation.Reservation("hi!", "hi!", "Visitor name is required.", "", 100.0d);
        boolean boolean15 = reservation14.isConfirmed();
        java.lang.String str16 = reservation14.getVisitorName();
        java.lang.String str17 = reservation14.getFacility();
        boolean boolean18 = reservation14.isConfirmed();
        boolean boolean20 = reservationService8.confirmReservation(reservation14, false);
        data.ReservationResopsitory reservationResopsitory21 = null;
        business.ReservationService reservationService22 = new business.ReservationService(reservationResopsitory21);
        double double24 = reservationService22.getPrice("");
        presentation.Reservation reservation29 = reservationService22.createReservation("hi!", "hi!", "", "hi!");
        java.lang.String str33 = reservationService22.validateRequest("Visitor name is required.", "hi!", "");
        data.ReservationResopsitory reservationResopsitory34 = null;
        business.ReservationService reservationService35 = new business.ReservationService(reservationResopsitory34);
        double double37 = reservationService35.getPrice("");
        presentation.Reservation reservation43 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean45 = reservationService35.confirmReservation(reservation43, false);
        boolean boolean47 = reservationService22.confirmReservation(reservation43, false);
        java.lang.String str48 = reservation43.getBeachName();
        java.lang.String str49 = reservation43.getDate();
        java.lang.String str50 = reservation43.toString();
        java.lang.String str51 = reservation43.getVisitorName();
        java.lang.String str52 = reservation43.toString();
        boolean boolean54 = reservationService8.confirmReservation(reservation43, true);
        java.lang.String str58 = reservationService8.validateRequest("Please select a beach.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertNull(reservation29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str33, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str50, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str52, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str58, "Invalid date. Use YYYY-MM-DD.");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        int int3 = reservationResopsitory0.getAvailableCount("hi!", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        business.ReservationService reservationService4 = new business.ReservationService(reservationResopsitory0);
        int int7 = reservationService4.getAvailableCount("", "Invalid date. Use YYYY-MM-DD.");
        int int10 = reservationService4.getAvailableCount("Please select a beach.", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending");
        data.ReservationResopsitory reservationResopsitory11 = new data.ReservationResopsitory();
        business.ReservationService reservationService12 = new business.ReservationService(reservationResopsitory11);
        boolean boolean15 = reservationResopsitory11.reserve("", "");
        boolean boolean18 = reservationResopsitory11.reserve("Visitor name is required.", "Visitor name is required.");
        boolean boolean21 = reservationResopsitory11.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService22 = new business.ReservationService(reservationResopsitory11);
        double double24 = reservationService22.getPrice("hi!");
        presentation.Reservation reservation30 = new presentation.Reservation("hi!", "hi!", "Visitor name is required.", "", 100.0d);
        java.lang.String str31 = reservation30.getFacility();
        boolean boolean33 = reservationService22.confirmReservation(reservation30, true);
        boolean boolean34 = reservation30.isConfirmed();
        boolean boolean35 = reservation30.isConfirmed();
        java.lang.String str36 = reservation30.getVisitorName();
        java.lang.String str37 = reservation30.getFacility();
        boolean boolean39 = reservationService4.confirmReservation(reservation30, false);
        reservation30.setConfirmed(false);
        reservation30.setConfirmed(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        int int3 = reservationResopsitory0.getAvailableCount("Invalid date. Use YYYY-MM-DD.", "Visitor name is required.");
        boolean boolean6 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "Invalid date. Use YYYY-MM-DD.");
        boolean boolean9 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \nFacility: \nPrice: 100.00 BD\nStatus: Pending");
        business.ReservationService reservationService10 = new business.ReservationService(reservationResopsitory0);
        presentation.Reservation reservation15 = reservationService10.createReservation("\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending", "Visitor name is required.", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending", "");
        java.lang.String str19 = reservationService10.validateRequest("\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed\nDate: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nFacility: \nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(reservation15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str19, "Invalid date. Use YYYY-MM-DD.");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        int int10 = reservationResopsitory0.getAvailableCount("", "hi!");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        int int14 = reservationService11.getAvailableCount("hi!", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        presentation.Reservation reservation19 = reservationService11.createReservation("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending", "Invalid date. Use YYYY-MM-DD.", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \nFacility: \nPrice: 100.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending");
        presentation.Reservation reservation24 = reservationService11.createReservation("", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed\nDate: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nFacility: \nPrice: 10.00 BD\nStatus: Pending", "Invalid date. Use YYYY-MM-DD.", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        int int27 = reservationService11.getAvailableCount("Visitor name is required.", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \nDate: \nFacility: \nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(reservation19);
        org.junit.Assert.assertNull(reservation24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        int int3 = reservationResopsitory0.getAvailableCount("Invalid date. Use YYYY-MM-DD.", "Visitor name is required.");
        boolean boolean6 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "Invalid date. Use YYYY-MM-DD.");
        boolean boolean9 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        boolean boolean12 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        boolean boolean15 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending", "Invalid date. Use YYYY-MM-DD.");
        business.ReservationService reservationService16 = new business.ReservationService(reservationResopsitory0);
        presentation.Reservation reservation21 = reservationService16.createReservation("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: Visitor name is required.\nPrice: 0.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(reservation21);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        presentation.Reservation reservation5 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        java.lang.String str6 = reservation5.toString();
        double double7 = reservation5.getPrice();
        java.lang.String str8 = reservation5.getVisitorName();
        java.lang.String str9 = reservation5.toString();
        java.lang.String str10 = reservation5.getFacility();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str6, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str9, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        presentation.Reservation reservation5 = new presentation.Reservation("Visitor name is required.", "Invalid date. Use YYYY-MM-DD.", "Invalid date. Use YYYY-MM-DD.", "", (double) (byte) 1);
        java.lang.String str6 = reservation5.toString();
        java.lang.String str7 = reservation5.toString();
        boolean boolean8 = reservation5.isConfirmed();
        reservation5.setConfirmed(false);
        java.lang.String str11 = reservation5.getFacility();
        java.lang.String str12 = reservation5.getVisitorName();
        boolean boolean13 = reservation5.isConfirmed();
        java.lang.String str14 = reservation5.toString();
        java.lang.Class<?> wildcardClass15 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending" + "'", str6, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending" + "'", str7, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Visitor name is required." + "'", str12, "Visitor name is required.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending" + "'", str14, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        double double3 = reservationService1.getPrice("");
        presentation.Reservation reservation8 = reservationService1.createReservation("hi!", "hi!", "", "hi!");
        java.lang.String str12 = reservationService1.validateRequest("Visitor name is required.", "hi!", "");
        data.ReservationResopsitory reservationResopsitory13 = null;
        business.ReservationService reservationService14 = new business.ReservationService(reservationResopsitory13);
        double double16 = reservationService14.getPrice("");
        presentation.Reservation reservation22 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean24 = reservationService14.confirmReservation(reservation22, false);
        boolean boolean26 = reservationService1.confirmReservation(reservation22, false);
        boolean boolean27 = reservation22.isConfirmed();
        java.lang.String str28 = reservation22.getDate();
        double double29 = reservation22.getPrice();
        boolean boolean30 = reservation22.isConfirmed();
        java.lang.String str31 = reservation22.getFacility();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNull(reservation8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str12, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 35.0d + "'", double29 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        int int7 = reservationResopsitory0.getAvailableCount("hi!", "Invalid date. Use YYYY-MM-DD.");
        int int10 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed", "hi!");
        int int13 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: hi!\nBeach: hi!\nDate: Visitor name is required.\nFacility: \nPrice: 100.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: \nPrice: 100.00 BD\nStatus: Pending");
        business.ReservationService reservationService14 = new business.ReservationService(reservationResopsitory0);
        boolean boolean17 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: \nPrice: 100.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending");
        int int20 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: \nPrice: 100.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", (double) (short) 100);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        presentation.Reservation reservation5 = new presentation.Reservation("hi!", "hi!", "Visitor name is required.", "", 100.0d);
        java.lang.String str6 = reservation5.getDate();
        java.lang.String str7 = reservation5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Visitor name is required." + "'", str6, "Visitor name is required.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: hi!\nDate: Visitor name is required.\nFacility: \nPrice: 100.00 BD\nStatus: Pending" + "'", str7, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: hi!\nDate: Visitor name is required.\nFacility: \nPrice: 100.00 BD\nStatus: Pending");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \nDate: \nFacility: \nPrice: 35.00 BD\nStatus: Pending", "hi!", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending", (double) (short) 100);
        java.lang.String str6 = reservation5.getBeachName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        int int3 = reservationResopsitory0.getAvailableCount("Invalid date. Use YYYY-MM-DD.", "Visitor name is required.");
        boolean boolean6 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "Invalid date. Use YYYY-MM-DD.");
        boolean boolean9 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \nFacility: \nPrice: 100.00 BD\nStatus: Pending");
        business.ReservationService reservationService10 = new business.ReservationService(reservationResopsitory0);
        boolean boolean13 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \nDate: \nFacility: \nPrice: 35.00 BD\nStatus: Pending", "Visitor name is required.");
        business.ReservationService reservationService14 = new business.ReservationService(reservationResopsitory0);
        int int17 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: Visitor name is required.\nPrice: 0.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        int int10 = reservationResopsitory0.getAvailableCount("", "hi!");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        int int14 = reservationService11.getAvailableCount("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "Visitor name is required.");
        presentation.Reservation reservation20 = new presentation.Reservation("hi!", "", "hi!", "", (double) (byte) 1);
        reservation20.setConfirmed(true);
        double double23 = reservation20.getPrice();
        boolean boolean25 = reservationService11.confirmReservation(reservation20, true);
        int int28 = reservationService11.getAvailableCount("\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        java.lang.String str5 = reservationService1.validateRequest("", "", "");
        presentation.Reservation reservation10 = reservationService1.createReservation("hi!", "Visitor name is required.", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending");
        presentation.Reservation reservation16 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        java.lang.String str17 = reservation16.getVisitorName();
        java.lang.String str18 = reservation16.getDate();
        boolean boolean20 = reservationService1.confirmReservation(reservation16, false);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = reservationService1.getAvailableCount("Invalid date. Use YYYY-MM-DD.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: hi!\nDate: Visitor name is required.\nFacility: \nPrice: 100.00 BD\nStatus: Pending");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.ReservationResopsitory.getAvailableCount(String, String)\" because \"this.repository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Visitor name is required." + "'", str5, "Visitor name is required.");
        org.junit.Assert.assertNull(reservation10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        double double3 = reservationService1.getPrice("");
        presentation.Reservation reservation9 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean11 = reservationService1.confirmReservation(reservation9, false);
        double double12 = reservation9.getPrice();
        double double13 = reservation9.getPrice();
        java.lang.String str14 = reservation9.toString();
        double double15 = reservation9.getPrice();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str14, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        presentation.Reservation reservation5 = new presentation.Reservation("hi!", "hi!", "Visitor name is required.", "", 100.0d);
        java.lang.String str6 = reservation5.getFacility();
        java.lang.String str7 = reservation5.getVisitorName();
        java.lang.String str8 = reservation5.getFacility();
        java.lang.String str9 = reservation5.getBeachName();
        reservation5.setConfirmed(true);
        java.lang.String str12 = reservation5.getDate();
        boolean boolean13 = reservation5.isConfirmed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Visitor name is required." + "'", str12, "Visitor name is required.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \nFacility: \nPrice: 100.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: hi!\nFacility: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending", (double) 10.0f);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        int int10 = reservationResopsitory0.getAvailableCount("Invalid date. Use YYYY-MM-DD.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        boolean boolean13 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed");
        business.ReservationService reservationService14 = new business.ReservationService(reservationResopsitory0);
        data.ReservationResopsitory reservationResopsitory15 = null;
        business.ReservationService reservationService16 = new business.ReservationService(reservationResopsitory15);
        double double18 = reservationService16.getPrice("");
        presentation.Reservation reservation23 = reservationService16.createReservation("hi!", "hi!", "", "hi!");
        java.lang.String str27 = reservationService16.validateRequest("Visitor name is required.", "hi!", "");
        data.ReservationResopsitory reservationResopsitory28 = null;
        business.ReservationService reservationService29 = new business.ReservationService(reservationResopsitory28);
        double double31 = reservationService29.getPrice("");
        presentation.Reservation reservation37 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean39 = reservationService29.confirmReservation(reservation37, false);
        boolean boolean41 = reservationService16.confirmReservation(reservation37, false);
        boolean boolean42 = reservation37.isConfirmed();
        java.lang.String str43 = reservation37.getDate();
        double double44 = reservation37.getPrice();
        boolean boolean45 = reservation37.isConfirmed();
        boolean boolean46 = reservation37.isConfirmed();
        java.lang.String str47 = reservation37.toString();
        boolean boolean49 = reservationService14.confirmReservation(reservation37, false);
        java.lang.String str50 = reservation37.toString();
        java.lang.String str51 = reservation37.getVisitorName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertNull(reservation23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str27, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 35.0d + "'", double44 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str47, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str50, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        int int3 = reservationResopsitory0.getAvailableCount("hi!", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        business.ReservationService reservationService4 = new business.ReservationService(reservationResopsitory0);
        business.ReservationService reservationService5 = new business.ReservationService(reservationResopsitory0);
        business.ReservationService reservationService6 = new business.ReservationService(reservationResopsitory0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        double double3 = reservationService1.getPrice("");
        double double5 = reservationService1.getPrice("Visitor name is required.");
        presentation.Reservation reservation10 = reservationService1.createReservation("hi!", "Visitor name is required.", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        double double12 = reservationService1.getPrice("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending");
        presentation.Reservation reservation17 = reservationService1.createReservation("", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \nFacility: \nPrice: 100.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNull(reservation10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNull(reservation17);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: hi!\nDate: Visitor name is required.\nFacility: \nPrice: 100.00 BD\nStatus: Pending", (double) (-1L));
        java.lang.String str6 = reservation5.getDate();
        boolean boolean7 = reservation5.isConfirmed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        java.lang.String str5 = reservationService1.validateRequest("", "", "");
        presentation.Reservation reservation10 = reservationService1.createReservation("hi!", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending", "", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        double double12 = reservationService1.getPrice("Invalid date. Use YYYY-MM-DD.");
        presentation.Reservation reservation17 = reservationService1.createReservation("Please select a beach.", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: \nPrice: 100.00 BD\nStatus: Pending", "", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending");
        double double19 = reservationService1.getPrice("\n--- Reservation Details ---\nVisitor: hi!\nBeach: hi!\nDate: Visitor name is required.\nFacility: \nPrice: 100.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Visitor name is required." + "'", str5, "Visitor name is required.");
        org.junit.Assert.assertNull(reservation10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNull(reservation17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        java.lang.String str5 = reservationService1.validateRequest("Visitor name is required.", "", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending");
        double double7 = reservationService1.getPrice("Invalid date. Use YYYY-MM-DD.");
        double double9 = reservationService1.getPrice("hi!");
        double double11 = reservationService1.getPrice("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Please select a beach." + "'", str5, "Please select a beach.");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "", "", "", 35.0d);
        java.lang.String str6 = reservation5.getBeachName();
        reservation5.setConfirmed(false);
        java.lang.String str9 = reservation5.getBeachName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        presentation.Reservation reservation5 = new presentation.Reservation("hi!", "hi!", "Visitor name is required.", "", 100.0d);
        java.lang.String str6 = reservation5.toString();
        double double7 = reservation5.getPrice();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: hi!\nDate: Visitor name is required.\nFacility: \nPrice: 100.00 BD\nStatus: Pending" + "'", str6, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: hi!\nDate: Visitor name is required.\nFacility: \nPrice: 100.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending", "Visitor name is required.", (double) ' ');
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        double double3 = reservationService1.getPrice("");
        presentation.Reservation reservation9 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean11 = reservationService1.confirmReservation(reservation9, false);
        double double12 = reservation9.getPrice();
        double double13 = reservation9.getPrice();
        java.lang.String str14 = reservation9.getBeachName();
        reservation9.setConfirmed(false);
        java.lang.String str17 = reservation9.getVisitorName();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        presentation.Reservation reservation5 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        java.lang.String str6 = reservation5.toString();
        java.lang.String str7 = reservation5.getBeachName();
        java.lang.String str8 = reservation5.getFacility();
        java.lang.String str9 = reservation5.getDate();
        java.lang.String str10 = reservation5.getVisitorName();
        double double11 = reservation5.getPrice();
        java.lang.String str12 = reservation5.getBeachName();
        java.lang.String str13 = reservation5.getBeachName();
        java.lang.String str14 = reservation5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str6, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str14, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: hi!\nFacility: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", 97.0d);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        double double3 = reservationService1.getPrice("");
        presentation.Reservation reservation8 = reservationService1.createReservation("hi!", "hi!", "", "hi!");
        double double10 = reservationService1.getPrice("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        java.lang.String str14 = reservationService1.validateRequest("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "Please select a beach.", "");
        presentation.Reservation reservation20 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", (double) 10.0f);
        double double21 = reservation20.getPrice();
        boolean boolean23 = reservationService1.confirmReservation(reservation20, false);
        presentation.Reservation reservation28 = reservationService1.createReservation("hi!", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed");
        presentation.Reservation reservation33 = reservationService1.createReservation("Visitor name is required.", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \nDate: \nFacility: \nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNull(reservation8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str14, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(reservation28);
        org.junit.Assert.assertNull(reservation33);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        int int7 = reservationResopsitory0.getAvailableCount("hi!", "Invalid date. Use YYYY-MM-DD.");
        business.ReservationService reservationService8 = new business.ReservationService(reservationResopsitory0);
        int int11 = reservationService8.getAvailableCount("\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "Please select a beach.");
        double double13 = reservationService8.getPrice("hi!");
        double double15 = reservationService8.getPrice("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending");
        java.lang.String str19 = reservationService8.validateRequest("", "", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed");
        int int22 = reservationService8.getAvailableCount("", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Visitor name is required." + "'", str19, "Visitor name is required.");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "", "", "", 35.0d);
        reservation5.setConfirmed(false);
        java.lang.String str8 = reservation5.toString();
        java.lang.String str9 = reservation5.getDate();
        boolean boolean10 = reservation5.isConfirmed();
        java.lang.String str11 = reservation5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \nDate: \nFacility: \nPrice: 35.00 BD\nStatus: Pending" + "'", str8, "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \nDate: \nFacility: \nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \nDate: \nFacility: \nPrice: 35.00 BD\nStatus: Pending" + "'", str11, "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \nDate: \nFacility: \nPrice: 35.00 BD\nStatus: Pending");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        presentation.Reservation reservation5 = new presentation.Reservation("Visitor name is required.", "hi!", "", "", 10.0d);
        java.lang.String str6 = reservation5.getFacility();
        double double7 = reservation5.getPrice();
        java.lang.String str8 = reservation5.getFacility();
        java.lang.String str9 = reservation5.toString();
        java.lang.String str10 = reservation5.getFacility();
        java.lang.String str11 = reservation5.getBeachName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending" + "'", str9, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        int int3 = reservationResopsitory0.getAvailableCount("Invalid date. Use YYYY-MM-DD.", "Visitor name is required.");
        boolean boolean6 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "Invalid date. Use YYYY-MM-DD.");
        business.ReservationService reservationService7 = new business.ReservationService(reservationResopsitory0);
        business.ReservationService reservationService8 = new business.ReservationService(reservationResopsitory0);
        boolean boolean11 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "Please select a beach.");
        boolean boolean14 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \nDate: \nFacility: \nPrice: 35.00 BD\nStatus: Pending", "Invalid date. Use YYYY-MM-DD.");
        business.ReservationService reservationService15 = new business.ReservationService(reservationResopsitory0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService5 = new business.ReservationService(reservationResopsitory0);
        data.ReservationResopsitory reservationResopsitory6 = null;
        business.ReservationService reservationService7 = new business.ReservationService(reservationResopsitory6);
        double double9 = reservationService7.getPrice("");
        presentation.Reservation reservation15 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean17 = reservationService7.confirmReservation(reservation15, false);
        double double18 = reservation15.getPrice();
        java.lang.String str19 = reservation15.getDate();
        reservation15.setConfirmed(true);
        boolean boolean23 = reservationService5.confirmReservation(reservation15, false);
        double double25 = reservationService5.getPrice("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        int int28 = reservationService5.getAvailableCount("hi!", "");
        presentation.Reservation reservation33 = reservationService5.createReservation("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed\nDate: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nFacility: \nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: hi!\nFacility: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \nBeach: Invalid date. Use YYYY-MM-DD.\nDate: hi!\nFacility: Visitor name is required.\nPrice: -1.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(reservation33);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        double double3 = reservationService1.getPrice("");
        presentation.Reservation reservation9 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean11 = reservationService1.confirmReservation(reservation9, false);
        double double12 = reservation9.getPrice();
        java.lang.String str13 = reservation9.getDate();
        reservation9.setConfirmed(true);
        java.lang.String str16 = reservation9.getDate();
        java.lang.String str17 = reservation9.getBeachName();
        java.lang.String str18 = reservation9.toString();
        double double19 = reservation9.getPrice();
        double double20 = reservation9.getPrice();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed" + "'", str18, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        int int4 = reservationResopsitory0.getAvailableCount("", "Invalid date. Use YYYY-MM-DD.");
        int int7 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "Visitor name is required.");
        boolean boolean10 = reservationResopsitory0.reserve("hi!", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        int int13 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending");
        business.ReservationService reservationService14 = new business.ReservationService(reservationResopsitory0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        presentation.Reservation reservation5 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        java.lang.String str6 = reservation5.toString();
        java.lang.String str7 = reservation5.getFacility();
        reservation5.setConfirmed(false);
        java.lang.String str10 = reservation5.getVisitorName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str6, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        presentation.Reservation reservation5 = new presentation.Reservation("Visitor name is required.", "Invalid date. Use YYYY-MM-DD.", "Invalid date. Use YYYY-MM-DD.", "", (double) (byte) 1);
        java.lang.String str6 = reservation5.toString();
        java.lang.String str7 = reservation5.toString();
        boolean boolean8 = reservation5.isConfirmed();
        reservation5.setConfirmed(false);
        java.lang.String str11 = reservation5.getFacility();
        java.lang.String str12 = reservation5.getVisitorName();
        java.lang.Class<?> wildcardClass13 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending" + "'", str6, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending" + "'", str7, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Visitor name is required." + "'", str12, "Visitor name is required.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        double double3 = reservationService1.getPrice("");
        presentation.Reservation reservation8 = reservationService1.createReservation("hi!", "hi!", "", "hi!");
        java.lang.String str12 = reservationService1.validateRequest("Visitor name is required.", "hi!", "");
        data.ReservationResopsitory reservationResopsitory13 = null;
        business.ReservationService reservationService14 = new business.ReservationService(reservationResopsitory13);
        double double16 = reservationService14.getPrice("");
        presentation.Reservation reservation22 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean24 = reservationService14.confirmReservation(reservation22, false);
        boolean boolean26 = reservationService1.confirmReservation(reservation22, false);
        double double28 = reservationService1.getPrice("Visitor name is required.");
        presentation.Reservation reservation33 = reservationService1.createReservation("Invalid date. Use YYYY-MM-DD.", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "", "Invalid date. Use YYYY-MM-DD.");
        presentation.Reservation reservation38 = reservationService1.createReservation("", "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "Invalid date. Use YYYY-MM-DD.");
        java.lang.String str42 = reservationService1.validateRequest("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: \nPrice: 100.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        java.lang.Class<?> wildcardClass43 = reservationService1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNull(reservation8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str12, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertNull(reservation33);
        org.junit.Assert.assertNull(reservation38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str42, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        boolean boolean10 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        double double13 = reservationService11.getPrice("hi!");
        java.lang.String str17 = reservationService11.validateRequest("\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending", "Invalid date. Use YYYY-MM-DD.");
        presentation.Reservation reservation23 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "", (double) 10.0f);
        boolean boolean25 = reservationService11.confirmReservation(reservation23, false);
        reservation23.setConfirmed(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str17, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        boolean boolean10 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        double double13 = reservationService11.getPrice("hi!");
        presentation.Reservation reservation19 = new presentation.Reservation("hi!", "hi!", "Visitor name is required.", "", 100.0d);
        java.lang.String str20 = reservation19.getFacility();
        boolean boolean22 = reservationService11.confirmReservation(reservation19, true);
        int int25 = reservationService11.getAvailableCount("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "Please select a beach.");
        double double27 = reservationService11.getPrice("Invalid date. Use YYYY-MM-DD.");
        presentation.Reservation reservation32 = reservationService11.createReservation("", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed");
        presentation.Reservation reservation38 = new presentation.Reservation("Visitor name is required.", "hi!", "", "", 10.0d);
        java.lang.String str39 = reservation38.getBeachName();
        boolean boolean41 = reservationService11.confirmReservation(reservation38, false);
        presentation.Reservation reservation46 = reservationService11.createReservation("Please select a beach.", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "Please select a beach.", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending");
        java.lang.String str50 = reservationService11.validateRequest("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: Visitor name is required.\nPrice: 0.00 BD\nStatus: Pending", "Invalid date. Use YYYY-MM-DD.");
        double double52 = reservationService11.getPrice("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: Visitor name is required.\nPrice: 0.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNull(reservation32);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(reservation46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str50, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1.0d) + "'", double52 == (-1.0d));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        presentation.Reservation reservation5 = new presentation.Reservation("hi!", "", "hi!", "", (double) (byte) 1);
        reservation5.setConfirmed(true);
        double double8 = reservation5.getPrice();
        java.lang.String str9 = reservation5.getDate();
        double double10 = reservation5.getPrice();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "Visitor name is required.", "Visitor name is required.", "Invalid date. Use YYYY-MM-DD.", (double) ' ');
        java.lang.String str6 = reservation5.getFacility();
        java.lang.String str7 = reservation5.getDate();
        reservation5.setConfirmed(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str6, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Visitor name is required." + "'", str7, "Visitor name is required.");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed", (double) 100);
        java.lang.String str6 = reservation5.getBeachName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending" + "'", str6, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        presentation.Reservation reservation5 = new presentation.Reservation("Invalid date. Use YYYY-MM-DD.", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", 35.0d);
        java.lang.String str6 = reservation5.toString();
        reservation5.setConfirmed(false);
        double double9 = reservation5.getPrice();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nPrice: 35.00 BD\nStatus: Pending" + "'", str6, "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        int int4 = reservationResopsitory0.getAvailableCount("", "Invalid date. Use YYYY-MM-DD.");
        int int7 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "Visitor name is required.");
        business.ReservationService reservationService8 = new business.ReservationService(reservationResopsitory0);
        boolean boolean11 = reservationResopsitory0.reserve("hi!", "Visitor name is required.");
        boolean boolean14 = reservationResopsitory0.reserve("", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \nFacility: \nPrice: 100.00 BD\nStatus: Pending");
        int int17 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \nFacility: \nPrice: 100.00 BD\nStatus: Pending");
        int int20 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        double double3 = reservationService1.getPrice("");
        presentation.Reservation reservation9 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean11 = reservationService1.confirmReservation(reservation9, false);
        double double12 = reservation9.getPrice();
        java.lang.String str13 = reservation9.getDate();
        reservation9.setConfirmed(true);
        java.lang.String str16 = reservation9.getDate();
        java.lang.String str17 = reservation9.getBeachName();
        java.lang.String str18 = reservation9.toString();
        double double19 = reservation9.getPrice();
        java.lang.String str20 = reservation9.getBeachName();
        java.lang.String str21 = reservation9.getFacility();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed" + "'", str18, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        java.lang.String str5 = reservationService1.validateRequest("", "", "");
        presentation.Reservation reservation10 = reservationService1.createReservation("hi!", "Visitor name is required.", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending");
        presentation.Reservation reservation15 = reservationService1.createReservation("hi!", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "Visitor name is required.", "Visitor name is required.");
        java.lang.String str19 = reservationService1.validateRequest("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending");
        java.lang.String str23 = reservationService1.validateRequest("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \nFacility: \nPrice: 100.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Visitor name is required." + "'", str5, "Visitor name is required.");
        org.junit.Assert.assertNull(reservation10);
        org.junit.Assert.assertNull(reservation15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str19, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str23, "Invalid date. Use YYYY-MM-DD.");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        presentation.Reservation reservation5 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        java.lang.String str6 = reservation5.toString();
        java.lang.String str7 = reservation5.getBeachName();
        java.lang.String str8 = reservation5.toString();
        boolean boolean9 = reservation5.isConfirmed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str6, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str8, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        presentation.Reservation reservation5 = new presentation.Reservation("Please select a beach.", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending", "hi!", 1.0d);
        java.lang.String str6 = reservation5.getFacility();
        reservation5.setConfirmed(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        int int10 = reservationResopsitory0.getAvailableCount("Invalid date. Use YYYY-MM-DD.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        presentation.Reservation reservation16 = reservationService11.createReservation("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "Please select a beach.", "Invalid date. Use YYYY-MM-DD.", "");
        int int19 = reservationService11.getAvailableCount("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(reservation16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        presentation.Reservation reservation5 = new presentation.Reservation("Please select a beach.", "", "\n--- Reservation Details ---\nVisitor: \nBeach: Invalid date. Use YYYY-MM-DD.\nDate: hi!\nFacility: Visitor name is required.\nPrice: -1.00 BD\nStatus: Pending", "hi!", (-1.0d));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        int int10 = reservationResopsitory0.getAvailableCount("Invalid date. Use YYYY-MM-DD.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        boolean boolean13 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: hi!\nFacility: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        int int10 = reservationResopsitory0.getAvailableCount("", "hi!");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        int int14 = reservationService11.getAvailableCount("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "Visitor name is required.");
        presentation.Reservation reservation19 = reservationService11.createReservation("Visitor name is required.", "", "Invalid date. Use YYYY-MM-DD.", "");
        presentation.Reservation reservation25 = new presentation.Reservation("Visitor name is required.", "Invalid date. Use YYYY-MM-DD.", "Invalid date. Use YYYY-MM-DD.", "", (double) (byte) 1);
        java.lang.String str26 = reservation25.toString();
        boolean boolean28 = reservationService11.confirmReservation(reservation25, false);
        reservation25.setConfirmed(false);
        reservation25.setConfirmed(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(reservation19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending" + "'", str26, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        int int3 = reservationResopsitory0.getAvailableCount("hi!", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        business.ReservationService reservationService4 = new business.ReservationService(reservationResopsitory0);
        presentation.Reservation reservation10 = new presentation.Reservation("Visitor name is required.", "hi!", "", "", 10.0d);
        java.lang.String str11 = reservation10.getFacility();
        java.lang.String str12 = reservation10.toString();
        java.lang.String str13 = reservation10.getBeachName();
        java.lang.String str14 = reservation10.getBeachName();
        boolean boolean16 = reservationService4.confirmReservation(reservation10, false);
        presentation.Reservation reservation22 = new presentation.Reservation("", "Invalid date. Use YYYY-MM-DD.", "hi!", "Visitor name is required.", (double) (-1L));
        java.lang.String str23 = reservation22.getDate();
        boolean boolean25 = reservationService4.confirmReservation(reservation22, true);
        presentation.Reservation reservation30 = reservationService4.createReservation("\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "Please select a beach.");
        presentation.Reservation reservation35 = reservationService4.createReservation("hi!", "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: hi!\nFacility: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending", "hi!");
        java.lang.String str39 = reservationService4.validateRequest("hi!", "hi!", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        int int42 = reservationService4.getAvailableCount("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed", "hi!");
        java.lang.String str46 = reservationService4.validateRequest("", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: Visitor name is required.\nPrice: 0.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending" + "'", str12, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(reservation30);
        org.junit.Assert.assertNull(reservation35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str39, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Visitor name is required." + "'", str46, "Visitor name is required.");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        presentation.Reservation reservation5 = new presentation.Reservation("Invalid date. Use YYYY-MM-DD.", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "", (double) ' ');
        java.lang.String str6 = reservation5.getFacility();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        int int10 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        boolean boolean13 = reservationResopsitory0.reserve("hi!", "Visitor name is required.");
        int int16 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: hi!\nFacility: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nPrice: 35.00 BD\nStatus: Pending");
        int int19 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        int int3 = reservationResopsitory0.getAvailableCount("Invalid date. Use YYYY-MM-DD.", "Visitor name is required.");
        boolean boolean6 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "Invalid date. Use YYYY-MM-DD.");
        business.ReservationService reservationService7 = new business.ReservationService(reservationResopsitory0);
        business.ReservationService reservationService8 = new business.ReservationService(reservationResopsitory0);
        boolean boolean11 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "Please select a beach.");
        boolean boolean14 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \nDate: \nFacility: \nPrice: 35.00 BD\nStatus: Pending", "Invalid date. Use YYYY-MM-DD.");
        java.lang.Class<?> wildcardClass15 = reservationResopsitory0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        boolean boolean10 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        data.ReservationResopsitory reservationResopsitory12 = null;
        business.ReservationService reservationService13 = new business.ReservationService(reservationResopsitory12);
        double double15 = reservationService13.getPrice("");
        presentation.Reservation reservation20 = reservationService13.createReservation("hi!", "hi!", "", "hi!");
        java.lang.String str24 = reservationService13.validateRequest("Visitor name is required.", "hi!", "");
        data.ReservationResopsitory reservationResopsitory25 = null;
        business.ReservationService reservationService26 = new business.ReservationService(reservationResopsitory25);
        double double28 = reservationService26.getPrice("");
        presentation.Reservation reservation34 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean36 = reservationService26.confirmReservation(reservation34, false);
        boolean boolean38 = reservationService13.confirmReservation(reservation34, false);
        java.lang.String str39 = reservation34.getBeachName();
        java.lang.String str40 = reservation34.getDate();
        java.lang.String str41 = reservation34.toString();
        java.lang.String str42 = reservation34.getVisitorName();
        java.lang.String str43 = reservation34.toString();
        java.lang.String str44 = reservation34.getDate();
        java.lang.String str45 = reservation34.toString();
        boolean boolean47 = reservationService11.confirmReservation(reservation34, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNull(reservation20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str24, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str41, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str43, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str45, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nPrice: 35.00 BD\nStatus: Pending", "Invalid date. Use YYYY-MM-DD.", "", 32.0d);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        presentation.Reservation reservation5 = new presentation.Reservation("Please select a beach.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed", (double) 100L);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        presentation.Reservation reservation5 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        java.lang.String str6 = reservation5.toString();
        java.lang.String str7 = reservation5.getBeachName();
        java.lang.String str8 = reservation5.getBeachName();
        java.lang.String str9 = reservation5.getFacility();
        double double10 = reservation5.getPrice();
        java.lang.String str11 = reservation5.getVisitorName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str6, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        boolean boolean10 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        double double13 = reservationService11.getPrice("hi!");
        presentation.Reservation reservation19 = new presentation.Reservation("hi!", "hi!", "Visitor name is required.", "", 100.0d);
        java.lang.String str20 = reservation19.getFacility();
        boolean boolean22 = reservationService11.confirmReservation(reservation19, true);
        double double23 = reservation19.getPrice();
        reservation19.setConfirmed(false);
        java.lang.String str26 = reservation19.getBeachName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        boolean boolean10 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        business.ReservationService reservationService12 = new business.ReservationService(reservationResopsitory0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        presentation.Reservation reservation5 = new presentation.Reservation("hi!", "hi!", "Visitor name is required.", "", 100.0d);
        java.lang.String str6 = reservation5.getFacility();
        java.lang.String str7 = reservation5.getVisitorName();
        boolean boolean8 = reservation5.isConfirmed();
        java.lang.String str9 = reservation5.getFacility();
        boolean boolean10 = reservation5.isConfirmed();
        double double11 = reservation5.getPrice();
        java.lang.String str12 = reservation5.getVisitorName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        presentation.Reservation reservation5 = new presentation.Reservation("Invalid date. Use YYYY-MM-DD.", "Invalid date. Use YYYY-MM-DD.", "Please select a beach.", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", (double) 1);
        java.lang.String str6 = reservation5.getFacility();
        java.lang.String str7 = reservation5.getBeachName();
        double double8 = reservation5.getPrice();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending" + "'", str6, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str7, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \nFacility: \nPrice: 100.00 BD\nStatus: Pending", "", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: Visitor name is required.\nPrice: 0.00 BD\nStatus: Pending", "", (double) 1L);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: \nDate: \nFacility: Visitor name is required.\nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed", (double) (byte) 100);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        presentation.Reservation reservation5 = new presentation.Reservation("Visitor name is required.", "Invalid date. Use YYYY-MM-DD.", "Invalid date. Use YYYY-MM-DD.", "", (double) (byte) 1);
        java.lang.String str6 = reservation5.getBeachName();
        java.lang.String str7 = reservation5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str6, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending" + "'", str7, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        double double3 = reservationService1.getPrice("");
        presentation.Reservation reservation9 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean11 = reservationService1.confirmReservation(reservation9, false);
        java.lang.String str12 = reservation9.getBeachName();
        java.lang.String str13 = reservation9.getVisitorName();
        java.lang.String str14 = reservation9.getVisitorName();
        java.lang.String str15 = reservation9.getBeachName();
        java.lang.String str16 = reservation9.getFacility();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        presentation.Reservation reservation5 = new presentation.Reservation("Visitor name is required.", "", "", "Visitor name is required.", 35.0d);
        java.lang.String str6 = reservation5.getDate();
        java.lang.String str7 = reservation5.toString();
        java.lang.String str8 = reservation5.getFacility();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: \nDate: \nFacility: Visitor name is required.\nPrice: 35.00 BD\nStatus: Pending" + "'", str7, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: \nDate: \nFacility: Visitor name is required.\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Visitor name is required." + "'", str8, "Visitor name is required.");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        int int4 = reservationResopsitory0.getAvailableCount("", "Invalid date. Use YYYY-MM-DD.");
        int int7 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "Visitor name is required.");
        business.ReservationService reservationService8 = new business.ReservationService(reservationResopsitory0);
        data.ReservationResopsitory reservationResopsitory9 = null;
        business.ReservationService reservationService10 = new business.ReservationService(reservationResopsitory9);
        double double12 = reservationService10.getPrice("");
        presentation.Reservation reservation18 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean20 = reservationService10.confirmReservation(reservation18, false);
        java.lang.String str21 = reservation18.getBeachName();
        java.lang.String str22 = reservation18.getVisitorName();
        boolean boolean23 = reservation18.isConfirmed();
        boolean boolean25 = reservationService8.confirmReservation(reservation18, true);
        java.lang.String str26 = reservation18.getDate();
        double double27 = reservation18.getPrice();
        java.lang.String str28 = reservation18.getDate();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 35.0d + "'", double27 == 35.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed", "Visitor name is required.", (double) 100);
        double double6 = reservation5.getPrice();
        java.lang.String str7 = reservation5.getBeachName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending" + "'", str7, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        presentation.Reservation reservation5 = new presentation.Reservation("Visitor name is required.", "", "", "Visitor name is required.", 35.0d);
        java.lang.String str6 = reservation5.getBeachName();
        java.lang.String str7 = reservation5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: \nDate: \nFacility: Visitor name is required.\nPrice: 35.00 BD\nStatus: Pending" + "'", str7, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: \nDate: \nFacility: Visitor name is required.\nPrice: 35.00 BD\nStatus: Pending");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        int int10 = reservationResopsitory0.getAvailableCount("", "hi!");
        int int13 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        boolean boolean16 = reservationResopsitory0.reserve("", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: \nPrice: 100.00 BD\nStatus: Pending");
        int int19 = reservationResopsitory0.getAvailableCount("Visitor name is required.", "hi!");
        int int22 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        int int25 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        boolean boolean10 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        int int14 = reservationService11.getAvailableCount("\n--- Reservation Details ---\nVisitor: hi!\nBeach: hi!\nDate: Visitor name is required.\nFacility: \nPrice: 100.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: Visitor name is required.\nPrice: 0.00 BD\nStatus: Pending");
        presentation.Reservation reservation20 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed", "Please select a beach.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed", (double) (-1L));
        java.lang.String str21 = reservation20.getBeachName();
        boolean boolean23 = reservationService11.confirmReservation(reservation20, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Please select a beach." + "'", str21, "Please select a beach.");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        int int4 = reservationResopsitory0.getAvailableCount("", "Invalid date. Use YYYY-MM-DD.");
        int int7 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "Visitor name is required.");
        business.ReservationService reservationService8 = new business.ReservationService(reservationResopsitory0);
        double double10 = reservationService8.getPrice("");
        java.lang.String str14 = reservationService8.validateRequest("Invalid date. Use YYYY-MM-DD.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: hi!\nDate: Visitor name is required.\nFacility: \nPrice: 100.00 BD\nStatus: Pending");
        presentation.Reservation reservation19 = reservationService8.createReservation("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \nFacility: \nPrice: 100.00 BD\nStatus: Pending", "hi!", "Please select a beach.", "Please select a beach.");
        int int22 = reservationService8.getAvailableCount("", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \nFacility: \nPrice: 100.00 BD\nStatus: Pending");
        presentation.Reservation reservation27 = reservationService8.createReservation("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: hi!\nFacility: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending", "hi!", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: hi!\nFacility: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str14, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertNull(reservation19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(reservation27);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending", "", "", (double) (short) 100);
        boolean boolean6 = reservation5.isConfirmed();
        reservation5.setConfirmed(false);
        java.lang.String str9 = reservation5.getFacility();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        business.ReservationService reservationService5 = new business.ReservationService(reservationResopsitory0);
        boolean boolean8 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "Invalid date. Use YYYY-MM-DD.");
        int int11 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed\nDate: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nFacility: \nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        int int4 = reservationResopsitory0.getAvailableCount("", "Invalid date. Use YYYY-MM-DD.");
        int int7 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "Visitor name is required.");
        boolean boolean10 = reservationResopsitory0.reserve("hi!", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        int int13 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending");
        business.ReservationService reservationService14 = new business.ReservationService(reservationResopsitory0);
        business.ReservationService reservationService15 = new business.ReservationService(reservationResopsitory0);
        business.ReservationService reservationService16 = new business.ReservationService(reservationResopsitory0);
        data.ReservationResopsitory reservationResopsitory17 = null;
        business.ReservationService reservationService18 = new business.ReservationService(reservationResopsitory17);
        double double20 = reservationService18.getPrice("");
        presentation.Reservation reservation26 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean28 = reservationService18.confirmReservation(reservation26, false);
        boolean boolean29 = reservation26.isConfirmed();
        java.lang.String str30 = reservation26.getVisitorName();
        double double31 = reservation26.getPrice();
        boolean boolean33 = reservationService16.confirmReservation(reservation26, false);
        data.ReservationResopsitory reservationResopsitory34 = new data.ReservationResopsitory();
        business.ReservationService reservationService35 = new business.ReservationService(reservationResopsitory34);
        boolean boolean38 = reservationResopsitory34.reserve("", "");
        boolean boolean41 = reservationResopsitory34.reserve("Visitor name is required.", "Visitor name is required.");
        boolean boolean44 = reservationResopsitory34.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService45 = new business.ReservationService(reservationResopsitory34);
        double double47 = reservationService45.getPrice("hi!");
        presentation.Reservation reservation53 = new presentation.Reservation("hi!", "hi!", "Visitor name is required.", "", 100.0d);
        java.lang.String str54 = reservation53.getFacility();
        boolean boolean56 = reservationService45.confirmReservation(reservation53, true);
        boolean boolean58 = reservationService16.confirmReservation(reservation53, false);
        reservation53.setConfirmed(true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 35.0d + "'", double31 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        presentation.Reservation reservation5 = new presentation.Reservation("Visitor name is required.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "", (double) '4');
        java.lang.String str6 = reservation5.getDate();
        boolean boolean7 = reservation5.isConfirmed();
        java.lang.String str8 = reservation5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending" + "'", str6, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending" + "'", str8, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        java.lang.String str5 = reservationService1.validateRequest("", "", "");
        presentation.Reservation reservation10 = reservationService1.createReservation("hi!", "Visitor name is required.", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending");
        presentation.Reservation reservation16 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        java.lang.String str17 = reservation16.getVisitorName();
        java.lang.String str18 = reservation16.getDate();
        boolean boolean20 = reservationService1.confirmReservation(reservation16, false);
        java.lang.String str21 = reservation16.getVisitorName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Visitor name is required." + "'", str5, "Visitor name is required.");
        org.junit.Assert.assertNull(reservation10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        int int3 = reservationResopsitory0.getAvailableCount("hi!", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        business.ReservationService reservationService4 = new business.ReservationService(reservationResopsitory0);
        presentation.Reservation reservation10 = new presentation.Reservation("Visitor name is required.", "hi!", "", "", 10.0d);
        java.lang.String str11 = reservation10.getFacility();
        java.lang.String str12 = reservation10.toString();
        java.lang.String str13 = reservation10.getBeachName();
        java.lang.String str14 = reservation10.getBeachName();
        boolean boolean16 = reservationService4.confirmReservation(reservation10, false);
        java.lang.String str20 = reservationService4.validateRequest("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "Invalid date. Use YYYY-MM-DD.");
        data.ReservationResopsitory reservationResopsitory21 = new data.ReservationResopsitory();
        business.ReservationService reservationService22 = new business.ReservationService(reservationResopsitory21);
        boolean boolean25 = reservationResopsitory21.reserve("", "");
        boolean boolean28 = reservationResopsitory21.reserve("Visitor name is required.", "Visitor name is required.");
        boolean boolean31 = reservationResopsitory21.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService32 = new business.ReservationService(reservationResopsitory21);
        presentation.Reservation reservation38 = new presentation.Reservation("Visitor name is required.", "hi!", "", "", 10.0d);
        boolean boolean40 = reservationService32.confirmReservation(reservation38, false);
        boolean boolean42 = reservationService4.confirmReservation(reservation38, false);
        data.ReservationResopsitory reservationResopsitory43 = null;
        business.ReservationService reservationService44 = new business.ReservationService(reservationResopsitory43);
        double double46 = reservationService44.getPrice("");
        presentation.Reservation reservation52 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean54 = reservationService44.confirmReservation(reservation52, false);
        double double55 = reservation52.getPrice();
        double double56 = reservation52.getPrice();
        java.lang.String str57 = reservation52.toString();
        boolean boolean59 = reservationService4.confirmReservation(reservation52, false);
        data.ReservationResopsitory reservationResopsitory60 = null;
        business.ReservationService reservationService61 = new business.ReservationService(reservationResopsitory60);
        double double63 = reservationService61.getPrice("");
        presentation.Reservation reservation68 = reservationService61.createReservation("hi!", "hi!", "", "hi!");
        java.lang.String str72 = reservationService61.validateRequest("Visitor name is required.", "hi!", "");
        data.ReservationResopsitory reservationResopsitory73 = null;
        business.ReservationService reservationService74 = new business.ReservationService(reservationResopsitory73);
        double double76 = reservationService74.getPrice("");
        presentation.Reservation reservation82 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean84 = reservationService74.confirmReservation(reservation82, false);
        boolean boolean86 = reservationService61.confirmReservation(reservation82, false);
        java.lang.String str87 = reservation82.getFacility();
        boolean boolean88 = reservation82.isConfirmed();
        double double89 = reservation82.getPrice();
        java.lang.String str90 = reservation82.toString();
        boolean boolean92 = reservationService4.confirmReservation(reservation82, false);
        java.lang.String str93 = reservation82.toString();
        java.lang.String str94 = reservation82.getFacility();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending" + "'", str12, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str20, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 35.0d + "'", double55 == 35.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 35.0d + "'", double56 == 35.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str57, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertNull(reservation68);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str72, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.0d) + "'", double76 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 35.0d + "'", double89 == 35.0d);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str90, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str93, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "hi!" + "'", str94, "hi!");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        presentation.Reservation reservation5 = new presentation.Reservation("Visitor name is required.", "hi!", "", "", 10.0d);
        double double6 = reservation5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        presentation.Reservation reservation5 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        java.lang.String str6 = reservation5.toString();
        java.lang.String str7 = reservation5.getBeachName();
        java.lang.String str8 = reservation5.getBeachName();
        java.lang.String str9 = reservation5.getFacility();
        java.lang.String str10 = reservation5.getVisitorName();
        boolean boolean11 = reservation5.isConfirmed();
        java.lang.String str12 = reservation5.getBeachName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str6, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        int int3 = reservationResopsitory0.getAvailableCount("Invalid date. Use YYYY-MM-DD.", "Visitor name is required.");
        boolean boolean6 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "Invalid date. Use YYYY-MM-DD.");
        int int9 = reservationResopsitory0.getAvailableCount("Please select a beach.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        business.ReservationService reservationService10 = new business.ReservationService(reservationResopsitory0);
        int int13 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed\nDate: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nFacility: \nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        int int7 = reservationResopsitory0.getAvailableCount("hi!", "Invalid date. Use YYYY-MM-DD.");
        int int10 = reservationResopsitory0.getAvailableCount("Visitor name is required.", "");
        boolean boolean13 = reservationResopsitory0.reserve("hi!", "Invalid date. Use YYYY-MM-DD.");
        boolean boolean16 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: \nPrice: 100.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \nBeach: Invalid date. Use YYYY-MM-DD.\nDate: hi!\nFacility: Visitor name is required.\nPrice: -1.00 BD\nStatus: Pending");
        business.ReservationService reservationService17 = new business.ReservationService(reservationResopsitory0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        double double3 = reservationService1.getPrice("");
        presentation.Reservation reservation9 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean11 = reservationService1.confirmReservation(reservation9, false);
        double double13 = reservationService1.getPrice("Visitor name is required.");
        data.ReservationResopsitory reservationResopsitory14 = null;
        business.ReservationService reservationService15 = new business.ReservationService(reservationResopsitory14);
        double double17 = reservationService15.getPrice("");
        presentation.Reservation reservation22 = reservationService15.createReservation("hi!", "hi!", "", "hi!");
        java.lang.String str26 = reservationService15.validateRequest("Visitor name is required.", "hi!", "");
        data.ReservationResopsitory reservationResopsitory27 = null;
        business.ReservationService reservationService28 = new business.ReservationService(reservationResopsitory27);
        double double30 = reservationService28.getPrice("");
        presentation.Reservation reservation36 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean38 = reservationService28.confirmReservation(reservation36, false);
        boolean boolean40 = reservationService15.confirmReservation(reservation36, false);
        boolean boolean42 = reservationService1.confirmReservation(reservation36, false);
        java.lang.String str46 = reservationService1.validateRequest("Please select a beach.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed");
        presentation.Reservation reservation51 = reservationService1.createReservation("Invalid date. Use YYYY-MM-DD.", "hi!", "Please select a beach.", "Invalid date. Use YYYY-MM-DD.");
        double double53 = reservationService1.getPrice("");
        java.lang.String str57 = reservationService1.validateRequest("Visitor name is required.", "Please select a beach.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: hi!\nDate: Visitor name is required.\nFacility: \nPrice: 100.00 BD\nStatus: Pending");
        presentation.Reservation reservation63 = new presentation.Reservation("", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \nDate: \nFacility: \nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: hi!\nFacility: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending", "Invalid date. Use YYYY-MM-DD.", (double) 0.0f);
        boolean boolean65 = reservationService1.confirmReservation(reservation63, false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNull(reservation22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str26, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str46, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertNull(reservation51);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str57, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        presentation.Reservation reservation5 = new presentation.Reservation("", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending", "Invalid date. Use YYYY-MM-DD.", "Invalid date. Use YYYY-MM-DD.", (double) 'a');
        java.lang.String str6 = reservation5.toString();
        reservation5.setConfirmed(true);
        java.lang.String str9 = reservation5.getVisitorName();
        java.lang.String str10 = reservation5.getFacility();
        java.lang.String str11 = reservation5.getFacility();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending" + "'", str6, "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str10, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str11, "Invalid date. Use YYYY-MM-DD.");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        int int3 = reservationResopsitory0.getAvailableCount("hi!", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        boolean boolean6 = reservationResopsitory0.reserve("", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: hi!\nFacility: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending");
        boolean boolean9 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: hi!\nFacility: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        double double3 = reservationService1.getPrice("");
        presentation.Reservation reservation9 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean11 = reservationService1.confirmReservation(reservation9, false);
        double double12 = reservation9.getPrice();
        double double13 = reservation9.getPrice();
        java.lang.String str14 = reservation9.getVisitorName();
        java.lang.String str15 = reservation9.getDate();
        boolean boolean16 = reservation9.isConfirmed();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService5 = new business.ReservationService(reservationResopsitory0);
        data.ReservationResopsitory reservationResopsitory6 = null;
        business.ReservationService reservationService7 = new business.ReservationService(reservationResopsitory6);
        double double9 = reservationService7.getPrice("");
        presentation.Reservation reservation15 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean17 = reservationService7.confirmReservation(reservation15, false);
        double double18 = reservation15.getPrice();
        java.lang.String str19 = reservation15.getDate();
        reservation15.setConfirmed(true);
        boolean boolean23 = reservationService5.confirmReservation(reservation15, false);
        presentation.Reservation reservation29 = new presentation.Reservation("hi!", "hi!", "Visitor name is required.", "", 100.0d);
        java.lang.String str30 = reservation29.getFacility();
        boolean boolean32 = reservationService5.confirmReservation(reservation29, true);
        java.lang.String str36 = reservationService5.validateRequest("Invalid date. Use YYYY-MM-DD.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending");
        int int39 = reservationService5.getAvailableCount("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: Visitor name is required.\nPrice: 0.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        double double41 = reservationService5.getPrice("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str36, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        presentation.Reservation reservation5 = new presentation.Reservation("hi!", "", "hi!", "", (double) (byte) 1);
        reservation5.setConfirmed(true);
        boolean boolean8 = reservation5.isConfirmed();
        java.lang.String str9 = reservation5.getDate();
        java.lang.String str10 = reservation5.getDate();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        presentation.Reservation reservation5 = new presentation.Reservation("Visitor name is required.", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed\nDate: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nFacility: \nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: hi!\nFacility: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending", (double) 1L);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        presentation.Reservation reservation5 = new presentation.Reservation("hi!", "", "hi!", "", (double) (byte) 1);
        reservation5.setConfirmed(true);
        boolean boolean8 = reservation5.isConfirmed();
        java.lang.String str9 = reservation5.getDate();
        java.lang.String str10 = reservation5.toString();
        java.lang.String str11 = reservation5.getVisitorName();
        java.lang.String str12 = reservation5.getDate();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed" + "'", str10, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        presentation.Reservation reservation5 = new presentation.Reservation("Visitor name is required.", "hi!", "", "", 10.0d);
        java.lang.String str6 = reservation5.getFacility();
        double double7 = reservation5.getPrice();
        boolean boolean8 = reservation5.isConfirmed();
        java.lang.String str9 = reservation5.getVisitorName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Visitor name is required." + "'", str9, "Visitor name is required.");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        boolean boolean10 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        double double13 = reservationService11.getPrice("hi!");
        presentation.Reservation reservation18 = reservationService11.createReservation("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        data.ReservationResopsitory reservationResopsitory19 = null;
        business.ReservationService reservationService20 = new business.ReservationService(reservationResopsitory19);
        double double22 = reservationService20.getPrice("");
        presentation.Reservation reservation28 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean30 = reservationService20.confirmReservation(reservation28, false);
        java.lang.String str31 = reservation28.getBeachName();
        java.lang.String str32 = reservation28.getVisitorName();
        java.lang.String str33 = reservation28.getVisitorName();
        boolean boolean34 = reservation28.isConfirmed();
        boolean boolean36 = reservationService11.confirmReservation(reservation28, false);
        java.lang.String str37 = reservation28.toString();
        boolean boolean38 = reservation28.isConfirmed();
        java.lang.String str39 = reservation28.toString();
        java.lang.String str40 = reservation28.getVisitorName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNull(reservation18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str37, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str39, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        int int7 = reservationResopsitory0.getAvailableCount("hi!", "Invalid date. Use YYYY-MM-DD.");
        business.ReservationService reservationService8 = new business.ReservationService(reservationResopsitory0);
        int int11 = reservationResopsitory0.getAvailableCount("Invalid date. Use YYYY-MM-DD.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed");
        business.ReservationService reservationService12 = new business.ReservationService(reservationResopsitory0);
        boolean boolean15 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending");
        int int18 = reservationResopsitory0.getAvailableCount("", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        int int10 = reservationResopsitory0.getAvailableCount("", "hi!");
        boolean boolean13 = reservationResopsitory0.reserve("Visitor name is required.", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending");
        business.ReservationService reservationService14 = new business.ReservationService(reservationResopsitory0);
        presentation.Reservation reservation20 = new presentation.Reservation("Visitor name is required.", "hi!", "", "", 10.0d);
        java.lang.String str21 = reservation20.getFacility();
        double double22 = reservation20.getPrice();
        java.lang.String str23 = reservation20.getFacility();
        reservation20.setConfirmed(true);
        boolean boolean27 = reservationService14.confirmReservation(reservation20, true);
        data.ReservationResopsitory reservationResopsitory28 = null;
        business.ReservationService reservationService29 = new business.ReservationService(reservationResopsitory28);
        double double31 = reservationService29.getPrice("");
        presentation.Reservation reservation37 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean39 = reservationService29.confirmReservation(reservation37, false);
        java.lang.String str40 = reservation37.getBeachName();
        java.lang.String str41 = reservation37.getVisitorName();
        java.lang.String str42 = reservation37.getVisitorName();
        reservation37.setConfirmed(false);
        java.lang.String str45 = reservation37.toString();
        java.lang.String str46 = reservation37.getVisitorName();
        boolean boolean48 = reservationService14.confirmReservation(reservation37, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str45, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        presentation.Reservation reservation5 = new presentation.Reservation("hi!", "hi!", "Visitor name is required.", "", 100.0d);
        java.lang.String str6 = reservation5.getFacility();
        java.lang.String str7 = reservation5.getVisitorName();
        boolean boolean8 = reservation5.isConfirmed();
        java.lang.String str9 = reservation5.getFacility();
        boolean boolean10 = reservation5.isConfirmed();
        double double11 = reservation5.getPrice();
        java.lang.String str12 = reservation5.getFacility();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        boolean boolean10 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        int int14 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending");
        boolean boolean17 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: \nPrice: 100.00 BD\nStatus: Pending", "Visitor name is required.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        business.ReservationService reservationService2 = new business.ReservationService(reservationResopsitory0);
        int int5 = reservationService2.getAvailableCount("\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending", "Invalid date. Use YYYY-MM-DD.");
        presentation.Reservation reservation10 = reservationService2.createReservation("Invalid date. Use YYYY-MM-DD.", "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: hi!\nFacility: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending", "hi!");
        presentation.Reservation reservation11 = null;
        boolean boolean13 = reservationService2.confirmReservation(reservation11, true);
        presentation.Reservation reservation18 = reservationService2.createReservation("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed\nDate: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nFacility: \nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \nFacility: \nPrice: 100.00 BD\nStatus: Pending", "Visitor name is required.", "");
        int int21 = reservationService2.getAvailableCount("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed", "Visitor name is required.");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(reservation10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(reservation18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \nFacility: \nPrice: 100.00 BD\nStatus: Pending", "", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \nDate: \nFacility: \nPrice: 35.00 BD\nStatus: Pending", (double) (short) 100);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "", "", "", 35.0d);
        reservation5.setConfirmed(false);
        java.lang.String str8 = reservation5.toString();
        boolean boolean9 = reservation5.isConfirmed();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \nDate: \nFacility: \nPrice: 35.00 BD\nStatus: Pending" + "'", str8, "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \nDate: \nFacility: \nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        boolean boolean10 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        double double13 = reservationService11.getPrice("hi!");
        presentation.Reservation reservation18 = reservationService11.createReservation("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        data.ReservationResopsitory reservationResopsitory19 = null;
        business.ReservationService reservationService20 = new business.ReservationService(reservationResopsitory19);
        double double22 = reservationService20.getPrice("");
        presentation.Reservation reservation28 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean30 = reservationService20.confirmReservation(reservation28, false);
        java.lang.String str31 = reservation28.getBeachName();
        java.lang.String str32 = reservation28.getVisitorName();
        java.lang.String str33 = reservation28.getVisitorName();
        boolean boolean34 = reservation28.isConfirmed();
        boolean boolean36 = reservationService11.confirmReservation(reservation28, false);
        presentation.Reservation reservation41 = reservationService11.createReservation("Invalid date. Use YYYY-MM-DD.", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "Visitor name is required.", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: Visitor name is required.\nPrice: 0.00 BD\nStatus: Pending");
        presentation.Reservation reservation47 = new presentation.Reservation("Visitor name is required.", "hi!", "", "", 10.0d);
        boolean boolean48 = reservation47.isConfirmed();
        double double49 = reservation47.getPrice();
        boolean boolean51 = reservationService11.confirmReservation(reservation47, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNull(reservation18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(reservation41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "", "Visitor name is required.", (double) 10);
        java.lang.String str6 = reservation5.toString();
        boolean boolean7 = reservation5.isConfirmed();
        double double8 = reservation5.getPrice();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending" + "'", str6, "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        presentation.Reservation reservation5 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        java.lang.String str6 = reservation5.getVisitorName();
        java.lang.String str7 = reservation5.getDate();
        java.lang.String str8 = reservation5.getDate();
        java.lang.String str9 = reservation5.getFacility();
        java.lang.String str10 = reservation5.getVisitorName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        int int10 = reservationResopsitory0.getAvailableCount("", "hi!");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        int int14 = reservationService11.getAvailableCount("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "Visitor name is required.");
        presentation.Reservation reservation19 = reservationService11.createReservation("Visitor name is required.", "", "Invalid date. Use YYYY-MM-DD.", "");
        presentation.Reservation reservation25 = new presentation.Reservation("Visitor name is required.", "Invalid date. Use YYYY-MM-DD.", "Invalid date. Use YYYY-MM-DD.", "", (double) (byte) 1);
        java.lang.String str26 = reservation25.toString();
        boolean boolean28 = reservationService11.confirmReservation(reservation25, false);
        boolean boolean29 = reservation25.isConfirmed();
        java.lang.String str30 = reservation25.getBeachName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(reservation19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending" + "'", str26, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str30, "Invalid date. Use YYYY-MM-DD.");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        int int4 = reservationResopsitory0.getAvailableCount("", "Invalid date. Use YYYY-MM-DD.");
        int int7 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "Visitor name is required.");
        business.ReservationService reservationService8 = new business.ReservationService(reservationResopsitory0);
        presentation.Reservation reservation13 = reservationService8.createReservation("hi!", "Invalid date. Use YYYY-MM-DD.", "", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending");
        int int16 = reservationService8.getAvailableCount("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        java.lang.String str20 = reservationService8.validateRequest("Visitor name is required.", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "hi!");
        int int23 = reservationService8.getAvailableCount("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: hi!\nFacility: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \nFacility: \nPrice: 100.00 BD\nStatus: Pending");
        data.ReservationResopsitory reservationResopsitory24 = null;
        business.ReservationService reservationService25 = new business.ReservationService(reservationResopsitory24);
        double double27 = reservationService25.getPrice("");
        presentation.Reservation reservation33 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean35 = reservationService25.confirmReservation(reservation33, false);
        double double37 = reservationService25.getPrice("Visitor name is required.");
        data.ReservationResopsitory reservationResopsitory38 = null;
        business.ReservationService reservationService39 = new business.ReservationService(reservationResopsitory38);
        double double41 = reservationService39.getPrice("");
        presentation.Reservation reservation46 = reservationService39.createReservation("hi!", "hi!", "", "hi!");
        java.lang.String str50 = reservationService39.validateRequest("Visitor name is required.", "hi!", "");
        data.ReservationResopsitory reservationResopsitory51 = null;
        business.ReservationService reservationService52 = new business.ReservationService(reservationResopsitory51);
        double double54 = reservationService52.getPrice("");
        presentation.Reservation reservation60 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean62 = reservationService52.confirmReservation(reservation60, false);
        boolean boolean64 = reservationService39.confirmReservation(reservation60, false);
        boolean boolean66 = reservationService25.confirmReservation(reservation60, false);
        java.lang.String str70 = reservationService25.validateRequest("Please select a beach.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed");
        presentation.Reservation reservation75 = reservationService25.createReservation("Invalid date. Use YYYY-MM-DD.", "hi!", "Please select a beach.", "Invalid date. Use YYYY-MM-DD.");
        double double77 = reservationService25.getPrice("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed");
        presentation.Reservation reservation83 = new presentation.Reservation("hi!", "", "hi!", "", (double) (byte) 1);
        reservation83.setConfirmed(true);
        boolean boolean86 = reservation83.isConfirmed();
        java.lang.String str87 = reservation83.getDate();
        boolean boolean88 = reservation83.isConfirmed();
        boolean boolean89 = reservation83.isConfirmed();
        boolean boolean91 = reservationService25.confirmReservation(reservation83, false);
        boolean boolean93 = reservationService8.confirmReservation(reservation83, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(reservation13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str20, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
        org.junit.Assert.assertNull(reservation46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str50, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-1.0d) + "'", double54 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str70, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertNull(reservation75);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        boolean boolean10 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        double double13 = reservationService11.getPrice("hi!");
        presentation.Reservation reservation18 = reservationService11.createReservation("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        double double20 = reservationService11.getPrice("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \nDate: \nFacility: \nPrice: 35.00 BD\nStatus: Pending");
        presentation.Reservation reservation26 = new presentation.Reservation("hi!", "", "hi!", "", (double) (byte) 1);
        reservation26.setConfirmed(true);
        boolean boolean29 = reservation26.isConfirmed();
        java.lang.String str30 = reservation26.getDate();
        java.lang.String str31 = reservation26.getVisitorName();
        boolean boolean33 = reservationService11.confirmReservation(reservation26, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNull(reservation18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        boolean boolean10 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        double double13 = reservationService11.getPrice("hi!");
        presentation.Reservation reservation19 = new presentation.Reservation("hi!", "hi!", "Visitor name is required.", "", 100.0d);
        java.lang.String str20 = reservation19.getFacility();
        boolean boolean22 = reservationService11.confirmReservation(reservation19, true);
        data.ReservationResopsitory reservationResopsitory23 = null;
        business.ReservationService reservationService24 = new business.ReservationService(reservationResopsitory23);
        double double26 = reservationService24.getPrice("");
        presentation.Reservation reservation31 = reservationService24.createReservation("hi!", "hi!", "", "hi!");
        java.lang.String str35 = reservationService24.validateRequest("Visitor name is required.", "hi!", "");
        data.ReservationResopsitory reservationResopsitory36 = null;
        business.ReservationService reservationService37 = new business.ReservationService(reservationResopsitory36);
        double double39 = reservationService37.getPrice("");
        presentation.Reservation reservation45 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean47 = reservationService37.confirmReservation(reservation45, false);
        boolean boolean49 = reservationService24.confirmReservation(reservation45, false);
        java.lang.String str50 = reservation45.getFacility();
        java.lang.String str51 = reservation45.toString();
        boolean boolean53 = reservationService11.confirmReservation(reservation45, false);
        java.lang.String str54 = reservation45.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertNull(reservation31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str35, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str51, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str54, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        int int10 = reservationResopsitory0.getAvailableCount("", "hi!");
        boolean boolean13 = reservationResopsitory0.reserve("Visitor name is required.", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending");
        business.ReservationService reservationService14 = new business.ReservationService(reservationResopsitory0);
        boolean boolean17 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending", "Invalid date. Use YYYY-MM-DD.");
        boolean boolean20 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \nFacility: \nPrice: 100.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "Please select a beach.", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", (double) (byte) -1);
        java.lang.String str6 = reservation5.getVisitorName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending" + "'", str6, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        presentation.Reservation reservation5 = new presentation.Reservation("Please select a beach.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed", "hi!", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed", (double) 0.0f);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        int int3 = reservationResopsitory0.getAvailableCount("Invalid date. Use YYYY-MM-DD.", "Visitor name is required.");
        boolean boolean6 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "Invalid date. Use YYYY-MM-DD.");
        boolean boolean9 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        boolean boolean12 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        boolean boolean15 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending", "Invalid date. Use YYYY-MM-DD.");
        business.ReservationService reservationService16 = new business.ReservationService(reservationResopsitory0);
        business.ReservationService reservationService17 = new business.ReservationService(reservationResopsitory0);
        business.ReservationService reservationService18 = new business.ReservationService(reservationResopsitory0);
        presentation.Reservation reservation23 = reservationService18.createReservation("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed\nDate: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nFacility: \nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: \nPrice: 100.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed\nDate: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nFacility: \nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: Visitor name is required.\nPrice: 0.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(reservation23);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        boolean boolean10 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        double double13 = reservationService11.getPrice("hi!");
        presentation.Reservation reservation18 = reservationService11.createReservation("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        int int21 = reservationService11.getAvailableCount("\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nPrice: 35.00 BD\nStatus: Pending");
        presentation.Reservation reservation26 = reservationService11.createReservation("\n--- Reservation Details ---\nVisitor: \nBeach: Invalid date. Use YYYY-MM-DD.\nDate: hi!\nFacility: Visitor name is required.\nPrice: -1.00 BD\nStatus: Confirmed", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: \nDate: \nFacility: Visitor name is required.\nPrice: 35.00 BD\nStatus: Pending", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNull(reservation18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(reservation26);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        presentation.Reservation reservation5 = new presentation.Reservation("Invalid date. Use YYYY-MM-DD.", "Invalid date. Use YYYY-MM-DD.", "Please select a beach.", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", (double) 1);
        java.lang.String str6 = reservation5.getFacility();
        java.lang.String str7 = reservation5.getBeachName();
        java.lang.String str8 = reservation5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending" + "'", str6, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str7, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Please select a beach." + "'", str8, "Please select a beach.");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        int int4 = reservationResopsitory0.getAvailableCount("", "Invalid date. Use YYYY-MM-DD.");
        int int7 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "Visitor name is required.");
        business.ReservationService reservationService8 = new business.ReservationService(reservationResopsitory0);
        business.ReservationService reservationService9 = new business.ReservationService(reservationResopsitory0);
        int int12 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending");
        business.ReservationService reservationService13 = new business.ReservationService(reservationResopsitory0);
        int int16 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: \nBeach: Invalid date. Use YYYY-MM-DD.\nDate: hi!\nFacility: Visitor name is required.\nPrice: -1.00 BD\nStatus: Confirmed", "Please select a beach.");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        double double3 = reservationService1.getPrice("");
        presentation.Reservation reservation8 = reservationService1.createReservation("hi!", "hi!", "", "hi!");
        java.lang.String str12 = reservationService1.validateRequest("Visitor name is required.", "hi!", "");
        data.ReservationResopsitory reservationResopsitory13 = null;
        business.ReservationService reservationService14 = new business.ReservationService(reservationResopsitory13);
        double double16 = reservationService14.getPrice("");
        presentation.Reservation reservation22 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean24 = reservationService14.confirmReservation(reservation22, false);
        boolean boolean26 = reservationService1.confirmReservation(reservation22, false);
        double double28 = reservationService1.getPrice("Visitor name is required.");
        double double30 = reservationService1.getPrice("\n--- Reservation Details ---\nVisitor: \nBeach: Invalid date. Use YYYY-MM-DD.\nDate: hi!\nFacility: Visitor name is required.\nPrice: -1.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNull(reservation8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str12, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        boolean boolean10 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        double double13 = reservationService11.getPrice("hi!");
        int int16 = reservationService11.getAvailableCount("Invalid date. Use YYYY-MM-DD.", "");
        java.lang.String str20 = reservationService11.validateRequest("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending");
        double double22 = reservationService11.getPrice("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        java.lang.Class<?> wildcardClass23 = reservationService11.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str20, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \nFacility: \nPrice: 100.00 BD\nStatus: Pending", (double) 0);
        double double6 = reservation5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        presentation.Reservation reservation5 = new presentation.Reservation("Visitor name is required.", "Invalid date. Use YYYY-MM-DD.", "Invalid date. Use YYYY-MM-DD.", "", (double) (byte) 1);
        java.lang.String str6 = reservation5.toString();
        boolean boolean7 = reservation5.isConfirmed();
        boolean boolean8 = reservation5.isConfirmed();
        java.lang.String str9 = reservation5.getFacility();
        java.lang.String str10 = reservation5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending" + "'", str6, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending" + "'", str10, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        java.lang.String str5 = reservationService1.validateRequest("", "", "");
        presentation.Reservation reservation10 = reservationService1.createReservation("hi!", "Visitor name is required.", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending");
        presentation.Reservation reservation15 = reservationService1.createReservation("hi!", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "Visitor name is required.", "Visitor name is required.");
        double double17 = reservationService1.getPrice("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed");
        java.lang.String str21 = reservationService1.validateRequest("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: \nPrice: 100.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending");
        java.lang.Class<?> wildcardClass22 = reservationService1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Visitor name is required." + "'", str5, "Visitor name is required.");
        org.junit.Assert.assertNull(reservation10);
        org.junit.Assert.assertNull(reservation15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str21, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        business.ReservationService reservationService2 = new business.ReservationService(reservationResopsitory0);
        presentation.Reservation reservation7 = reservationService2.createReservation("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "hi!", "Invalid date. Use YYYY-MM-DD.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed");
        presentation.Reservation reservation12 = reservationService2.createReservation("\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending", "Visitor name is required.");
        data.ReservationResopsitory reservationResopsitory13 = new data.ReservationResopsitory();
        business.ReservationService reservationService14 = new business.ReservationService(reservationResopsitory13);
        boolean boolean17 = reservationResopsitory13.reserve("", "");
        boolean boolean20 = reservationResopsitory13.reserve("Visitor name is required.", "Visitor name is required.");
        boolean boolean23 = reservationResopsitory13.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService24 = new business.ReservationService(reservationResopsitory13);
        presentation.Reservation reservation30 = new presentation.Reservation("Visitor name is required.", "hi!", "", "", 10.0d);
        boolean boolean32 = reservationService24.confirmReservation(reservation30, false);
        presentation.Reservation reservation38 = new presentation.Reservation("", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending", "Invalid date. Use YYYY-MM-DD.", "Invalid date. Use YYYY-MM-DD.", (double) 'a');
        boolean boolean40 = reservationService24.confirmReservation(reservation38, false);
        reservation38.setConfirmed(false);
        double double43 = reservation38.getPrice();
        boolean boolean45 = reservationService2.confirmReservation(reservation38, false);
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertNull(reservation12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 97.0d + "'", double43 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService5 = new business.ReservationService(reservationResopsitory0);
        presentation.Reservation reservation10 = reservationService5.createReservation("\n--- Reservation Details ---\nVisitor: hi!\nBeach: hi!\nDate: Visitor name is required.\nFacility: \nPrice: 100.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: \nPrice: 100.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        presentation.Reservation reservation16 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        java.lang.String str17 = reservation16.getBeachName();
        boolean boolean19 = reservationService5.confirmReservation(reservation16, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reservation10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        presentation.Reservation reservation5 = new presentation.Reservation("Visitor name is required.", "hi!", "", "", 10.0d);
        boolean boolean6 = reservation5.isConfirmed();
        reservation5.setConfirmed(false);
        double double9 = reservation5.getPrice();
        reservation5.setConfirmed(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        int int3 = reservationResopsitory0.getAvailableCount("hi!", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        business.ReservationService reservationService4 = new business.ReservationService(reservationResopsitory0);
        presentation.Reservation reservation10 = new presentation.Reservation("Visitor name is required.", "hi!", "", "", 10.0d);
        java.lang.String str11 = reservation10.getFacility();
        java.lang.String str12 = reservation10.toString();
        java.lang.String str13 = reservation10.getBeachName();
        java.lang.String str14 = reservation10.getBeachName();
        boolean boolean16 = reservationService4.confirmReservation(reservation10, false);
        presentation.Reservation reservation22 = new presentation.Reservation("", "Invalid date. Use YYYY-MM-DD.", "hi!", "Visitor name is required.", (double) (-1L));
        java.lang.String str23 = reservation22.getDate();
        boolean boolean25 = reservationService4.confirmReservation(reservation22, true);
        java.lang.String str29 = reservationService4.validateRequest("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \nDate: \nFacility: \nPrice: 35.00 BD\nStatus: Pending", "Invalid date. Use YYYY-MM-DD.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed");
        double double31 = reservationService4.getPrice("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending" + "'", str12, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str29, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        boolean boolean10 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        int int13 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed", "hi!");
        int int16 = reservationResopsitory0.getAvailableCount("hi!", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending");
        business.ReservationService reservationService17 = new business.ReservationService(reservationResopsitory0);
        presentation.Reservation reservation22 = reservationService17.createReservation("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed\nDate: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nFacility: \nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending", "Please select a beach.", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed\nDate: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nFacility: \nPrice: 10.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(reservation22);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        int int7 = reservationResopsitory0.getAvailableCount("hi!", "Invalid date. Use YYYY-MM-DD.");
        business.ReservationService reservationService8 = new business.ReservationService(reservationResopsitory0);
        int int11 = reservationService8.getAvailableCount("\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "Please select a beach.");
        java.lang.String str15 = reservationService8.validateRequest("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "hi!", "");
        java.lang.String str19 = reservationService8.validateRequest("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \nDate: \nFacility: \nPrice: 35.00 BD\nStatus: Pending", "Please select a beach.", "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending");
        data.ReservationResopsitory reservationResopsitory20 = null;
        business.ReservationService reservationService21 = new business.ReservationService(reservationResopsitory20);
        double double23 = reservationService21.getPrice("");
        presentation.Reservation reservation28 = reservationService21.createReservation("hi!", "hi!", "", "hi!");
        java.lang.String str32 = reservationService21.validateRequest("Visitor name is required.", "hi!", "");
        data.ReservationResopsitory reservationResopsitory33 = null;
        business.ReservationService reservationService34 = new business.ReservationService(reservationResopsitory33);
        double double36 = reservationService34.getPrice("");
        presentation.Reservation reservation42 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean44 = reservationService34.confirmReservation(reservation42, false);
        boolean boolean46 = reservationService21.confirmReservation(reservation42, false);
        boolean boolean47 = reservation42.isConfirmed();
        java.lang.String str48 = reservation42.getDate();
        boolean boolean50 = reservationService8.confirmReservation(reservation42, true);
        reservation42.setConfirmed(true);
        java.lang.String str53 = reservation42.toString();
        java.lang.String str54 = reservation42.getDate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str15, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str19, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNull(reservation28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str32, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed" + "'", str53, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        int int4 = reservationResopsitory0.getAvailableCount("", "Invalid date. Use YYYY-MM-DD.");
        boolean boolean7 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed");
        business.ReservationService reservationService8 = new business.ReservationService(reservationResopsitory0);
        business.ReservationService reservationService9 = new business.ReservationService(reservationResopsitory0);
        boolean boolean12 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \nFacility: \nPrice: 100.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        int int10 = reservationResopsitory0.getAvailableCount("Visitor name is required.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed");
        int int13 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed");
        int int16 = reservationResopsitory0.getAvailableCount("Invalid date. Use YYYY-MM-DD.", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \nDate: \nFacility: \nPrice: 35.00 BD\nStatus: Pending");
        business.ReservationService reservationService17 = new business.ReservationService(reservationResopsitory0);
        presentation.Reservation reservation22 = reservationService17.createReservation("\n--- Reservation Details ---\nVisitor: \nBeach: Invalid date. Use YYYY-MM-DD.\nDate: hi!\nFacility: Visitor name is required.\nPrice: -1.00 BD\nStatus: Confirmed", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed\nDate: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nFacility: \nPrice: 10.00 BD\nStatus: Pending", "Invalid date. Use YYYY-MM-DD.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(reservation22);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        int int3 = reservationResopsitory0.getAvailableCount("hi!", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        business.ReservationService reservationService4 = new business.ReservationService(reservationResopsitory0);
        int int7 = reservationService4.getAvailableCount("", "Invalid date. Use YYYY-MM-DD.");
        int int10 = reservationService4.getAvailableCount("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed", "");
        presentation.Reservation reservation16 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        java.lang.String str17 = reservation16.toString();
        reservation16.setConfirmed(false);
        java.lang.String str20 = reservation16.getDate();
        boolean boolean22 = reservationService4.confirmReservation(reservation16, false);
        java.lang.String str23 = reservation16.getFacility();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str17, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        java.lang.String str5 = reservationService1.validateRequest("", "", "");
        presentation.Reservation reservation10 = reservationService1.createReservation("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending", "Invalid date. Use YYYY-MM-DD.", "", "");
        java.lang.String str14 = reservationService1.validateRequest("hi!", "hi!", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending");
        presentation.Reservation reservation19 = reservationService1.createReservation("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \nDate: \nFacility: \nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: \nPrice: 100.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \nFacility: \nPrice: 100.00 BD\nStatus: Pending");
        double double21 = reservationService1.getPrice("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending");
        double double23 = reservationService1.getPrice("Visitor name is required.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Visitor name is required." + "'", str5, "Visitor name is required.");
        org.junit.Assert.assertNull(reservation10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str14, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertNull(reservation19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        double double3 = reservationService1.getPrice("");
        presentation.Reservation reservation9 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean11 = reservationService1.confirmReservation(reservation9, false);
        double double12 = reservation9.getPrice();
        java.lang.String str13 = reservation9.getDate();
        reservation9.setConfirmed(true);
        java.lang.String str16 = reservation9.getDate();
        java.lang.String str17 = reservation9.getBeachName();
        double double18 = reservation9.getPrice();
        java.lang.String str19 = reservation9.toString();
        boolean boolean20 = reservation9.isConfirmed();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed" + "'", str19, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        int int7 = reservationResopsitory0.getAvailableCount("hi!", "Invalid date. Use YYYY-MM-DD.");
        business.ReservationService reservationService8 = new business.ReservationService(reservationResopsitory0);
        int int11 = reservationService8.getAvailableCount("\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "Please select a beach.");
        java.lang.String str15 = reservationService8.validateRequest("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "hi!", "");
        java.lang.String str19 = reservationService8.validateRequest("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \nDate: \nFacility: \nPrice: 35.00 BD\nStatus: Pending", "Please select a beach.", "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending");
        data.ReservationResopsitory reservationResopsitory20 = null;
        business.ReservationService reservationService21 = new business.ReservationService(reservationResopsitory20);
        double double23 = reservationService21.getPrice("");
        presentation.Reservation reservation28 = reservationService21.createReservation("hi!", "hi!", "", "hi!");
        java.lang.String str32 = reservationService21.validateRequest("Visitor name is required.", "hi!", "");
        data.ReservationResopsitory reservationResopsitory33 = null;
        business.ReservationService reservationService34 = new business.ReservationService(reservationResopsitory33);
        double double36 = reservationService34.getPrice("");
        presentation.Reservation reservation42 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean44 = reservationService34.confirmReservation(reservation42, false);
        boolean boolean46 = reservationService21.confirmReservation(reservation42, false);
        boolean boolean47 = reservation42.isConfirmed();
        java.lang.String str48 = reservation42.getDate();
        boolean boolean50 = reservationService8.confirmReservation(reservation42, true);
        int int53 = reservationService8.getAvailableCount("", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: \nPrice: 100.00 BD\nStatus: Pending");
        java.lang.String str57 = reservationService8.validateRequest("Please select a beach.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending", "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str15, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str19, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNull(reservation28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str32, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str57, "Invalid date. Use YYYY-MM-DD.");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        int int10 = reservationResopsitory0.getAvailableCount("", "hi!");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        int int14 = reservationService11.getAvailableCount("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "Visitor name is required.");
        java.lang.String str18 = reservationService11.validateRequest("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending");
        java.lang.Class<?> wildcardClass19 = reservationService11.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str18, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        boolean boolean10 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        double double13 = reservationService11.getPrice("hi!");
        java.lang.String str17 = reservationService11.validateRequest("\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending", "Invalid date. Use YYYY-MM-DD.");
        presentation.Reservation reservation23 = new presentation.Reservation("Visitor name is required.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending", (double) (byte) 0);
        boolean boolean25 = reservationService11.confirmReservation(reservation23, true);
        presentation.Reservation reservation31 = new presentation.Reservation("Visitor name is required.", "Invalid date. Use YYYY-MM-DD.", "Invalid date. Use YYYY-MM-DD.", "", (double) (byte) 1);
        java.lang.String str32 = reservation31.toString();
        boolean boolean33 = reservation31.isConfirmed();
        java.lang.String str34 = reservation31.toString();
        boolean boolean36 = reservationService11.confirmReservation(reservation31, false);
        int int39 = reservationService11.getAvailableCount("\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: \nPrice: 100.00 BD\nStatus: Pending");
        int int42 = reservationService11.getAvailableCount("\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str17, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending" + "'", str32, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending" + "'", str34, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        boolean boolean10 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        double double13 = reservationService11.getPrice("hi!");
        presentation.Reservation reservation19 = new presentation.Reservation("hi!", "hi!", "Visitor name is required.", "", 100.0d);
        java.lang.String str20 = reservation19.getFacility();
        boolean boolean22 = reservationService11.confirmReservation(reservation19, true);
        int int25 = reservationService11.getAvailableCount("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "Please select a beach.");
        double double27 = reservationService11.getPrice("Invalid date. Use YYYY-MM-DD.");
        presentation.Reservation reservation32 = reservationService11.createReservation("", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed");
        presentation.Reservation reservation38 = new presentation.Reservation("Visitor name is required.", "hi!", "", "", 10.0d);
        java.lang.String str39 = reservation38.getBeachName();
        boolean boolean41 = reservationService11.confirmReservation(reservation38, false);
        presentation.Reservation reservation46 = reservationService11.createReservation("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: Visitor name is required.\nPrice: 0.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \nFacility: \nPrice: 100.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: hi!\nDate: Visitor name is required.\nFacility: \nPrice: 100.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNull(reservation32);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(reservation46);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        int int7 = reservationResopsitory0.getAvailableCount("hi!", "Invalid date. Use YYYY-MM-DD.");
        int int10 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        int int14 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: hi!\nBeach: hi!\nDate: Visitor name is required.\nFacility: \nPrice: 100.00 BD\nStatus: Pending", "");
        business.ReservationService reservationService15 = new business.ReservationService(reservationResopsitory0);
        business.ReservationService reservationService16 = new business.ReservationService(reservationResopsitory0);
        business.ReservationService reservationService17 = new business.ReservationService(reservationResopsitory0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        int int10 = reservationResopsitory0.getAvailableCount("", "hi!");
        int int13 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        boolean boolean16 = reservationResopsitory0.reserve("", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: \nPrice: 100.00 BD\nStatus: Pending");
        business.ReservationService reservationService17 = new business.ReservationService(reservationResopsitory0);
        double double19 = reservationService17.getPrice("\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        presentation.Reservation reservation5 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        java.lang.String str6 = reservation5.toString();
        double double7 = reservation5.getPrice();
        java.lang.String str8 = reservation5.getBeachName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending" + "'", str6, "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        presentation.Reservation reservation5 = new presentation.Reservation("Visitor name is required.", "Invalid date. Use YYYY-MM-DD.", "Invalid date. Use YYYY-MM-DD.", "", (double) (byte) 1);
        java.lang.String str6 = reservation5.toString();
        java.lang.String str7 = reservation5.getBeachName();
        java.lang.String str8 = reservation5.getVisitorName();
        double double9 = reservation5.getPrice();
        java.lang.String str10 = reservation5.getFacility();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending" + "'", str6, "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str7, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Visitor name is required." + "'", str8, "Visitor name is required.");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        int int10 = reservationResopsitory0.getAvailableCount("Invalid date. Use YYYY-MM-DD.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        boolean boolean14 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nPrice: 35.00 BD\nStatus: Pending", "hi!");
        int int17 = reservationResopsitory0.getAvailableCount("Please select a beach.", "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nPrice: 35.00 BD\nStatus: Pending");
        java.lang.Class<?> wildcardClass18 = reservationResopsitory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "Visitor name is required.", "Visitor name is required.", "Invalid date. Use YYYY-MM-DD.", (double) ' ');
        java.lang.String str6 = reservation5.getVisitorName();
        java.lang.String str7 = reservation5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending" + "'", str6, "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Visitor name is required." + "'", str7, "Visitor name is required.");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        int int3 = reservationResopsitory0.getAvailableCount("Invalid date. Use YYYY-MM-DD.", "Visitor name is required.");
        boolean boolean6 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "Invalid date. Use YYYY-MM-DD.");
        business.ReservationService reservationService7 = new business.ReservationService(reservationResopsitory0);
        boolean boolean10 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed", "Invalid date. Use YYYY-MM-DD.");
        int int13 = reservationResopsitory0.getAvailableCount("Please select a beach.", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending");
        int int16 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: hi!\nBeach: hi!\nDate: Visitor name is required.\nFacility: \nPrice: 100.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed");
        boolean boolean19 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        int int10 = reservationResopsitory0.getAvailableCount("Invalid date. Use YYYY-MM-DD.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        boolean boolean14 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        boolean boolean17 = reservationResopsitory0.reserve("Visitor name is required.", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: \nPrice: 100.00 BD\nStatus: Pending");
        business.ReservationService reservationService18 = new business.ReservationService(reservationResopsitory0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        int int10 = reservationResopsitory0.getAvailableCount("Visitor name is required.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed");
        int int13 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending");
        int int16 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending");
        int int19 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        double double3 = reservationService1.getPrice("");
        presentation.Reservation reservation9 = new presentation.Reservation("hi!", "", "hi!", "hi!", (double) '#');
        boolean boolean11 = reservationService1.confirmReservation(reservation9, false);
        boolean boolean12 = reservation9.isConfirmed();
        java.lang.String str13 = reservation9.getDate();
        java.lang.String str14 = reservation9.getFacility();
        boolean boolean15 = reservation9.isConfirmed();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: \nDate: \nFacility: Visitor name is required.\nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \nBeach: Invalid date. Use YYYY-MM-DD.\nDate: hi!\nFacility: Visitor name is required.\nPrice: -1.00 BD\nStatus: Confirmed", "\n--- Reservation Details ---\nVisitor: \nBeach: Invalid date. Use YYYY-MM-DD.\nDate: hi!\nFacility: Visitor name is required.\nPrice: -1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending", (double) 10.0f);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        boolean boolean7 = reservationResopsitory0.reserve("Visitor name is required.", "Visitor name is required.");
        boolean boolean10 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        presentation.Reservation reservation17 = new presentation.Reservation("Visitor name is required.", "hi!", "", "", 10.0d);
        boolean boolean19 = reservationService11.confirmReservation(reservation17, false);
        presentation.Reservation reservation25 = new presentation.Reservation("", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending", "Invalid date. Use YYYY-MM-DD.", "Invalid date. Use YYYY-MM-DD.", (double) 'a');
        boolean boolean27 = reservationService11.confirmReservation(reservation25, false);
        java.lang.String str31 = reservationService11.validateRequest("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending");
        presentation.Reservation reservation36 = reservationService11.createReservation("Invalid date. Use YYYY-MM-DD.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: hi!\nFacility: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending", "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str31, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertNull(reservation36);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        int int3 = reservationResopsitory0.getAvailableCount("hi!", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        business.ReservationService reservationService4 = new business.ReservationService(reservationResopsitory0);
        int int7 = reservationService4.getAvailableCount("", "Invalid date. Use YYYY-MM-DD.");
        int int10 = reservationService4.getAvailableCount("Please select a beach.", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending");
        data.ReservationResopsitory reservationResopsitory11 = new data.ReservationResopsitory();
        business.ReservationService reservationService12 = new business.ReservationService(reservationResopsitory11);
        boolean boolean15 = reservationResopsitory11.reserve("", "");
        boolean boolean18 = reservationResopsitory11.reserve("Visitor name is required.", "Visitor name is required.");
        boolean boolean21 = reservationResopsitory11.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService22 = new business.ReservationService(reservationResopsitory11);
        double double24 = reservationService22.getPrice("hi!");
        presentation.Reservation reservation30 = new presentation.Reservation("hi!", "hi!", "Visitor name is required.", "", 100.0d);
        java.lang.String str31 = reservation30.getFacility();
        boolean boolean33 = reservationService22.confirmReservation(reservation30, true);
        boolean boolean34 = reservation30.isConfirmed();
        boolean boolean35 = reservation30.isConfirmed();
        java.lang.String str36 = reservation30.getVisitorName();
        java.lang.String str37 = reservation30.getFacility();
        boolean boolean39 = reservationService4.confirmReservation(reservation30, false);
        presentation.Reservation reservation45 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "", "", "", 35.0d);
        reservation45.setConfirmed(false);
        java.lang.String str48 = reservation45.toString();
        boolean boolean50 = reservationService4.confirmReservation(reservation45, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \nDate: \nFacility: \nPrice: 35.00 BD\nStatus: Pending" + "'", str48, "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \nDate: \nFacility: \nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("", "");
        int int7 = reservationResopsitory0.getAvailableCount("hi!", "Invalid date. Use YYYY-MM-DD.");
        int int10 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed", "hi!");
        boolean boolean13 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed");
        int int16 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed");
        int int19 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: hi!\nBeach: hi!\nDate: Visitor name is required.\nFacility: \nPrice: 100.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending");
        business.ReservationService reservationService20 = new business.ReservationService(reservationResopsitory0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed", (double) 100);
        java.lang.String str6 = reservation5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending" + "'", str6, "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        int int3 = reservationResopsitory0.getAvailableCount("Invalid date. Use YYYY-MM-DD.", "Visitor name is required.");
        int int6 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending", "hi!");
        boolean boolean9 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending", "");
        int int12 = reservationResopsitory0.getAvailableCount("", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: hi!\nFacility: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nPrice: 0.00 BD\nStatus: Pending");
        business.ReservationService reservationService13 = new business.ReservationService(reservationResopsitory0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        int int4 = reservationResopsitory0.getAvailableCount("", "Invalid date. Use YYYY-MM-DD.");
        boolean boolean7 = reservationResopsitory0.reserve("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed");
        int int10 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \nFacility: Visitor name is required.\nPrice: 10.00 BD\nStatus: Pending\nFacility: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending\nPrice: 35.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed");
        boolean boolean13 = reservationResopsitory0.reserve("Visitor name is required.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: hi!\nDate: Visitor name is required.\nFacility: \nPrice: 100.00 BD\nStatus: Pending");
        int int16 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: hi!\nBeach: hi!\nDate: Visitor name is required.\nFacility: \nPrice: 100.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Confirmed");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        data.ReservationResopsitory reservationResopsitory0 = null;
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        double double3 = reservationService1.getPrice("");
        presentation.Reservation reservation8 = reservationService1.createReservation("hi!", "hi!", "", "hi!");
        java.lang.String str12 = reservationService1.validateRequest("Visitor name is required.", "hi!", "");
        double double14 = reservationService1.getPrice("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        presentation.Reservation reservation19 = reservationService1.createReservation("", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "hi!", "hi!");
        presentation.Reservation reservation24 = reservationService1.createReservation("", "\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: hi!\nDate: \nFacility: \nPrice: 10.00 BD\nStatus: Pending", "Visitor name is required.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending");
        java.lang.String str28 = reservationService1.validateRequest("Please select a beach.", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending", "");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNull(reservation8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str12, "Invalid date. Use YYYY-MM-DD.");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNull(reservation19);
        org.junit.Assert.assertNull(reservation24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Invalid date. Use YYYY-MM-DD." + "'", str28, "Invalid date. Use YYYY-MM-DD.");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        presentation.Reservation reservation5 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: Invalid date. Use YYYY-MM-DD.\nBeach: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nFacility: \nPrice: 32.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending", "", (double) 100L);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        data.ReservationResopsitory reservationResopsitory0 = new data.ReservationResopsitory();
        business.ReservationService reservationService1 = new business.ReservationService(reservationResopsitory0);
        boolean boolean4 = reservationResopsitory0.reserve("Invalid date. Use YYYY-MM-DD.", "hi!");
        business.ReservationService reservationService5 = new business.ReservationService(reservationResopsitory0);
        business.ReservationService reservationService6 = new business.ReservationService(reservationResopsitory0);
        int int9 = reservationResopsitory0.getAvailableCount("\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: \nPrice: 1.00 BD\nStatus: Confirmed");
        business.ReservationService reservationService10 = new business.ReservationService(reservationResopsitory0);
        business.ReservationService reservationService11 = new business.ReservationService(reservationResopsitory0);
        presentation.Reservation reservation16 = reservationService11.createReservation("Visitor name is required.", "\n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: \nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: Invalid date. Use YYYY-MM-DD.\nPrice: 97.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: Visitor name is required.\nPrice: 0.00 BD\nStatus: Pending", "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nDate: \n--- Reservation Details ---\nVisitor: hi!\nBeach: \nDate: hi!\nFacility: hi!\nPrice: 35.00 BD\nStatus: Pending\nFacility: \nPrice: 100.00 BD\nStatus: Pending");
        presentation.Reservation reservation22 = new presentation.Reservation("\n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending", "", "", "", 35.0d);
        reservation22.setConfirmed(false);
        java.lang.String str25 = reservation22.toString();
        java.lang.String str26 = reservation22.getDate();
        boolean boolean27 = reservation22.isConfirmed();
        boolean boolean29 = reservationService11.confirmReservation(reservation22, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(reservation16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \nDate: \nFacility: \nPrice: 35.00 BD\nStatus: Pending" + "'", str25, "\n--- Reservation Details ---\nVisitor: \n--- Reservation Details ---\nVisitor: Visitor name is required.\nBeach: Invalid date. Use YYYY-MM-DD.\nDate: Invalid date. Use YYYY-MM-DD.\nFacility: \nPrice: 1.00 BD\nStatus: Pending\nBeach: \nDate: \nFacility: \nPrice: 35.00 BD\nStatus: Pending");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }
}

