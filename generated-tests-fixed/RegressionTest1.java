import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test٥٠١() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٠١");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user13 = userRepository0.findByEmail("hi!");
        uc2login.data.UserRepository userRepository14 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService15 = new uc2login.business.AuthenticationService(userRepository14);
        uc2login.data.User user17 = userRepository14.findByEmail("hi!");
        uc2login.business.AuthenticationService authenticationService18 = new uc2login.business.AuthenticationService(userRepository14);
        uc2login.data.User user22 = new uc2login.data.User("", "", "");
        java.lang.String str23 = user22.getRole();
        java.lang.String str24 = user22.getEmail();
        java.lang.String str25 = user22.getRole();
        userRepository14.addUser(user22);
        java.lang.String str27 = user22.getPasswordHash();
        java.lang.String str28 = user22.getRole();
        userRepository0.addUser(user22);
        uc2login.data.User user31 = userRepository0.findByEmail("hi!");
        uc2login.data.User user35 = new uc2login.data.User("", "", "");
        java.lang.String str36 = user35.getRole();
        java.lang.String str37 = user35.getRole();
        java.lang.String str38 = user35.getPasswordHash();
        java.lang.String str39 = user35.getPasswordHash();
        java.lang.String str40 = user35.getPasswordHash();
        userRepository0.addUser(user35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(user31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test٥٠٢() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٠٢");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user3 = userRepository0.findByEmail("hi!");
        uc2login.business.AuthenticationService authenticationService4 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user8 = new uc2login.data.User("", "", "");
        java.lang.String str9 = user8.getRole();
        java.lang.String str10 = user8.getRole();
        java.lang.String str11 = user8.getRole();
        java.lang.String str12 = user8.getPasswordHash();
        userRepository0.addUser(user8);
        java.lang.String str14 = user8.getEmail();
        java.lang.String str15 = user8.getRole();
        java.lang.String str16 = user8.getRole();
        java.lang.String str17 = user8.getRole();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test٥٠٣() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٠٣");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.data.User user2 = userRepository0.findByEmail("");
        uc2login.data.User user4 = userRepository0.findByEmail("hi!");
        uc2login.data.UserRepository userRepository5 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService6 = new uc2login.business.AuthenticationService(userRepository5);
        uc2login.data.User user10 = new uc2login.data.User("", "", "");
        java.lang.String str11 = user10.getRole();
        java.lang.String str12 = user10.getEmail();
        userRepository5.addUser(user10);
        userRepository0.addUser(user10);
        uc2login.data.UserRepository userRepository15 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService16 = new uc2login.business.AuthenticationService(userRepository15);
        uc2login.data.User user18 = userRepository15.findByEmail("hi!");
        uc2login.business.AuthenticationService authenticationService19 = new uc2login.business.AuthenticationService(userRepository15);
        uc2login.data.UserRepository userRepository20 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService21 = new uc2login.business.AuthenticationService(userRepository20);
        uc2login.data.User user25 = new uc2login.data.User("", "", "");
        java.lang.String str26 = user25.getRole();
        java.lang.String str27 = user25.getEmail();
        userRepository20.addUser(user25);
        uc2login.data.User user30 = userRepository20.findByEmail("");
        java.lang.String str31 = user30.getPasswordHash();
        userRepository15.addUser(user30);
        userRepository0.addUser(user30);
        uc2login.data.User user35 = userRepository0.findByEmail("hi!");
        uc2login.data.User user37 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService38 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean41 = authenticationService38.login("hi!", "hi!");
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(user35);
        org.junit.Assert.assertNotNull(user37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test٥٠٤() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٠٤");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.data.User user12 = userRepository0.findByEmail("");
        uc2login.data.User user14 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService15 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService16 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository17 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService18 = new uc2login.business.AuthenticationService(userRepository17);
        uc2login.data.User user22 = new uc2login.data.User("", "", "");
        java.lang.String str23 = user22.getRole();
        java.lang.String str24 = user22.getEmail();
        userRepository17.addUser(user22);
        uc2login.data.User user27 = userRepository17.findByEmail("");
        java.lang.String str28 = user27.getEmail();
        java.lang.String str29 = user27.getRole();
        userRepository0.addUser(user27);
        uc2login.data.User user32 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService33 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository34 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService35 = new uc2login.business.AuthenticationService(userRepository34);
        uc2login.business.AuthenticationService authenticationService36 = new uc2login.business.AuthenticationService(userRepository34);
        uc2login.data.User user40 = new uc2login.data.User("", "", "");
        java.lang.String str41 = user40.getRole();
        java.lang.String str42 = user40.getRole();
        java.lang.String str43 = user40.getRole();
        userRepository34.addUser(user40);
        userRepository0.addUser(user40);
        uc2login.data.UserRepository userRepository46 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService47 = new uc2login.business.AuthenticationService(userRepository46);
        uc2login.data.User user51 = new uc2login.data.User("", "", "");
        java.lang.String str52 = user51.getRole();
        java.lang.String str53 = user51.getEmail();
        userRepository46.addUser(user51);
        uc2login.data.User user56 = userRepository46.findByEmail("");
        uc2login.data.User user58 = userRepository46.findByEmail("");
        uc2login.business.AuthenticationService authenticationService59 = new uc2login.business.AuthenticationService(userRepository46);
        uc2login.business.AuthenticationService authenticationService60 = new uc2login.business.AuthenticationService(userRepository46);
        uc2login.data.UserRepository userRepository61 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService62 = new uc2login.business.AuthenticationService(userRepository61);
        uc2login.data.User user66 = new uc2login.data.User("", "", "");
        java.lang.String str67 = user66.getRole();
        java.lang.String str68 = user66.getEmail();
        userRepository61.addUser(user66);
        uc2login.data.User user71 = userRepository61.findByEmail("");
        uc2login.business.AuthenticationService authenticationService72 = new uc2login.business.AuthenticationService(userRepository61);
        uc2login.data.UserRepository userRepository73 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService74 = new uc2login.business.AuthenticationService(userRepository73);
        uc2login.data.User user78 = new uc2login.data.User("", "", "");
        java.lang.String str79 = user78.getRole();
        java.lang.String str80 = user78.getEmail();
        userRepository73.addUser(user78);
        uc2login.data.User user83 = userRepository73.findByEmail("");
        userRepository61.addUser(user83);
        uc2login.business.AuthenticationService authenticationService85 = new uc2login.business.AuthenticationService(userRepository61);
        uc2login.business.AuthenticationService authenticationService86 = new uc2login.business.AuthenticationService(userRepository61);
        uc2login.business.AuthenticationService authenticationService87 = new uc2login.business.AuthenticationService(userRepository61);
        uc2login.data.User user89 = userRepository61.findByEmail("");
        java.lang.String str90 = user89.getRole();
        java.lang.String str91 = user89.getEmail();
        java.lang.String str92 = user89.getEmail();
        java.lang.String str93 = user89.getPasswordHash();
        java.lang.String str94 = user89.getRole();
        userRepository46.addUser(user89);
        uc2login.data.User user97 = userRepository46.findByEmail("");
        userRepository0.addUser(user97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(user32);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(user56);
        org.junit.Assert.assertNotNull(user58);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(user71);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(user83);
        org.junit.Assert.assertNotNull(user89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertNotNull(user97);
    }

    @Test
    public void test٥٠٥() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٠٥");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean3 = authenticationService1.userExists("");
        boolean boolean6 = authenticationService1.login("", "");
        boolean boolean8 = authenticationService1.userExists("");
        boolean boolean10 = authenticationService1.userExists("");
        boolean boolean13 = authenticationService1.login("hi!", "hi!");
        boolean boolean16 = authenticationService1.validateInput("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test٥٠٦() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٠٦");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.data.User user12 = userRepository0.findByEmail("");
        uc2login.data.User user14 = userRepository0.findByEmail("");
        java.lang.String str15 = user14.getPasswordHash();
        java.lang.String str16 = user14.getEmail();
        java.lang.String str17 = user14.getEmail();
        java.lang.Class<?> wildcardClass18 = user14.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test٥٠٧() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٠٧");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user13 = userRepository0.findByEmail("hi!");
        uc2login.data.User user15 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService16 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user18 = userRepository0.findByEmail("hi!");
        uc2login.data.User user22 = new uc2login.data.User("hi!", "hi!", "hi!");
        userRepository0.addUser(user22);
        uc2login.data.User user25 = userRepository0.findByEmail("");
        uc2login.data.User user27 = userRepository0.findByEmail("");
        java.lang.String str28 = user27.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNotNull(user25);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test٥٠٨() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٠٨");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository12 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService13 = new uc2login.business.AuthenticationService(userRepository12);
        uc2login.data.User user17 = new uc2login.data.User("", "", "");
        java.lang.String str18 = user17.getRole();
        java.lang.String str19 = user17.getEmail();
        userRepository12.addUser(user17);
        uc2login.data.User user22 = userRepository12.findByEmail("");
        userRepository0.addUser(user22);
        uc2login.business.AuthenticationService authenticationService24 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean27 = authenticationService24.login("", "");
        boolean boolean29 = authenticationService24.userExists("hi!");
        java.lang.Class<?> wildcardClass30 = authenticationService24.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test٥٠٩() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٠٩");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user3 = userRepository0.findByEmail("hi!");
        uc2login.data.User user5 = userRepository0.findByEmail("hi!");
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test٥١٠() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥١٠");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.data.User user12 = userRepository0.findByEmail("");
        uc2login.data.User user14 = userRepository0.findByEmail("");
        uc2login.data.User user16 = userRepository0.findByEmail("");
        java.lang.String str17 = user16.getEmail();
        java.lang.String str18 = user16.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test٥١١() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥١١");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.data.User user12 = userRepository0.findByEmail("");
        uc2login.data.User user14 = userRepository0.findByEmail("");
        uc2login.data.User user16 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService17 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository18 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService19 = new uc2login.business.AuthenticationService(userRepository18);
        uc2login.data.User user23 = new uc2login.data.User("", "", "");
        java.lang.String str24 = user23.getRole();
        java.lang.String str25 = user23.getEmail();
        userRepository18.addUser(user23);
        uc2login.data.User user28 = userRepository18.findByEmail("");
        java.lang.String str29 = user28.getPasswordHash();
        java.lang.String str30 = user28.getEmail();
        java.lang.String str31 = user28.getPasswordHash();
        userRepository0.addUser(user28);
        uc2login.business.AuthenticationService authenticationService33 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository34 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService35 = new uc2login.business.AuthenticationService(userRepository34);
        uc2login.data.User user39 = new uc2login.data.User("", "", "");
        java.lang.String str40 = user39.getRole();
        java.lang.String str41 = user39.getEmail();
        userRepository34.addUser(user39);
        uc2login.data.User user44 = userRepository34.findByEmail("");
        uc2login.data.User user46 = userRepository34.findByEmail("");
        uc2login.data.User user48 = userRepository34.findByEmail("");
        uc2login.business.AuthenticationService authenticationService49 = new uc2login.business.AuthenticationService(userRepository34);
        uc2login.business.AuthenticationService authenticationService50 = new uc2login.business.AuthenticationService(userRepository34);
        uc2login.data.User user52 = userRepository34.findByEmail("");
        userRepository0.addUser(user52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(user44);
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertNotNull(user48);
        org.junit.Assert.assertNotNull(user52);
    }

    @Test
    public void test٥١٢() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥١٢");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean3 = authenticationService1.userExists("");
        boolean boolean6 = authenticationService1.login("hi!", "hi!");
        boolean boolean9 = authenticationService1.validateInput("hi!", "hi!");
        boolean boolean12 = authenticationService1.validateInput("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test٥١٣() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥١٣");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.data.User user12 = userRepository0.findByEmail("hi!");
        uc2login.data.User user14 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService15 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean18 = authenticationService15.validateInput("", "");
        boolean boolean20 = authenticationService15.userExists("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test٥١٤() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥١٤");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository12 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService13 = new uc2login.business.AuthenticationService(userRepository12);
        uc2login.data.User user17 = new uc2login.data.User("", "", "");
        java.lang.String str18 = user17.getRole();
        java.lang.String str19 = user17.getEmail();
        userRepository12.addUser(user17);
        uc2login.data.User user22 = userRepository12.findByEmail("");
        userRepository0.addUser(user22);
        uc2login.business.AuthenticationService authenticationService24 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean27 = authenticationService24.login("", "");
        boolean boolean29 = authenticationService24.userExists("hi!");
        boolean boolean32 = authenticationService24.validateInput("", "");
        boolean boolean35 = authenticationService24.login("", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test٥١٥() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥١٥");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.data.User user2 = userRepository0.findByEmail("");
        uc2login.data.User user4 = userRepository0.findByEmail("hi!");
        uc2login.data.UserRepository userRepository5 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService6 = new uc2login.business.AuthenticationService(userRepository5);
        uc2login.data.User user10 = new uc2login.data.User("", "", "");
        java.lang.String str11 = user10.getRole();
        java.lang.String str12 = user10.getEmail();
        userRepository5.addUser(user10);
        userRepository0.addUser(user10);
        uc2login.business.AuthenticationService authenticationService15 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository16 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService17 = new uc2login.business.AuthenticationService(userRepository16);
        uc2login.data.User user19 = userRepository16.findByEmail("hi!");
        uc2login.business.AuthenticationService authenticationService20 = new uc2login.business.AuthenticationService(userRepository16);
        uc2login.data.User user22 = userRepository16.findByEmail("");
        uc2login.data.UserRepository userRepository23 = new uc2login.data.UserRepository();
        uc2login.data.User user25 = userRepository23.findByEmail("");
        uc2login.data.User user27 = userRepository23.findByEmail("hi!");
        uc2login.data.UserRepository userRepository28 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService29 = new uc2login.business.AuthenticationService(userRepository28);
        uc2login.data.User user33 = new uc2login.data.User("", "", "");
        java.lang.String str34 = user33.getRole();
        java.lang.String str35 = user33.getEmail();
        userRepository28.addUser(user33);
        userRepository23.addUser(user33);
        userRepository16.addUser(user33);
        java.lang.String str39 = user33.getRole();
        userRepository0.addUser(user33);
        uc2login.data.User user42 = userRepository0.findByEmail("hi!");
        uc2login.data.UserRepository userRepository43 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService44 = new uc2login.business.AuthenticationService(userRepository43);
        uc2login.data.User user48 = new uc2login.data.User("", "", "");
        java.lang.String str49 = user48.getRole();
        java.lang.String str50 = user48.getEmail();
        userRepository43.addUser(user48);
        java.lang.String str52 = user48.getEmail();
        java.lang.String str53 = user48.getEmail();
        java.lang.String str54 = user48.getPasswordHash();
        userRepository0.addUser(user48);
        java.lang.String str56 = user48.getEmail();
        java.lang.String str57 = user48.getPasswordHash();
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(user22);
        org.junit.Assert.assertNull(user25);
        org.junit.Assert.assertNull(user27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(user42);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test٥١٦() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥١٦");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository12 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService13 = new uc2login.business.AuthenticationService(userRepository12);
        uc2login.data.User user17 = new uc2login.data.User("", "", "");
        java.lang.String str18 = user17.getRole();
        java.lang.String str19 = user17.getEmail();
        userRepository12.addUser(user17);
        uc2login.data.User user22 = userRepository12.findByEmail("");
        userRepository0.addUser(user22);
        uc2login.business.AuthenticationService authenticationService24 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository25 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService26 = new uc2login.business.AuthenticationService(userRepository25);
        uc2login.data.User user30 = new uc2login.data.User("", "", "");
        java.lang.String str31 = user30.getRole();
        java.lang.String str32 = user30.getEmail();
        userRepository25.addUser(user30);
        userRepository0.addUser(user30);
        uc2login.data.User user36 = userRepository0.findByEmail("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(user36);
    }

    @Test
    public void test٥١٧() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥١٧");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user3 = userRepository0.findByEmail("hi!");
        uc2login.data.UserRepository userRepository4 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService5 = new uc2login.business.AuthenticationService(userRepository4);
        uc2login.data.User user9 = new uc2login.data.User("", "", "");
        java.lang.String str10 = user9.getRole();
        java.lang.String str11 = user9.getEmail();
        userRepository4.addUser(user9);
        uc2login.data.User user14 = userRepository4.findByEmail("");
        uc2login.business.AuthenticationService authenticationService15 = new uc2login.business.AuthenticationService(userRepository4);
        uc2login.data.UserRepository userRepository16 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService17 = new uc2login.business.AuthenticationService(userRepository16);
        uc2login.data.User user21 = new uc2login.data.User("", "", "");
        java.lang.String str22 = user21.getRole();
        java.lang.String str23 = user21.getEmail();
        userRepository16.addUser(user21);
        uc2login.data.User user26 = userRepository16.findByEmail("");
        userRepository4.addUser(user26);
        uc2login.business.AuthenticationService authenticationService28 = new uc2login.business.AuthenticationService(userRepository4);
        uc2login.business.AuthenticationService authenticationService29 = new uc2login.business.AuthenticationService(userRepository4);
        uc2login.data.UserRepository userRepository30 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService31 = new uc2login.business.AuthenticationService(userRepository30);
        uc2login.data.User user35 = new uc2login.data.User("", "", "");
        java.lang.String str36 = user35.getRole();
        java.lang.String str37 = user35.getEmail();
        userRepository30.addUser(user35);
        uc2login.data.User user40 = userRepository30.findByEmail("");
        java.lang.String str41 = user40.getEmail();
        userRepository4.addUser(user40);
        userRepository0.addUser(user40);
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test٥١٨() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥١٨");
        uc2login.data.User user3 = new uc2login.data.User("", "", "hi!");
        java.lang.String str4 = user3.getPasswordHash();
        java.lang.String str5 = user3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test٥١٩() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥١٩");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user13 = userRepository0.findByEmail("hi!");
        uc2login.data.User user15 = userRepository0.findByEmail("hi!");
        uc2login.business.AuthenticationService authenticationService16 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService17 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService18 = new uc2login.business.AuthenticationService(userRepository0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test٥٢٠() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٢٠");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean3 = authenticationService1.userExists("");
        boolean boolean6 = authenticationService1.login("hi!", "hi!");
        boolean boolean9 = authenticationService1.login("hi!", "hi!");
        boolean boolean12 = authenticationService1.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test٥٢١() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٢١");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService2 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService3 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean6 = authenticationService3.login("", "");
        boolean boolean8 = authenticationService3.userExists("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test٥٢٢() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٢٢");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean3 = authenticationService1.userExists("");
        boolean boolean6 = authenticationService1.login("", "hi!");
        boolean boolean9 = authenticationService1.login("hi!", "hi!");
        boolean boolean11 = authenticationService1.userExists("hi!");
        boolean boolean13 = authenticationService1.userExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test٥٢٣() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٢٣");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user3 = userRepository0.findByEmail("hi!");
        uc2login.business.AuthenticationService authenticationService4 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user6 = userRepository0.findByEmail("");
        uc2login.data.UserRepository userRepository7 = new uc2login.data.UserRepository();
        uc2login.data.User user9 = userRepository7.findByEmail("");
        uc2login.data.User user11 = userRepository7.findByEmail("hi!");
        uc2login.data.UserRepository userRepository12 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService13 = new uc2login.business.AuthenticationService(userRepository12);
        uc2login.data.User user17 = new uc2login.data.User("", "", "");
        java.lang.String str18 = user17.getRole();
        java.lang.String str19 = user17.getEmail();
        userRepository12.addUser(user17);
        userRepository7.addUser(user17);
        userRepository0.addUser(user17);
        uc2login.data.UserRepository userRepository23 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService24 = new uc2login.business.AuthenticationService(userRepository23);
        uc2login.data.User user28 = new uc2login.data.User("", "", "");
        java.lang.String str29 = user28.getRole();
        java.lang.String str30 = user28.getEmail();
        userRepository23.addUser(user28);
        uc2login.data.User user33 = userRepository23.findByEmail("");
        java.lang.String str34 = user33.getRole();
        java.lang.String str35 = user33.getRole();
        userRepository0.addUser(user33);
        uc2login.business.AuthenticationService authenticationService37 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user41 = new uc2login.data.User("", "", "hi!");
        java.lang.String str42 = user41.getRole();
        userRepository0.addUser(user41);
        uc2login.data.User user45 = userRepository0.findByEmail("hi!");
        uc2login.business.AuthenticationService authenticationService46 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean49 = authenticationService46.validateInput("hi!", "");
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(user33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNull(user45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test٥٢٤() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٢٤");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user13 = userRepository0.findByEmail("hi!");
        uc2login.data.User user15 = userRepository0.findByEmail("");
        uc2login.data.User user17 = userRepository0.findByEmail("hi!");
        uc2login.data.User user19 = userRepository0.findByEmail("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNotNull(user19);
    }

    @Test
    public void test٥٢٥() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٢٥");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user13 = userRepository0.findByEmail("hi!");
        uc2login.data.User user15 = userRepository0.findByEmail("");
        java.lang.String str16 = user15.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test٥٢٦() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٢٦");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user13 = userRepository0.findByEmail("hi!");
        uc2login.data.User user15 = userRepository0.findByEmail("");
        uc2login.data.UserRepository userRepository16 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService17 = new uc2login.business.AuthenticationService(userRepository16);
        uc2login.data.User user21 = new uc2login.data.User("", "", "");
        java.lang.String str22 = user21.getRole();
        java.lang.String str23 = user21.getEmail();
        userRepository16.addUser(user21);
        uc2login.data.User user26 = userRepository16.findByEmail("");
        uc2login.business.AuthenticationService authenticationService27 = new uc2login.business.AuthenticationService(userRepository16);
        uc2login.data.User user29 = userRepository16.findByEmail("hi!");
        uc2login.data.User user31 = userRepository16.findByEmail("");
        uc2login.business.AuthenticationService authenticationService32 = new uc2login.business.AuthenticationService(userRepository16);
        uc2login.data.User user34 = userRepository16.findByEmail("hi!");
        uc2login.data.UserRepository userRepository35 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService36 = new uc2login.business.AuthenticationService(userRepository35);
        uc2login.data.User user40 = new uc2login.data.User("", "", "");
        java.lang.String str41 = user40.getRole();
        java.lang.String str42 = user40.getEmail();
        userRepository35.addUser(user40);
        uc2login.business.AuthenticationService authenticationService44 = new uc2login.business.AuthenticationService(userRepository35);
        uc2login.data.User user48 = new uc2login.data.User("hi!", "", "hi!");
        userRepository35.addUser(user48);
        java.lang.String str50 = user48.getEmail();
        userRepository16.addUser(user48);
        userRepository0.addUser(user48);
        java.lang.Class<?> wildcardClass53 = userRepository0.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNull(user29);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNull(user34);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test٥٢٧() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٢٧");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository12 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService13 = new uc2login.business.AuthenticationService(userRepository12);
        uc2login.data.User user17 = new uc2login.data.User("", "", "");
        java.lang.String str18 = user17.getRole();
        java.lang.String str19 = user17.getEmail();
        userRepository12.addUser(user17);
        uc2login.data.User user22 = userRepository12.findByEmail("");
        userRepository0.addUser(user22);
        uc2login.business.AuthenticationService authenticationService24 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService25 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean28 = authenticationService25.login("", "");
        boolean boolean30 = authenticationService25.userExists("");
        boolean boolean33 = authenticationService25.validateInput("hi!", "");
        boolean boolean35 = authenticationService25.userExists("");
        boolean boolean38 = authenticationService25.validateInput("", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test٥٢٨() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٢٨");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean3 = authenticationService1.userExists("");
        boolean boolean6 = authenticationService1.login("hi!", "hi!");
        boolean boolean9 = authenticationService1.login("hi!", "hi!");
        boolean boolean11 = authenticationService1.userExists("");
        boolean boolean14 = authenticationService1.validateInput("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test٥٢٩() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٢٩");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.data.User user12 = userRepository0.findByEmail("");
        uc2login.data.User user14 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService15 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService16 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository17 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService18 = new uc2login.business.AuthenticationService(userRepository17);
        uc2login.data.User user22 = new uc2login.data.User("", "", "");
        java.lang.String str23 = user22.getRole();
        java.lang.String str24 = user22.getEmail();
        userRepository17.addUser(user22);
        uc2login.data.User user27 = userRepository17.findByEmail("");
        java.lang.String str28 = user27.getEmail();
        java.lang.String str29 = user27.getRole();
        userRepository0.addUser(user27);
        uc2login.data.User user32 = userRepository0.findByEmail("");
        uc2login.data.User user36 = new uc2login.data.User("", "hi!", "hi!");
        java.lang.String str37 = user36.getPasswordHash();
        userRepository0.addUser(user36);
        uc2login.data.UserRepository userRepository39 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService40 = new uc2login.business.AuthenticationService(userRepository39);
        uc2login.data.User user44 = new uc2login.data.User("", "", "");
        java.lang.String str45 = user44.getRole();
        java.lang.String str46 = user44.getEmail();
        userRepository39.addUser(user44);
        uc2login.data.User user49 = userRepository39.findByEmail("");
        uc2login.data.User user51 = userRepository39.findByEmail("");
        uc2login.data.User user53 = userRepository39.findByEmail("");
        java.lang.String str54 = user53.getPasswordHash();
        userRepository0.addUser(user53);
        java.lang.String str56 = user53.getRole();
        java.lang.String str57 = user53.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(user32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(user49);
        org.junit.Assert.assertNotNull(user51);
        org.junit.Assert.assertNotNull(user53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test٥٣٠() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٣٠");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository12 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService13 = new uc2login.business.AuthenticationService(userRepository12);
        uc2login.data.User user17 = new uc2login.data.User("", "", "");
        java.lang.String str18 = user17.getRole();
        java.lang.String str19 = user17.getEmail();
        userRepository12.addUser(user17);
        uc2login.data.User user22 = userRepository12.findByEmail("");
        userRepository0.addUser(user22);
        uc2login.business.AuthenticationService authenticationService24 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService25 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService26 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean29 = authenticationService26.login("hi!", "");
        boolean boolean31 = authenticationService26.userExists("hi!");
        boolean boolean34 = authenticationService26.login("", "");
        boolean boolean37 = authenticationService26.login("hi!", "");
        boolean boolean40 = authenticationService26.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test٥٣١() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٣١");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user3 = userRepository0.findByEmail("hi!");
        uc2login.business.AuthenticationService authenticationService4 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user6 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService7 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository8 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService9 = new uc2login.business.AuthenticationService(userRepository8);
        uc2login.data.User user13 = new uc2login.data.User("", "", "");
        java.lang.String str14 = user13.getRole();
        java.lang.String str15 = user13.getEmail();
        userRepository8.addUser(user13);
        uc2login.data.User user18 = userRepository8.findByEmail("");
        uc2login.business.AuthenticationService authenticationService19 = new uc2login.business.AuthenticationService(userRepository8);
        uc2login.data.UserRepository userRepository20 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService21 = new uc2login.business.AuthenticationService(userRepository20);
        uc2login.data.User user25 = new uc2login.data.User("", "", "");
        java.lang.String str26 = user25.getRole();
        java.lang.String str27 = user25.getEmail();
        userRepository20.addUser(user25);
        uc2login.data.User user30 = userRepository20.findByEmail("");
        userRepository8.addUser(user30);
        uc2login.business.AuthenticationService authenticationService32 = new uc2login.business.AuthenticationService(userRepository8);
        uc2login.business.AuthenticationService authenticationService33 = new uc2login.business.AuthenticationService(userRepository8);
        uc2login.data.UserRepository userRepository34 = new uc2login.data.UserRepository();
        uc2login.data.User user36 = userRepository34.findByEmail("");
        uc2login.data.User user38 = userRepository34.findByEmail("hi!");
        uc2login.data.UserRepository userRepository39 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService40 = new uc2login.business.AuthenticationService(userRepository39);
        uc2login.data.User user44 = new uc2login.data.User("", "", "");
        java.lang.String str45 = user44.getRole();
        java.lang.String str46 = user44.getEmail();
        userRepository39.addUser(user44);
        userRepository34.addUser(user44);
        java.lang.String str49 = user44.getPasswordHash();
        userRepository8.addUser(user44);
        uc2login.data.User user52 = userRepository8.findByEmail("");
        userRepository0.addUser(user52);
        uc2login.business.AuthenticationService authenticationService54 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user56 = userRepository0.findByEmail("");
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertNull(user38);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(user52);
        org.junit.Assert.assertNotNull(user56);
    }

    @Test
    public void test٥٣٢() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٣٢");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.data.User user12 = userRepository0.findByEmail("");
        uc2login.data.User user14 = userRepository0.findByEmail("");
        uc2login.data.User user16 = userRepository0.findByEmail("");
        java.lang.String str17 = user16.getPasswordHash();
        java.lang.String str18 = user16.getPasswordHash();
        java.lang.String str19 = user16.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test٥٣٣() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٣٣");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService2 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user4 = userRepository0.findByEmail("hi!");
        uc2login.data.UserRepository userRepository5 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService6 = new uc2login.business.AuthenticationService(userRepository5);
        uc2login.data.User user10 = new uc2login.data.User("", "", "");
        java.lang.String str11 = user10.getRole();
        java.lang.String str12 = user10.getEmail();
        userRepository5.addUser(user10);
        uc2login.data.User user15 = userRepository5.findByEmail("");
        uc2login.business.AuthenticationService authenticationService16 = new uc2login.business.AuthenticationService(userRepository5);
        uc2login.data.UserRepository userRepository17 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService18 = new uc2login.business.AuthenticationService(userRepository17);
        uc2login.data.User user22 = new uc2login.data.User("", "", "");
        java.lang.String str23 = user22.getRole();
        java.lang.String str24 = user22.getEmail();
        userRepository17.addUser(user22);
        uc2login.data.User user27 = userRepository17.findByEmail("");
        userRepository5.addUser(user27);
        uc2login.data.UserRepository userRepository29 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService30 = new uc2login.business.AuthenticationService(userRepository29);
        uc2login.data.User user34 = new uc2login.data.User("", "", "");
        java.lang.String str35 = user34.getRole();
        java.lang.String str36 = user34.getEmail();
        userRepository29.addUser(user34);
        uc2login.data.User user39 = userRepository29.findByEmail("");
        java.lang.String str40 = user39.getEmail();
        userRepository5.addUser(user39);
        java.lang.String str42 = user39.getEmail();
        userRepository0.addUser(user39);
        uc2login.data.User user45 = userRepository0.findByEmail("");
        uc2login.data.UserRepository userRepository46 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService47 = new uc2login.business.AuthenticationService(userRepository46);
        uc2login.data.User user51 = new uc2login.data.User("", "", "");
        java.lang.String str52 = user51.getRole();
        java.lang.String str53 = user51.getEmail();
        userRepository46.addUser(user51);
        uc2login.data.User user56 = userRepository46.findByEmail("");
        java.lang.String str57 = user56.getEmail();
        java.lang.String str58 = user56.getEmail();
        userRepository0.addUser(user56);
        java.lang.String str60 = user56.getPasswordHash();
        java.lang.String str61 = user56.getEmail();
        java.lang.String str62 = user56.getPasswordHash();
        java.lang.String str63 = user56.getEmail();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(user56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test٥٣٤() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٣٤");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user3 = userRepository0.findByEmail("hi!");
        uc2login.business.AuthenticationService authenticationService4 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user6 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService7 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user9 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService10 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean14 = authenticationService11.login("", "");
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test٥٣٥() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٣٥");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user3 = userRepository0.findByEmail("hi!");
        uc2login.business.AuthenticationService authenticationService4 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user6 = userRepository0.findByEmail("");
        uc2login.data.UserRepository userRepository7 = new uc2login.data.UserRepository();
        uc2login.data.User user9 = userRepository7.findByEmail("");
        uc2login.data.User user11 = userRepository7.findByEmail("hi!");
        uc2login.data.UserRepository userRepository12 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService13 = new uc2login.business.AuthenticationService(userRepository12);
        uc2login.data.User user17 = new uc2login.data.User("", "", "");
        java.lang.String str18 = user17.getRole();
        java.lang.String str19 = user17.getEmail();
        userRepository12.addUser(user17);
        userRepository7.addUser(user17);
        userRepository0.addUser(user17);
        uc2login.data.UserRepository userRepository23 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService24 = new uc2login.business.AuthenticationService(userRepository23);
        uc2login.data.User user28 = new uc2login.data.User("", "", "");
        java.lang.String str29 = user28.getRole();
        java.lang.String str30 = user28.getEmail();
        userRepository23.addUser(user28);
        uc2login.data.User user33 = userRepository23.findByEmail("");
        java.lang.String str34 = user33.getRole();
        java.lang.String str35 = user33.getRole();
        userRepository0.addUser(user33);
        uc2login.business.AuthenticationService authenticationService37 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService38 = new uc2login.business.AuthenticationService(userRepository0);
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(user33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test٥٣٦() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٣٦");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository12 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService13 = new uc2login.business.AuthenticationService(userRepository12);
        uc2login.data.User user17 = new uc2login.data.User("", "", "");
        java.lang.String str18 = user17.getRole();
        java.lang.String str19 = user17.getEmail();
        userRepository12.addUser(user17);
        uc2login.data.User user22 = userRepository12.findByEmail("");
        userRepository0.addUser(user22);
        uc2login.business.AuthenticationService authenticationService24 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService25 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService26 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository27 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService28 = new uc2login.business.AuthenticationService(userRepository27);
        uc2login.data.User user32 = new uc2login.data.User("", "", "");
        java.lang.String str33 = user32.getRole();
        java.lang.String str34 = user32.getEmail();
        userRepository27.addUser(user32);
        java.lang.String str36 = user32.getRole();
        userRepository0.addUser(user32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test٥٣٧() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٣٧");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user13 = userRepository0.findByEmail("hi!");
        uc2login.data.User user15 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService16 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService17 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user19 = userRepository0.findByEmail("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test٥٣٨() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٣٨");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        java.lang.String str11 = user10.getPasswordHash();
        java.lang.String str12 = user10.getEmail();
        java.lang.String str13 = user10.getEmail();
        java.lang.String str14 = user10.getPasswordHash();
        java.lang.String str15 = user10.getPasswordHash();
        java.lang.String str16 = user10.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test٥٣٩() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٣٩");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository12 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService13 = new uc2login.business.AuthenticationService(userRepository12);
        uc2login.data.User user17 = new uc2login.data.User("", "", "");
        java.lang.String str18 = user17.getRole();
        java.lang.String str19 = user17.getEmail();
        userRepository12.addUser(user17);
        uc2login.data.User user22 = userRepository12.findByEmail("");
        userRepository0.addUser(user22);
        uc2login.business.AuthenticationService authenticationService24 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService25 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository26 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService27 = new uc2login.business.AuthenticationService(userRepository26);
        uc2login.data.User user31 = new uc2login.data.User("", "", "");
        java.lang.String str32 = user31.getRole();
        java.lang.String str33 = user31.getEmail();
        userRepository26.addUser(user31);
        uc2login.data.User user36 = userRepository26.findByEmail("");
        java.lang.String str37 = user36.getEmail();
        userRepository0.addUser(user36);
        uc2login.business.AuthenticationService authenticationService39 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user43 = new uc2login.data.User("", "", "");
        java.lang.String str44 = user43.getRole();
        java.lang.String str45 = user43.getRole();
        java.lang.String str46 = user43.getPasswordHash();
        java.lang.String str47 = user43.getPasswordHash();
        java.lang.String str48 = user43.getRole();
        java.lang.String str49 = user43.getPasswordHash();
        java.lang.String str50 = user43.getEmail();
        userRepository0.addUser(user43);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(user36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test٥٤٠() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٤٠");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user3 = userRepository0.findByEmail("hi!");
        uc2login.business.AuthenticationService authenticationService4 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user6 = userRepository0.findByEmail("hi!");
        uc2login.data.UserRepository userRepository7 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService8 = new uc2login.business.AuthenticationService(userRepository7);
        uc2login.data.User user12 = new uc2login.data.User("", "", "");
        java.lang.String str13 = user12.getRole();
        java.lang.String str14 = user12.getEmail();
        userRepository7.addUser(user12);
        uc2login.data.User user17 = userRepository7.findByEmail("");
        java.lang.String str18 = user17.getEmail();
        java.lang.String str19 = user17.getRole();
        java.lang.String str20 = user17.getRole();
        java.lang.String str21 = user17.getPasswordHash();
        java.lang.String str22 = user17.getRole();
        userRepository0.addUser(user17);
        java.lang.Class<?> wildcardClass24 = userRepository0.getClass();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(user17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test٥٤١() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٤١");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.business.AuthenticationService authenticationService9 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user13 = new uc2login.data.User("hi!", "", "hi!");
        userRepository0.addUser(user13);
        uc2login.data.UserRepository userRepository15 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService16 = new uc2login.business.AuthenticationService(userRepository15);
        uc2login.data.User user20 = new uc2login.data.User("", "", "");
        java.lang.String str21 = user20.getRole();
        java.lang.String str22 = user20.getEmail();
        userRepository15.addUser(user20);
        java.lang.String str24 = user20.getEmail();
        java.lang.String str25 = user20.getEmail();
        java.lang.String str26 = user20.getPasswordHash();
        java.lang.String str27 = user20.getPasswordHash();
        userRepository0.addUser(user20);
        java.lang.String str29 = user20.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test٥٤٢() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٤٢");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.business.AuthenticationService authenticationService9 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user13 = new uc2login.data.User("hi!", "", "hi!");
        userRepository0.addUser(user13);
        uc2login.data.User user16 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService17 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean20 = authenticationService17.validateInput("hi!", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test٥٤٣() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٤٣");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository12 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService13 = new uc2login.business.AuthenticationService(userRepository12);
        uc2login.data.User user17 = new uc2login.data.User("", "", "");
        java.lang.String str18 = user17.getRole();
        java.lang.String str19 = user17.getEmail();
        userRepository12.addUser(user17);
        uc2login.data.User user22 = userRepository12.findByEmail("");
        userRepository0.addUser(user22);
        uc2login.data.UserRepository userRepository24 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService25 = new uc2login.business.AuthenticationService(userRepository24);
        uc2login.data.User user29 = new uc2login.data.User("", "", "");
        java.lang.String str30 = user29.getRole();
        java.lang.String str31 = user29.getEmail();
        userRepository24.addUser(user29);
        uc2login.data.User user34 = userRepository24.findByEmail("");
        java.lang.String str35 = user34.getEmail();
        userRepository0.addUser(user34);
        java.lang.String str37 = user34.getEmail();
        java.lang.String str38 = user34.getEmail();
        java.lang.String str39 = user34.getRole();
        java.lang.String str40 = user34.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(user34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test٥٤٤() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٤٤");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.data.User user12 = userRepository0.findByEmail("");
        uc2login.data.User user14 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService15 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService16 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository17 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService18 = new uc2login.business.AuthenticationService(userRepository17);
        uc2login.data.User user22 = new uc2login.data.User("", "", "");
        java.lang.String str23 = user22.getRole();
        java.lang.String str24 = user22.getEmail();
        userRepository17.addUser(user22);
        uc2login.data.User user27 = userRepository17.findByEmail("");
        java.lang.String str28 = user27.getEmail();
        java.lang.String str29 = user27.getRole();
        userRepository0.addUser(user27);
        uc2login.business.AuthenticationService authenticationService31 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService32 = new uc2login.business.AuthenticationService(userRepository0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test٥٤٥() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٤٥");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        java.lang.String str11 = user10.getRole();
        java.lang.String str12 = user10.getEmail();
        java.lang.String str13 = user10.getRole();
        java.lang.String str14 = user10.getEmail();
        java.lang.String str15 = user10.getPasswordHash();
        java.lang.String str16 = user10.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test٥٤٦() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٤٦");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user3 = userRepository0.findByEmail("hi!");
        uc2login.business.AuthenticationService authenticationService4 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user8 = new uc2login.data.User("", "", "");
        java.lang.String str9 = user8.getRole();
        java.lang.String str10 = user8.getEmail();
        java.lang.String str11 = user8.getRole();
        userRepository0.addUser(user8);
        uc2login.business.AuthenticationService authenticationService13 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user15 = userRepository0.findByEmail("");
        java.lang.String str16 = user15.getRole();
        java.lang.String str17 = user15.getPasswordHash();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test٥٤٧() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٤٧");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.data.User user2 = userRepository0.findByEmail("");
        uc2login.data.User user4 = userRepository0.findByEmail("hi!");
        uc2login.data.UserRepository userRepository5 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService6 = new uc2login.business.AuthenticationService(userRepository5);
        uc2login.data.User user10 = new uc2login.data.User("", "", "");
        java.lang.String str11 = user10.getRole();
        java.lang.String str12 = user10.getEmail();
        userRepository5.addUser(user10);
        userRepository0.addUser(user10);
        uc2login.data.UserRepository userRepository15 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService16 = new uc2login.business.AuthenticationService(userRepository15);
        uc2login.data.User user18 = userRepository15.findByEmail("hi!");
        uc2login.business.AuthenticationService authenticationService19 = new uc2login.business.AuthenticationService(userRepository15);
        uc2login.data.UserRepository userRepository20 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService21 = new uc2login.business.AuthenticationService(userRepository20);
        uc2login.data.User user25 = new uc2login.data.User("", "", "");
        java.lang.String str26 = user25.getRole();
        java.lang.String str27 = user25.getEmail();
        userRepository20.addUser(user25);
        uc2login.data.User user30 = userRepository20.findByEmail("");
        java.lang.String str31 = user30.getPasswordHash();
        userRepository15.addUser(user30);
        userRepository0.addUser(user30);
        uc2login.business.AuthenticationService authenticationService34 = new uc2login.business.AuthenticationService(userRepository0);
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test٥٤٨() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٤٨");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.data.User user14 = new uc2login.data.User("", "", "");
        java.lang.String str15 = user14.getRole();
        java.lang.String str16 = user14.getEmail();
        java.lang.String str17 = user14.getRole();
        userRepository0.addUser(user14);
        uc2login.data.UserRepository userRepository19 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService20 = new uc2login.business.AuthenticationService(userRepository19);
        uc2login.data.User user24 = new uc2login.data.User("", "", "");
        java.lang.String str25 = user24.getRole();
        java.lang.String str26 = user24.getEmail();
        userRepository19.addUser(user24);
        uc2login.data.User user29 = userRepository19.findByEmail("");
        java.lang.String str30 = user29.getEmail();
        java.lang.String str31 = user29.getRole();
        userRepository0.addUser(user29);
        uc2login.data.UserRepository userRepository33 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService34 = new uc2login.business.AuthenticationService(userRepository33);
        uc2login.data.User user38 = new uc2login.data.User("", "", "");
        java.lang.String str39 = user38.getRole();
        java.lang.String str40 = user38.getEmail();
        userRepository33.addUser(user38);
        uc2login.data.User user43 = userRepository33.findByEmail("");
        uc2login.data.User user45 = userRepository33.findByEmail("");
        uc2login.data.User user47 = userRepository33.findByEmail("");
        uc2login.business.AuthenticationService authenticationService48 = new uc2login.business.AuthenticationService(userRepository33);
        uc2login.data.User user50 = userRepository33.findByEmail("");
        userRepository0.addUser(user50);
        java.lang.String str52 = user50.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertNotNull(user47);
        org.junit.Assert.assertNotNull(user50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test٥٤٩() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٤٩");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository12 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService13 = new uc2login.business.AuthenticationService(userRepository12);
        uc2login.data.User user17 = new uc2login.data.User("", "", "");
        java.lang.String str18 = user17.getRole();
        java.lang.String str19 = user17.getEmail();
        userRepository12.addUser(user17);
        uc2login.data.User user22 = userRepository12.findByEmail("");
        userRepository0.addUser(user22);
        uc2login.business.AuthenticationService authenticationService24 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user26 = userRepository0.findByEmail("hi!");
        uc2login.data.User user28 = userRepository0.findByEmail("");
        uc2login.data.User user30 = userRepository0.findByEmail("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNull(user26);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNull(user30);
    }

    @Test
    public void test٥٥٠() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٥٠");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user13 = userRepository0.findByEmail("");
        uc2login.data.UserRepository userRepository14 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService15 = new uc2login.business.AuthenticationService(userRepository14);
        uc2login.data.User user19 = new uc2login.data.User("", "", "");
        java.lang.String str20 = user19.getRole();
        java.lang.String str21 = user19.getEmail();
        userRepository14.addUser(user19);
        uc2login.data.User user24 = userRepository14.findByEmail("");
        uc2login.business.AuthenticationService authenticationService25 = new uc2login.business.AuthenticationService(userRepository14);
        uc2login.data.UserRepository userRepository26 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService27 = new uc2login.business.AuthenticationService(userRepository26);
        uc2login.data.User user31 = new uc2login.data.User("", "", "");
        java.lang.String str32 = user31.getRole();
        java.lang.String str33 = user31.getEmail();
        userRepository26.addUser(user31);
        uc2login.data.User user36 = userRepository26.findByEmail("");
        userRepository14.addUser(user36);
        uc2login.business.AuthenticationService authenticationService38 = new uc2login.business.AuthenticationService(userRepository14);
        uc2login.business.AuthenticationService authenticationService39 = new uc2login.business.AuthenticationService(userRepository14);
        uc2login.data.UserRepository userRepository40 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService41 = new uc2login.business.AuthenticationService(userRepository40);
        uc2login.data.User user45 = new uc2login.data.User("", "", "");
        java.lang.String str46 = user45.getRole();
        java.lang.String str47 = user45.getEmail();
        userRepository40.addUser(user45);
        uc2login.data.User user50 = userRepository40.findByEmail("");
        java.lang.String str51 = user50.getEmail();
        userRepository14.addUser(user50);
        userRepository0.addUser(user50);
        uc2login.data.User user55 = userRepository0.findByEmail("hi!");
        uc2login.data.UserRepository userRepository56 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService57 = new uc2login.business.AuthenticationService(userRepository56);
        uc2login.data.User user61 = new uc2login.data.User("", "", "");
        java.lang.String str62 = user61.getRole();
        java.lang.String str63 = user61.getEmail();
        userRepository56.addUser(user61);
        uc2login.data.User user66 = userRepository56.findByEmail("");
        uc2login.business.AuthenticationService authenticationService67 = new uc2login.business.AuthenticationService(userRepository56);
        uc2login.data.UserRepository userRepository68 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService69 = new uc2login.business.AuthenticationService(userRepository68);
        uc2login.data.User user73 = new uc2login.data.User("", "", "");
        java.lang.String str74 = user73.getRole();
        java.lang.String str75 = user73.getEmail();
        userRepository68.addUser(user73);
        uc2login.data.User user78 = userRepository68.findByEmail("");
        userRepository56.addUser(user78);
        uc2login.business.AuthenticationService authenticationService80 = new uc2login.business.AuthenticationService(userRepository56);
        uc2login.business.AuthenticationService authenticationService81 = new uc2login.business.AuthenticationService(userRepository56);
        uc2login.business.AuthenticationService authenticationService82 = new uc2login.business.AuthenticationService(userRepository56);
        uc2login.data.User user84 = userRepository56.findByEmail("");
        java.lang.String str85 = user84.getRole();
        java.lang.String str86 = user84.getRole();
        userRepository0.addUser(user84);
        java.lang.String str88 = user84.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(user36);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(user50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNull(user55);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(user66);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(user78);
        org.junit.Assert.assertNotNull(user84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }

    @Test
    public void test٥٥١() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٥١");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user3 = userRepository0.findByEmail("hi!");
        uc2login.business.AuthenticationService authenticationService4 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository5 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService6 = new uc2login.business.AuthenticationService(userRepository5);
        uc2login.data.User user10 = new uc2login.data.User("", "", "");
        java.lang.String str11 = user10.getRole();
        java.lang.String str12 = user10.getEmail();
        userRepository5.addUser(user10);
        uc2login.data.User user15 = userRepository5.findByEmail("");
        java.lang.String str16 = user15.getPasswordHash();
        userRepository0.addUser(user15);
        java.lang.String str18 = user15.getEmail();
        java.lang.Class<?> wildcardClass19 = user15.getClass();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test٥٥٢() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٥٢");
        uc2login.data.User user3 = new uc2login.data.User("", "", "");
        java.lang.String str4 = user3.getRole();
        java.lang.String str5 = user3.getRole();
        java.lang.String str6 = user3.getRole();
        java.lang.String str7 = user3.getPasswordHash();
        java.lang.String str8 = user3.getPasswordHash();
        java.lang.String str9 = user3.getRole();
        java.lang.String str10 = user3.getRole();
        java.lang.String str11 = user3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test٥٥٣() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٥٣");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository12 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService13 = new uc2login.business.AuthenticationService(userRepository12);
        uc2login.data.User user17 = new uc2login.data.User("", "", "");
        java.lang.String str18 = user17.getRole();
        java.lang.String str19 = user17.getEmail();
        userRepository12.addUser(user17);
        uc2login.data.User user22 = userRepository12.findByEmail("");
        userRepository0.addUser(user22);
        uc2login.business.AuthenticationService authenticationService24 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService25 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository26 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService27 = new uc2login.business.AuthenticationService(userRepository26);
        uc2login.data.User user31 = new uc2login.data.User("", "", "");
        java.lang.String str32 = user31.getRole();
        java.lang.String str33 = user31.getEmail();
        userRepository26.addUser(user31);
        uc2login.data.User user36 = userRepository26.findByEmail("");
        java.lang.String str37 = user36.getEmail();
        userRepository0.addUser(user36);
        uc2login.business.AuthenticationService authenticationService39 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user41 = userRepository0.findByEmail("hi!");
        uc2login.data.User user43 = userRepository0.findByEmail("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(user36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(user41);
        org.junit.Assert.assertNull(user43);
    }

    @Test
    public void test٥٥٤() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٥٤");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository12 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService13 = new uc2login.business.AuthenticationService(userRepository12);
        uc2login.data.User user17 = new uc2login.data.User("", "", "");
        java.lang.String str18 = user17.getRole();
        java.lang.String str19 = user17.getEmail();
        userRepository12.addUser(user17);
        uc2login.data.User user22 = userRepository12.findByEmail("");
        userRepository0.addUser(user22);
        uc2login.business.AuthenticationService authenticationService24 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService25 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService26 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user28 = userRepository0.findByEmail("");
        uc2login.data.User user32 = new uc2login.data.User("", "", "hi!");
        userRepository0.addUser(user32);
        uc2login.data.User user37 = new uc2login.data.User("", "", "");
        java.lang.String str38 = user37.getRole();
        java.lang.String str39 = user37.getRole();
        java.lang.String str40 = user37.getRole();
        userRepository0.addUser(user37);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test٥٥٥() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٥٥");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user3 = userRepository0.findByEmail("hi!");
        uc2login.business.AuthenticationService authenticationService4 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user8 = new uc2login.data.User("", "", "");
        java.lang.String str9 = user8.getRole();
        java.lang.String str10 = user8.getRole();
        java.lang.String str11 = user8.getRole();
        java.lang.String str12 = user8.getPasswordHash();
        userRepository0.addUser(user8);
        uc2login.business.AuthenticationService authenticationService14 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean17 = authenticationService14.validateInput("", "");
        boolean boolean19 = authenticationService14.userExists("");
        boolean boolean22 = authenticationService14.validateInput("", "hi!");
        java.lang.Class<?> wildcardClass23 = authenticationService14.getClass();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test٥٥٦() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٥٦");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user3 = userRepository0.findByEmail("hi!");
        uc2login.business.AuthenticationService authenticationService4 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user6 = userRepository0.findByEmail("");
        uc2login.data.User user8 = userRepository0.findByEmail("hi!");
        uc2login.data.User user12 = new uc2login.data.User("", "", "");
        java.lang.String str13 = user12.getRole();
        java.lang.String str14 = user12.getRole();
        java.lang.String str15 = user12.getRole();
        java.lang.String str16 = user12.getPasswordHash();
        java.lang.String str17 = user12.getEmail();
        userRepository0.addUser(user12);
        java.lang.String str19 = user12.getRole();
        java.lang.String str20 = user12.getRole();
        java.lang.String str21 = user12.getEmail();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test٥٥٧() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٥٧");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.data.User user2 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService3 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService4 = new uc2login.business.AuthenticationService(userRepository0);
        org.junit.Assert.assertNull(user2);
    }

    @Test
    public void test٥٥٨() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٥٨");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.data.User user2 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService3 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean6 = authenticationService3.login("", "hi!");
        java.lang.Class<?> wildcardClass7 = authenticationService3.getClass();
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test٥٥٩() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٥٩");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user13 = userRepository0.findByEmail("hi!");
        uc2login.data.UserRepository userRepository14 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService15 = new uc2login.business.AuthenticationService(userRepository14);
        uc2login.data.User user17 = userRepository14.findByEmail("hi!");
        uc2login.business.AuthenticationService authenticationService18 = new uc2login.business.AuthenticationService(userRepository14);
        uc2login.data.User user22 = new uc2login.data.User("", "", "");
        java.lang.String str23 = user22.getRole();
        java.lang.String str24 = user22.getEmail();
        java.lang.String str25 = user22.getRole();
        userRepository14.addUser(user22);
        java.lang.String str27 = user22.getPasswordHash();
        java.lang.String str28 = user22.getRole();
        userRepository0.addUser(user22);
        uc2login.data.User user31 = userRepository0.findByEmail("hi!");
        uc2login.data.User user33 = userRepository0.findByEmail("");
        java.lang.String str34 = user33.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(user31);
        org.junit.Assert.assertNotNull(user33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test٥٦٠() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٦٠");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean3 = authenticationService1.userExists("");
        boolean boolean6 = authenticationService1.validateInput("hi!", "");
        boolean boolean8 = authenticationService1.userExists("");
        boolean boolean10 = authenticationService1.userExists("hi!");
        boolean boolean13 = authenticationService1.login("hi!", "hi!");
        boolean boolean16 = authenticationService1.validateInput("", "hi!");
        boolean boolean18 = authenticationService1.userExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test٥٦١() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٦١");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean3 = authenticationService1.userExists("");
        boolean boolean6 = authenticationService1.validateInput("hi!", "hi!");
        boolean boolean8 = authenticationService1.userExists("hi!");
        boolean boolean11 = authenticationService1.validateInput("", "");
        boolean boolean14 = authenticationService1.validateInput("", "");
        boolean boolean16 = authenticationService1.userExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test٥٦٢() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٦٢");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.business.AuthenticationService authenticationService9 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService10 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean13 = authenticationService10.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test٥٦٣() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٦٣");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.data.User user12 = userRepository0.findByEmail("hi!");
        uc2login.data.User user14 = userRepository0.findByEmail("");
        uc2login.data.User user16 = userRepository0.findByEmail("");
        java.lang.String str17 = user16.getRole();
        java.lang.String str18 = user16.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test٥٦٤() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٦٤");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user13 = userRepository0.findByEmail("hi!");
        uc2login.data.User user15 = userRepository0.findByEmail("");
        uc2login.data.User user17 = userRepository0.findByEmail("hi!");
        uc2login.business.AuthenticationService authenticationService18 = new uc2login.business.AuthenticationService(userRepository0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test٥٦٥() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٦٥");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user13 = userRepository0.findByEmail("hi!");
        uc2login.data.UserRepository userRepository14 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService15 = new uc2login.business.AuthenticationService(userRepository14);
        uc2login.data.UserRepository userRepository16 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService17 = new uc2login.business.AuthenticationService(userRepository16);
        uc2login.business.AuthenticationService authenticationService18 = new uc2login.business.AuthenticationService(userRepository16);
        uc2login.data.User user22 = new uc2login.data.User("", "", "");
        java.lang.String str23 = user22.getRole();
        java.lang.String str24 = user22.getRole();
        java.lang.String str25 = user22.getRole();
        userRepository16.addUser(user22);
        userRepository14.addUser(user22);
        java.lang.String str28 = user22.getRole();
        userRepository0.addUser(user22);
        java.lang.String str30 = user22.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test٥٦٦() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٦٦");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.business.AuthenticationService authenticationService9 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService10 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user12 = userRepository0.findByEmail("hi!");
        uc2login.data.User user14 = userRepository0.findByEmail("");
        uc2login.data.UserRepository userRepository15 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService16 = new uc2login.business.AuthenticationService(userRepository15);
        uc2login.data.User user20 = new uc2login.data.User("", "", "");
        java.lang.String str21 = user20.getRole();
        java.lang.String str22 = user20.getEmail();
        userRepository15.addUser(user20);
        uc2login.data.User user25 = userRepository15.findByEmail("");
        uc2login.data.User user27 = userRepository15.findByEmail("hi!");
        uc2login.data.UserRepository userRepository28 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService29 = new uc2login.business.AuthenticationService(userRepository28);
        uc2login.data.User user33 = new uc2login.data.User("", "", "");
        java.lang.String str34 = user33.getRole();
        java.lang.String str35 = user33.getEmail();
        userRepository28.addUser(user33);
        uc2login.data.User user38 = userRepository28.findByEmail("");
        java.lang.String str39 = user38.getPasswordHash();
        java.lang.String str40 = user38.getEmail();
        userRepository15.addUser(user38);
        java.lang.String str42 = user38.getPasswordHash();
        java.lang.String str43 = user38.getPasswordHash();
        java.lang.String str44 = user38.getRole();
        userRepository0.addUser(user38);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(user25);
        org.junit.Assert.assertNull(user27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test٥٦٧() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٦٧");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean3 = authenticationService1.userExists("");
        boolean boolean6 = authenticationService1.validateInput("hi!", "");
        boolean boolean8 = authenticationService1.userExists("");
        boolean boolean10 = authenticationService1.userExists("hi!");
        boolean boolean13 = authenticationService1.login("hi!", "hi!");
        boolean boolean16 = authenticationService1.validateInput("", "hi!");
        boolean boolean19 = authenticationService1.validateInput("", "hi!");
        boolean boolean22 = authenticationService1.validateInput("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test٥٦٨() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٦٨");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user3 = userRepository0.findByEmail("hi!");
        uc2login.business.AuthenticationService authenticationService4 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user8 = new uc2login.data.User("", "", "");
        java.lang.String str9 = user8.getRole();
        java.lang.String str10 = user8.getRole();
        java.lang.String str11 = user8.getRole();
        java.lang.String str12 = user8.getPasswordHash();
        userRepository0.addUser(user8);
        uc2login.business.AuthenticationService authenticationService14 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user16 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService17 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService18 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user20 = userRepository0.findByEmail("");
        uc2login.data.User user22 = userRepository0.findByEmail("");
        java.lang.Class<?> wildcardClass23 = userRepository0.getClass();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test٥٦٩() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٦٩");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository12 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService13 = new uc2login.business.AuthenticationService(userRepository12);
        uc2login.data.User user17 = new uc2login.data.User("", "", "");
        java.lang.String str18 = user17.getRole();
        java.lang.String str19 = user17.getEmail();
        userRepository12.addUser(user17);
        uc2login.data.User user22 = userRepository12.findByEmail("");
        userRepository0.addUser(user22);
        uc2login.business.AuthenticationService authenticationService24 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user26 = userRepository0.findByEmail("hi!");
        uc2login.data.User user28 = userRepository0.findByEmail("");
        uc2login.data.UserRepository userRepository29 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService30 = new uc2login.business.AuthenticationService(userRepository29);
        uc2login.data.User user34 = new uc2login.data.User("", "", "");
        java.lang.String str35 = user34.getRole();
        java.lang.String str36 = user34.getEmail();
        userRepository29.addUser(user34);
        uc2login.data.User user39 = userRepository29.findByEmail("");
        uc2login.data.User user41 = userRepository29.findByEmail("");
        uc2login.data.User user43 = userRepository29.findByEmail("");
        uc2login.business.AuthenticationService authenticationService44 = new uc2login.business.AuthenticationService(userRepository29);
        uc2login.business.AuthenticationService authenticationService45 = new uc2login.business.AuthenticationService(userRepository29);
        uc2login.data.UserRepository userRepository46 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService47 = new uc2login.business.AuthenticationService(userRepository46);
        uc2login.data.User user51 = new uc2login.data.User("", "", "");
        java.lang.String str52 = user51.getRole();
        java.lang.String str53 = user51.getEmail();
        userRepository46.addUser(user51);
        uc2login.data.User user56 = userRepository46.findByEmail("");
        java.lang.String str57 = user56.getEmail();
        java.lang.String str58 = user56.getRole();
        userRepository29.addUser(user56);
        uc2login.data.User user61 = userRepository29.findByEmail("");
        uc2login.business.AuthenticationService authenticationService62 = new uc2login.business.AuthenticationService(userRepository29);
        uc2login.data.UserRepository userRepository63 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService64 = new uc2login.business.AuthenticationService(userRepository63);
        uc2login.business.AuthenticationService authenticationService65 = new uc2login.business.AuthenticationService(userRepository63);
        uc2login.data.User user69 = new uc2login.data.User("", "", "");
        java.lang.String str70 = user69.getRole();
        java.lang.String str71 = user69.getRole();
        java.lang.String str72 = user69.getRole();
        userRepository63.addUser(user69);
        userRepository29.addUser(user69);
        userRepository0.addUser(user69);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNull(user26);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(user41);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(user56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(user61);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test٥٧٠() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٧٠");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.data.User user12 = userRepository0.findByEmail("");
        uc2login.data.User user14 = userRepository0.findByEmail("");
        uc2login.data.User user16 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService17 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository18 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService19 = new uc2login.business.AuthenticationService(userRepository18);
        uc2login.data.User user23 = new uc2login.data.User("", "", "");
        java.lang.String str24 = user23.getRole();
        java.lang.String str25 = user23.getEmail();
        userRepository18.addUser(user23);
        uc2login.data.User user28 = userRepository18.findByEmail("");
        java.lang.String str29 = user28.getPasswordHash();
        java.lang.String str30 = user28.getEmail();
        java.lang.String str31 = user28.getPasswordHash();
        userRepository0.addUser(user28);
        uc2login.data.UserRepository userRepository33 = new uc2login.data.UserRepository();
        uc2login.data.User user35 = userRepository33.findByEmail("");
        uc2login.business.AuthenticationService authenticationService36 = new uc2login.business.AuthenticationService(userRepository33);
        uc2login.data.User user40 = new uc2login.data.User("", "", "");
        java.lang.String str41 = user40.getPasswordHash();
        java.lang.String str42 = user40.getPasswordHash();
        userRepository33.addUser(user40);
        userRepository0.addUser(user40);
        java.lang.String str45 = user40.getRole();
        java.lang.String str46 = user40.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(user35);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test٥٧١() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٧١");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.data.User user12 = userRepository0.findByEmail("");
        uc2login.data.User user14 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService15 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService16 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository17 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService18 = new uc2login.business.AuthenticationService(userRepository17);
        uc2login.data.User user22 = new uc2login.data.User("", "", "");
        java.lang.String str23 = user22.getRole();
        java.lang.String str24 = user22.getEmail();
        userRepository17.addUser(user22);
        uc2login.data.User user27 = userRepository17.findByEmail("");
        java.lang.String str28 = user27.getEmail();
        java.lang.String str29 = user27.getRole();
        userRepository0.addUser(user27);
        uc2login.data.User user32 = userRepository0.findByEmail("");
        uc2login.data.User user36 = new uc2login.data.User("", "hi!", "hi!");
        java.lang.String str37 = user36.getPasswordHash();
        userRepository0.addUser(user36);
        uc2login.data.UserRepository userRepository39 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService40 = new uc2login.business.AuthenticationService(userRepository39);
        uc2login.data.User user44 = new uc2login.data.User("", "", "");
        java.lang.String str45 = user44.getRole();
        java.lang.String str46 = user44.getEmail();
        userRepository39.addUser(user44);
        uc2login.data.User user49 = userRepository39.findByEmail("");
        uc2login.data.User user51 = userRepository39.findByEmail("");
        uc2login.data.User user53 = userRepository39.findByEmail("");
        java.lang.String str54 = user53.getPasswordHash();
        userRepository0.addUser(user53);
        uc2login.business.AuthenticationService authenticationService56 = new uc2login.business.AuthenticationService(userRepository0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(user32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(user49);
        org.junit.Assert.assertNotNull(user51);
        org.junit.Assert.assertNotNull(user53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test٥٧٢() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٧٢");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.business.AuthenticationService authenticationService9 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user13 = new uc2login.data.User("", "", "");
        java.lang.String str14 = user13.getRole();
        java.lang.String str15 = user13.getEmail();
        userRepository0.addUser(user13);
        uc2login.data.User user18 = userRepository0.findByEmail("hi!");
        uc2login.data.User user20 = userRepository0.findByEmail("hi!");
        uc2login.data.UserRepository userRepository21 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService22 = new uc2login.business.AuthenticationService(userRepository21);
        uc2login.data.User user26 = new uc2login.data.User("", "", "");
        java.lang.String str27 = user26.getRole();
        java.lang.String str28 = user26.getEmail();
        userRepository21.addUser(user26);
        uc2login.data.User user31 = userRepository21.findByEmail("");
        uc2login.business.AuthenticationService authenticationService32 = new uc2login.business.AuthenticationService(userRepository21);
        uc2login.data.UserRepository userRepository33 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService34 = new uc2login.business.AuthenticationService(userRepository33);
        uc2login.data.User user38 = new uc2login.data.User("", "", "");
        java.lang.String str39 = user38.getRole();
        java.lang.String str40 = user38.getEmail();
        userRepository33.addUser(user38);
        uc2login.data.User user43 = userRepository33.findByEmail("");
        userRepository21.addUser(user43);
        uc2login.business.AuthenticationService authenticationService45 = new uc2login.business.AuthenticationService(userRepository21);
        uc2login.business.AuthenticationService authenticationService46 = new uc2login.business.AuthenticationService(userRepository21);
        uc2login.business.AuthenticationService authenticationService47 = new uc2login.business.AuthenticationService(userRepository21);
        uc2login.data.User user49 = userRepository21.findByEmail("");
        java.lang.String str50 = user49.getRole();
        java.lang.String str51 = user49.getEmail();
        java.lang.String str52 = user49.getEmail();
        java.lang.String str53 = user49.getPasswordHash();
        java.lang.String str54 = user49.getRole();
        userRepository0.addUser(user49);
        java.lang.String str56 = user49.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(user49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test٥٧٣() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٧٣");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository12 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService13 = new uc2login.business.AuthenticationService(userRepository12);
        uc2login.data.User user17 = new uc2login.data.User("", "", "");
        java.lang.String str18 = user17.getRole();
        java.lang.String str19 = user17.getEmail();
        userRepository12.addUser(user17);
        uc2login.data.User user22 = userRepository12.findByEmail("");
        userRepository0.addUser(user22);
        uc2login.business.AuthenticationService authenticationService24 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService25 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService26 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository27 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService28 = new uc2login.business.AuthenticationService(userRepository27);
        uc2login.data.User user32 = new uc2login.data.User("", "", "");
        java.lang.String str33 = user32.getRole();
        java.lang.String str34 = user32.getEmail();
        userRepository27.addUser(user32);
        uc2login.data.User user37 = userRepository27.findByEmail("");
        uc2login.business.AuthenticationService authenticationService38 = new uc2login.business.AuthenticationService(userRepository27);
        uc2login.data.UserRepository userRepository39 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService40 = new uc2login.business.AuthenticationService(userRepository39);
        uc2login.data.User user44 = new uc2login.data.User("", "", "");
        java.lang.String str45 = user44.getRole();
        java.lang.String str46 = user44.getEmail();
        userRepository39.addUser(user44);
        uc2login.data.User user49 = userRepository39.findByEmail("");
        userRepository27.addUser(user49);
        uc2login.business.AuthenticationService authenticationService51 = new uc2login.business.AuthenticationService(userRepository27);
        uc2login.data.User user53 = userRepository27.findByEmail("hi!");
        uc2login.data.User user55 = userRepository27.findByEmail("");
        userRepository0.addUser(user55);
        uc2login.business.AuthenticationService authenticationService57 = new uc2login.business.AuthenticationService(userRepository0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(user37);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(user49);
        org.junit.Assert.assertNull(user53);
        org.junit.Assert.assertNotNull(user55);
    }

    @Test
    public void test٥٧٤() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٧٤");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean3 = authenticationService1.userExists("");
        boolean boolean6 = authenticationService1.login("", "");
        boolean boolean8 = authenticationService1.userExists("");
        boolean boolean11 = authenticationService1.login("hi!", "hi!");
        boolean boolean13 = authenticationService1.userExists("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test٥٧٥() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٧٥");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService2 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user4 = userRepository0.findByEmail("hi!");
        uc2login.business.AuthenticationService authenticationService5 = new uc2login.business.AuthenticationService(userRepository0);
        java.lang.Class<?> wildcardClass6 = userRepository0.getClass();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test٥٧٦() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٧٦");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.data.User user12 = userRepository0.findByEmail("");
        uc2login.data.User user14 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService15 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService16 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository17 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService18 = new uc2login.business.AuthenticationService(userRepository17);
        uc2login.data.User user22 = new uc2login.data.User("", "", "");
        java.lang.String str23 = user22.getRole();
        java.lang.String str24 = user22.getEmail();
        userRepository17.addUser(user22);
        uc2login.data.User user27 = userRepository17.findByEmail("");
        java.lang.String str28 = user27.getEmail();
        java.lang.String str29 = user27.getRole();
        userRepository0.addUser(user27);
        uc2login.data.User user32 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService33 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository34 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService35 = new uc2login.business.AuthenticationService(userRepository34);
        uc2login.business.AuthenticationService authenticationService36 = new uc2login.business.AuthenticationService(userRepository34);
        uc2login.data.User user40 = new uc2login.data.User("", "", "");
        java.lang.String str41 = user40.getRole();
        java.lang.String str42 = user40.getRole();
        java.lang.String str43 = user40.getRole();
        userRepository34.addUser(user40);
        userRepository0.addUser(user40);
        uc2login.data.User user49 = new uc2login.data.User("hi!", "", "hi!");
        java.lang.String str50 = user49.getEmail();
        userRepository0.addUser(user49);
        uc2login.business.AuthenticationService authenticationService52 = new uc2login.business.AuthenticationService(userRepository0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(user32);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
    }

    @Test
    public void test٥٧٧() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٧٧");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.data.User user12 = userRepository0.findByEmail("");
        uc2login.data.User user14 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService15 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService16 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository17 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService18 = new uc2login.business.AuthenticationService(userRepository17);
        uc2login.data.User user22 = new uc2login.data.User("", "", "");
        java.lang.String str23 = user22.getRole();
        java.lang.String str24 = user22.getEmail();
        userRepository17.addUser(user22);
        uc2login.data.User user27 = userRepository17.findByEmail("");
        java.lang.String str28 = user27.getEmail();
        java.lang.String str29 = user27.getRole();
        userRepository0.addUser(user27);
        uc2login.data.User user32 = userRepository0.findByEmail("");
        uc2login.data.User user36 = new uc2login.data.User("", "hi!", "hi!");
        java.lang.String str37 = user36.getPasswordHash();
        userRepository0.addUser(user36);
        uc2login.data.UserRepository userRepository39 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService40 = new uc2login.business.AuthenticationService(userRepository39);
        uc2login.data.User user44 = new uc2login.data.User("", "", "");
        java.lang.String str45 = user44.getRole();
        java.lang.String str46 = user44.getEmail();
        userRepository39.addUser(user44);
        uc2login.data.User user49 = userRepository39.findByEmail("");
        uc2login.data.User user51 = userRepository39.findByEmail("");
        uc2login.data.User user53 = userRepository39.findByEmail("");
        java.lang.String str54 = user53.getPasswordHash();
        userRepository0.addUser(user53);
        uc2login.data.User user57 = userRepository0.findByEmail("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(user32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(user49);
        org.junit.Assert.assertNotNull(user51);
        org.junit.Assert.assertNotNull(user53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(user57);
    }

    @Test
    public void test٥٧٨() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٧٨");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user3 = userRepository0.findByEmail("hi!");
        uc2login.business.AuthenticationService authenticationService4 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user6 = userRepository0.findByEmail("");
        uc2login.data.UserRepository userRepository7 = new uc2login.data.UserRepository();
        uc2login.data.User user9 = userRepository7.findByEmail("");
        uc2login.data.User user11 = userRepository7.findByEmail("hi!");
        uc2login.data.UserRepository userRepository12 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService13 = new uc2login.business.AuthenticationService(userRepository12);
        uc2login.data.User user17 = new uc2login.data.User("", "", "");
        java.lang.String str18 = user17.getRole();
        java.lang.String str19 = user17.getEmail();
        userRepository12.addUser(user17);
        userRepository7.addUser(user17);
        userRepository0.addUser(user17);
        uc2login.data.UserRepository userRepository23 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService24 = new uc2login.business.AuthenticationService(userRepository23);
        uc2login.data.User user28 = new uc2login.data.User("", "", "");
        java.lang.String str29 = user28.getRole();
        java.lang.String str30 = user28.getEmail();
        userRepository23.addUser(user28);
        uc2login.data.User user33 = userRepository23.findByEmail("");
        java.lang.String str34 = user33.getRole();
        userRepository0.addUser(user33);
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(user33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test٥٧٩() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٧٩");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService2 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user4 = userRepository0.findByEmail("hi!");
        uc2login.data.UserRepository userRepository5 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService6 = new uc2login.business.AuthenticationService(userRepository5);
        uc2login.data.User user10 = new uc2login.data.User("", "", "");
        java.lang.String str11 = user10.getRole();
        java.lang.String str12 = user10.getEmail();
        userRepository5.addUser(user10);
        uc2login.data.User user15 = userRepository5.findByEmail("");
        uc2login.business.AuthenticationService authenticationService16 = new uc2login.business.AuthenticationService(userRepository5);
        uc2login.data.UserRepository userRepository17 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService18 = new uc2login.business.AuthenticationService(userRepository17);
        uc2login.data.User user22 = new uc2login.data.User("", "", "");
        java.lang.String str23 = user22.getRole();
        java.lang.String str24 = user22.getEmail();
        userRepository17.addUser(user22);
        uc2login.data.User user27 = userRepository17.findByEmail("");
        userRepository5.addUser(user27);
        uc2login.data.UserRepository userRepository29 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService30 = new uc2login.business.AuthenticationService(userRepository29);
        uc2login.data.User user34 = new uc2login.data.User("", "", "");
        java.lang.String str35 = user34.getRole();
        java.lang.String str36 = user34.getEmail();
        userRepository29.addUser(user34);
        uc2login.data.User user39 = userRepository29.findByEmail("");
        java.lang.String str40 = user39.getEmail();
        userRepository5.addUser(user39);
        java.lang.String str42 = user39.getEmail();
        userRepository0.addUser(user39);
        uc2login.data.User user45 = userRepository0.findByEmail("");
        uc2login.data.User user47 = userRepository0.findByEmail("");
        uc2login.data.User user49 = userRepository0.findByEmail("hi!");
        uc2login.data.User user53 = new uc2login.data.User("", "hi!", "hi!");
        java.lang.String str54 = user53.getEmail();
        userRepository0.addUser(user53);
        java.lang.String str56 = user53.getRole();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertNotNull(user47);
        org.junit.Assert.assertNull(user49);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
    }

    @Test
    public void test٥٨٠() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٨٠");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user3 = userRepository0.findByEmail("hi!");
        uc2login.business.AuthenticationService authenticationService4 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user8 = new uc2login.data.User("", "", "");
        java.lang.String str9 = user8.getRole();
        java.lang.String str10 = user8.getRole();
        java.lang.String str11 = user8.getRole();
        java.lang.String str12 = user8.getPasswordHash();
        userRepository0.addUser(user8);
        uc2login.business.AuthenticationService authenticationService14 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean17 = authenticationService14.validateInput("", "");
        boolean boolean19 = authenticationService14.userExists("");
        boolean boolean22 = authenticationService14.validateInput("", "hi!");
        boolean boolean24 = authenticationService14.userExists("");
        java.lang.Class<?> wildcardClass25 = authenticationService14.getClass();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test٥٨١() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٨١");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user13 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService14 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user16 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService17 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean20 = authenticationService17.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test٥٨٢() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٨٢");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        java.lang.String str11 = user10.getPasswordHash();
        java.lang.String str12 = user10.getEmail();
        java.lang.String str13 = user10.getEmail();
        java.lang.String str14 = user10.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test٥٨٣() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٨٣");
        uc2login.data.User user3 = new uc2login.data.User("", "", "");
        java.lang.String str4 = user3.getRole();
        java.lang.String str5 = user3.getRole();
        java.lang.String str6 = user3.getRole();
        java.lang.String str7 = user3.getPasswordHash();
        java.lang.String str8 = user3.getEmail();
        java.lang.String str9 = user3.getPasswordHash();
        java.lang.String str10 = user3.getPasswordHash();
        java.lang.String str11 = user3.getRole();
        java.lang.String str12 = user3.getPasswordHash();
        java.lang.String str13 = user3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test٥٨٤() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٨٤");
        uc2login.data.User user3 = new uc2login.data.User("", "", "");
        java.lang.String str4 = user3.getRole();
        java.lang.String str5 = user3.getRole();
        java.lang.String str6 = user3.getRole();
        java.lang.String str7 = user3.getPasswordHash();
        java.lang.String str8 = user3.getPasswordHash();
        java.lang.String str9 = user3.getRole();
        java.lang.String str10 = user3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test٥٨٥() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٨٥");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user13 = userRepository0.findByEmail("hi!");
        uc2login.data.User user15 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService16 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user18 = userRepository0.findByEmail("hi!");
        uc2login.data.UserRepository userRepository19 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService20 = new uc2login.business.AuthenticationService(userRepository19);
        uc2login.data.User user24 = new uc2login.data.User("", "", "");
        java.lang.String str25 = user24.getRole();
        java.lang.String str26 = user24.getEmail();
        userRepository19.addUser(user24);
        uc2login.business.AuthenticationService authenticationService28 = new uc2login.business.AuthenticationService(userRepository19);
        uc2login.data.User user32 = new uc2login.data.User("hi!", "", "hi!");
        userRepository19.addUser(user32);
        java.lang.String str34 = user32.getEmail();
        userRepository0.addUser(user32);
        uc2login.data.UserRepository userRepository36 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService37 = new uc2login.business.AuthenticationService(userRepository36);
        uc2login.data.User user41 = new uc2login.data.User("", "", "");
        java.lang.String str42 = user41.getRole();
        java.lang.String str43 = user41.getEmail();
        userRepository36.addUser(user41);
        uc2login.data.User user46 = userRepository36.findByEmail("");
        java.lang.String str47 = user46.getPasswordHash();
        java.lang.String str48 = user46.getPasswordHash();
        java.lang.String str49 = user46.getEmail();
        userRepository0.addUser(user46);
        uc2login.data.UserRepository userRepository51 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService52 = new uc2login.business.AuthenticationService(userRepository51);
        uc2login.data.User user56 = new uc2login.data.User("", "", "");
        java.lang.String str57 = user56.getRole();
        java.lang.String str58 = user56.getEmail();
        userRepository51.addUser(user56);
        uc2login.data.User user61 = userRepository51.findByEmail("");
        java.lang.String str62 = user61.getEmail();
        userRepository0.addUser(user61);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(user61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test٥٨٦() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٨٦");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.data.User user12 = userRepository0.findByEmail("");
        uc2login.data.User user14 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService15 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean17 = authenticationService15.userExists("hi!");
        boolean boolean19 = authenticationService15.userExists("hi!");
        boolean boolean22 = authenticationService15.validateInput("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test٥٨٧() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٨٧");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.data.User user2 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService3 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean5 = authenticationService3.userExists("hi!");
        boolean boolean8 = authenticationService3.validateInput("", "hi!");
        java.lang.Class<?> wildcardClass9 = authenticationService3.getClass();
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test٥٨٨() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٨٨");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.business.AuthenticationService authenticationService9 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user13 = new uc2login.data.User("hi!", "", "hi!");
        userRepository0.addUser(user13);
        uc2login.data.UserRepository userRepository15 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService16 = new uc2login.business.AuthenticationService(userRepository15);
        uc2login.business.AuthenticationService authenticationService17 = new uc2login.business.AuthenticationService(userRepository15);
        uc2login.data.User user19 = userRepository15.findByEmail("hi!");
        uc2login.data.User user21 = userRepository15.findByEmail("hi!");
        uc2login.data.UserRepository userRepository22 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService23 = new uc2login.business.AuthenticationService(userRepository22);
        uc2login.data.User user27 = new uc2login.data.User("", "", "");
        java.lang.String str28 = user27.getRole();
        java.lang.String str29 = user27.getEmail();
        userRepository22.addUser(user27);
        uc2login.data.User user32 = userRepository22.findByEmail("");
        java.lang.String str33 = user32.getEmail();
        java.lang.String str34 = user32.getEmail();
        userRepository15.addUser(user32);
        userRepository0.addUser(user32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(user32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test٥٨٩() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٨٩");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService2 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user4 = userRepository0.findByEmail("hi!");
        uc2login.data.UserRepository userRepository5 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService6 = new uc2login.business.AuthenticationService(userRepository5);
        uc2login.data.User user10 = new uc2login.data.User("", "", "");
        java.lang.String str11 = user10.getRole();
        java.lang.String str12 = user10.getEmail();
        userRepository5.addUser(user10);
        uc2login.data.User user15 = userRepository5.findByEmail("");
        uc2login.business.AuthenticationService authenticationService16 = new uc2login.business.AuthenticationService(userRepository5);
        uc2login.data.UserRepository userRepository17 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService18 = new uc2login.business.AuthenticationService(userRepository17);
        uc2login.data.User user22 = new uc2login.data.User("", "", "");
        java.lang.String str23 = user22.getRole();
        java.lang.String str24 = user22.getEmail();
        userRepository17.addUser(user22);
        uc2login.data.User user27 = userRepository17.findByEmail("");
        userRepository5.addUser(user27);
        uc2login.data.UserRepository userRepository29 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService30 = new uc2login.business.AuthenticationService(userRepository29);
        uc2login.data.User user34 = new uc2login.data.User("", "", "");
        java.lang.String str35 = user34.getRole();
        java.lang.String str36 = user34.getEmail();
        userRepository29.addUser(user34);
        uc2login.data.User user39 = userRepository29.findByEmail("");
        java.lang.String str40 = user39.getEmail();
        userRepository5.addUser(user39);
        java.lang.String str42 = user39.getEmail();
        userRepository0.addUser(user39);
        uc2login.data.User user45 = userRepository0.findByEmail("");
        uc2login.data.User user47 = userRepository0.findByEmail("");
        uc2login.data.User user49 = userRepository0.findByEmail("");
        java.lang.String str50 = user49.getRole();
        java.lang.String str51 = user49.getPasswordHash();
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertNotNull(user47);
        org.junit.Assert.assertNotNull(user49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test٥٩٠() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٩٠");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.data.User user12 = userRepository0.findByEmail("hi!");
        uc2login.data.User user14 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService15 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user17 = userRepository0.findByEmail("hi!");
        uc2login.data.User user21 = new uc2login.data.User("", "", "");
        userRepository0.addUser(user21);
        java.lang.String str23 = user21.getEmail();
        java.lang.String str24 = user21.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test٥٩١() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٩١");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.business.AuthenticationService authenticationService9 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService10 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean12 = authenticationService10.userExists("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test٥٩٢() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٩٢");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService12 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService13 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean16 = authenticationService13.validateInput("", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test٥٩٣() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٩٣");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.data.User user12 = userRepository0.findByEmail("hi!");
        uc2login.data.User user14 = userRepository0.findByEmail("");
        uc2login.data.User user16 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService17 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository18 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService19 = new uc2login.business.AuthenticationService(userRepository18);
        uc2login.business.AuthenticationService authenticationService20 = new uc2login.business.AuthenticationService(userRepository18);
        uc2login.data.User user22 = userRepository18.findByEmail("hi!");
        uc2login.data.UserRepository userRepository23 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService24 = new uc2login.business.AuthenticationService(userRepository23);
        uc2login.data.User user28 = new uc2login.data.User("", "", "");
        java.lang.String str29 = user28.getRole();
        java.lang.String str30 = user28.getEmail();
        userRepository23.addUser(user28);
        uc2login.data.User user33 = userRepository23.findByEmail("");
        uc2login.business.AuthenticationService authenticationService34 = new uc2login.business.AuthenticationService(userRepository23);
        uc2login.data.UserRepository userRepository35 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService36 = new uc2login.business.AuthenticationService(userRepository35);
        uc2login.data.User user40 = new uc2login.data.User("", "", "");
        java.lang.String str41 = user40.getRole();
        java.lang.String str42 = user40.getEmail();
        userRepository35.addUser(user40);
        uc2login.data.User user45 = userRepository35.findByEmail("");
        userRepository23.addUser(user45);
        uc2login.data.UserRepository userRepository47 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService48 = new uc2login.business.AuthenticationService(userRepository47);
        uc2login.data.User user52 = new uc2login.data.User("", "", "");
        java.lang.String str53 = user52.getRole();
        java.lang.String str54 = user52.getEmail();
        userRepository47.addUser(user52);
        uc2login.data.User user57 = userRepository47.findByEmail("");
        java.lang.String str58 = user57.getEmail();
        userRepository23.addUser(user57);
        java.lang.String str60 = user57.getEmail();
        userRepository18.addUser(user57);
        java.lang.String str62 = user57.getEmail();
        userRepository0.addUser(user57);
        java.lang.String str64 = user57.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNull(user22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(user33);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(user57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test٥٩٤() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٩٤");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user13 = userRepository0.findByEmail("hi!");
        uc2login.data.User user15 = userRepository0.findByEmail("hi!");
        uc2login.data.User user17 = userRepository0.findByEmail("");
        java.lang.String str18 = user17.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNotNull(user17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test٥٩٥() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٩٥");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.data.User user14 = new uc2login.data.User("", "", "");
        java.lang.String str15 = user14.getRole();
        java.lang.String str16 = user14.getEmail();
        java.lang.String str17 = user14.getRole();
        userRepository0.addUser(user14);
        java.lang.String str19 = user14.getRole();
        java.lang.String str20 = user14.getEmail();
        java.lang.String str21 = user14.getEmail();
        java.lang.String str22 = user14.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test٥٩٦() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٩٦");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository2 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService3 = new uc2login.business.AuthenticationService(userRepository2);
        uc2login.business.AuthenticationService authenticationService4 = new uc2login.business.AuthenticationService(userRepository2);
        uc2login.data.User user8 = new uc2login.data.User("", "", "");
        java.lang.String str9 = user8.getRole();
        java.lang.String str10 = user8.getRole();
        java.lang.String str11 = user8.getRole();
        userRepository2.addUser(user8);
        userRepository0.addUser(user8);
        uc2login.data.UserRepository userRepository14 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService15 = new uc2login.business.AuthenticationService(userRepository14);
        uc2login.data.User user19 = new uc2login.data.User("", "", "");
        java.lang.String str20 = user19.getRole();
        java.lang.String str21 = user19.getEmail();
        userRepository14.addUser(user19);
        java.lang.String str23 = user19.getEmail();
        java.lang.String str24 = user19.getEmail();
        java.lang.String str25 = user19.getRole();
        userRepository0.addUser(user19);
        uc2login.business.AuthenticationService authenticationService27 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean30 = authenticationService27.validateInput("hi!", "hi!");
        boolean boolean33 = authenticationService27.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test٥٩٧() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٩٧");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user13 = userRepository0.findByEmail("hi!");
        uc2login.data.User user15 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService16 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user18 = userRepository0.findByEmail("hi!");
        uc2login.data.User user22 = new uc2login.data.User("hi!", "hi!", "hi!");
        userRepository0.addUser(user22);
        uc2login.data.UserRepository userRepository24 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService25 = new uc2login.business.AuthenticationService(userRepository24);
        uc2login.data.User user29 = new uc2login.data.User("", "", "");
        java.lang.String str30 = user29.getRole();
        java.lang.String str31 = user29.getEmail();
        userRepository24.addUser(user29);
        uc2login.data.User user34 = userRepository24.findByEmail("");
        uc2login.data.User user36 = userRepository24.findByEmail("hi!");
        uc2login.data.User user38 = userRepository24.findByEmail("");
        uc2login.business.AuthenticationService authenticationService39 = new uc2login.business.AuthenticationService(userRepository24);
        uc2login.data.User user41 = userRepository24.findByEmail("hi!");
        uc2login.data.User user45 = new uc2login.data.User("", "", "");
        userRepository24.addUser(user45);
        java.lang.String str47 = user45.getEmail();
        userRepository0.addUser(user45);
        java.lang.String str49 = user45.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(user34);
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNull(user41);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test٥٩٨() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٩٨");
        uc2login.data.User user3 = new uc2login.data.User("", "", "");
        java.lang.String str4 = user3.getPasswordHash();
        java.lang.String str5 = user3.getEmail();
        java.lang.String str6 = user3.getPasswordHash();
        java.lang.String str7 = user3.getEmail();
        java.lang.String str8 = user3.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test٥٩٩() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٥٩٩");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.business.AuthenticationService authenticationService9 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user13 = new uc2login.data.User("", "", "");
        java.lang.String str14 = user13.getRole();
        java.lang.String str15 = user13.getEmail();
        userRepository0.addUser(user13);
        java.lang.String str17 = user13.getEmail();
        java.lang.String str18 = user13.getEmail();
        java.lang.String str19 = user13.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test٦٠٠() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٦٠٠");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService2 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user4 = userRepository0.findByEmail("hi!");
        uc2login.data.UserRepository userRepository5 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService6 = new uc2login.business.AuthenticationService(userRepository5);
        uc2login.data.User user10 = new uc2login.data.User("", "", "");
        java.lang.String str11 = user10.getRole();
        java.lang.String str12 = user10.getEmail();
        userRepository5.addUser(user10);
        uc2login.data.User user15 = userRepository5.findByEmail("");
        uc2login.business.AuthenticationService authenticationService16 = new uc2login.business.AuthenticationService(userRepository5);
        uc2login.data.UserRepository userRepository17 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService18 = new uc2login.business.AuthenticationService(userRepository17);
        uc2login.data.User user22 = new uc2login.data.User("", "", "");
        java.lang.String str23 = user22.getRole();
        java.lang.String str24 = user22.getEmail();
        userRepository17.addUser(user22);
        uc2login.data.User user27 = userRepository17.findByEmail("");
        userRepository5.addUser(user27);
        uc2login.data.UserRepository userRepository29 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService30 = new uc2login.business.AuthenticationService(userRepository29);
        uc2login.data.User user34 = new uc2login.data.User("", "", "");
        java.lang.String str35 = user34.getRole();
        java.lang.String str36 = user34.getEmail();
        userRepository29.addUser(user34);
        uc2login.data.User user39 = userRepository29.findByEmail("");
        java.lang.String str40 = user39.getEmail();
        userRepository5.addUser(user39);
        java.lang.String str42 = user39.getEmail();
        userRepository0.addUser(user39);
        uc2login.data.User user45 = userRepository0.findByEmail("");
        uc2login.data.UserRepository userRepository46 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService47 = new uc2login.business.AuthenticationService(userRepository46);
        uc2login.data.User user51 = new uc2login.data.User("", "", "");
        java.lang.String str52 = user51.getRole();
        java.lang.String str53 = user51.getEmail();
        userRepository46.addUser(user51);
        uc2login.data.User user56 = userRepository46.findByEmail("");
        java.lang.String str57 = user56.getEmail();
        java.lang.String str58 = user56.getEmail();
        userRepository0.addUser(user56);
        uc2login.business.AuthenticationService authenticationService60 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean63 = authenticationService60.login("hi!", "");
        boolean boolean65 = authenticationService60.userExists("");
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(user56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test٦٠١() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٦٠١");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        java.lang.String str9 = user5.getEmail();
        java.lang.String str10 = user5.getRole();
        java.lang.String str11 = user5.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test٦٠٢() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٦٠٢");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository2 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService3 = new uc2login.business.AuthenticationService(userRepository2);
        uc2login.business.AuthenticationService authenticationService4 = new uc2login.business.AuthenticationService(userRepository2);
        uc2login.data.User user8 = new uc2login.data.User("", "", "");
        java.lang.String str9 = user8.getRole();
        java.lang.String str10 = user8.getRole();
        java.lang.String str11 = user8.getRole();
        userRepository2.addUser(user8);
        userRepository0.addUser(user8);
        java.lang.String str14 = user8.getPasswordHash();
        java.lang.String str15 = user8.getRole();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test٦٠٣() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٦٠٣");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService2 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user4 = userRepository0.findByEmail("hi!");
        uc2login.data.User user6 = userRepository0.findByEmail("hi!");
        uc2login.data.UserRepository userRepository7 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService8 = new uc2login.business.AuthenticationService(userRepository7);
        uc2login.data.User user12 = new uc2login.data.User("", "", "");
        java.lang.String str13 = user12.getRole();
        java.lang.String str14 = user12.getEmail();
        userRepository7.addUser(user12);
        uc2login.data.User user17 = userRepository7.findByEmail("");
        java.lang.String str18 = user17.getEmail();
        java.lang.String str19 = user17.getEmail();
        userRepository0.addUser(user17);
        uc2login.business.AuthenticationService authenticationService21 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService22 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user24 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService25 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean28 = authenticationService25.login("", "hi!");
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(user17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test٦٠٤() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٦٠٤");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user13 = userRepository0.findByEmail("hi!");
        uc2login.data.User user17 = new uc2login.data.User("", "", "");
        java.lang.String str18 = user17.getRole();
        java.lang.String str19 = user17.getRole();
        java.lang.String str20 = user17.getPasswordHash();
        java.lang.String str21 = user17.getPasswordHash();
        java.lang.String str22 = user17.getRole();
        java.lang.String str23 = user17.getPasswordHash();
        java.lang.String str24 = user17.getEmail();
        userRepository0.addUser(user17);
        uc2login.data.UserRepository userRepository26 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService27 = new uc2login.business.AuthenticationService(userRepository26);
        uc2login.data.User user31 = new uc2login.data.User("", "", "");
        java.lang.String str32 = user31.getRole();
        java.lang.String str33 = user31.getEmail();
        userRepository26.addUser(user31);
        uc2login.data.User user36 = userRepository26.findByEmail("");
        uc2login.data.User user38 = userRepository26.findByEmail("");
        uc2login.data.User user40 = userRepository26.findByEmail("");
        userRepository0.addUser(user40);
        uc2login.data.User user43 = userRepository0.findByEmail("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(user36);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertNotNull(user43);
    }

    @Test
    public void test٦٠٥() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٦٠٥");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.data.User user12 = userRepository0.findByEmail("");
        uc2login.data.User user14 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService15 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService16 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService17 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean20 = authenticationService17.validateInput("hi!", "hi!");
        boolean boolean23 = authenticationService17.validateInput("hi!", "hi!");
        boolean boolean25 = authenticationService17.userExists("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test٦٠٦() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٦٠٦");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService2 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user4 = userRepository0.findByEmail("hi!");
        uc2login.data.User user6 = userRepository0.findByEmail("hi!");
        uc2login.data.UserRepository userRepository7 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService8 = new uc2login.business.AuthenticationService(userRepository7);
        uc2login.data.User user12 = new uc2login.data.User("", "", "");
        java.lang.String str13 = user12.getRole();
        java.lang.String str14 = user12.getEmail();
        userRepository7.addUser(user12);
        uc2login.data.User user17 = userRepository7.findByEmail("");
        java.lang.String str18 = user17.getEmail();
        java.lang.String str19 = user17.getEmail();
        userRepository0.addUser(user17);
        uc2login.business.AuthenticationService authenticationService21 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.business.AuthenticationService authenticationService22 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean25 = authenticationService22.login("", "");
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(user17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test٦٠٧() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٦٠٧");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository12 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService13 = new uc2login.business.AuthenticationService(userRepository12);
        uc2login.data.User user17 = new uc2login.data.User("", "", "");
        java.lang.String str18 = user17.getRole();
        java.lang.String str19 = user17.getEmail();
        userRepository12.addUser(user17);
        uc2login.data.User user22 = userRepository12.findByEmail("");
        userRepository0.addUser(user22);
        uc2login.business.AuthenticationService authenticationService24 = new uc2login.business.AuthenticationService(userRepository0);
        boolean boolean27 = authenticationService24.login("", "");
        boolean boolean29 = authenticationService24.userExists("hi!");
        boolean boolean32 = authenticationService24.login("hi!", "");
        boolean boolean35 = authenticationService24.validateInput("", "");
        boolean boolean38 = authenticationService24.login("", "");
        boolean boolean40 = authenticationService24.userExists("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test٦٠٨() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٦٠٨");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.data.User user2 = userRepository0.findByEmail("");
        uc2login.data.User user4 = userRepository0.findByEmail("hi!");
        uc2login.data.UserRepository userRepository5 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService6 = new uc2login.business.AuthenticationService(userRepository5);
        uc2login.data.User user10 = new uc2login.data.User("", "", "");
        java.lang.String str11 = user10.getRole();
        java.lang.String str12 = user10.getEmail();
        userRepository5.addUser(user10);
        userRepository0.addUser(user10);
        uc2login.business.AuthenticationService authenticationService15 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.UserRepository userRepository16 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService17 = new uc2login.business.AuthenticationService(userRepository16);
        uc2login.data.User user21 = new uc2login.data.User("", "", "");
        java.lang.String str22 = user21.getRole();
        java.lang.String str23 = user21.getEmail();
        userRepository16.addUser(user21);
        uc2login.data.User user26 = userRepository16.findByEmail("");
        java.lang.String str27 = user26.getPasswordHash();
        java.lang.String str28 = user26.getPasswordHash();
        java.lang.String str29 = user26.getRole();
        userRepository0.addUser(user26);
        java.lang.String str31 = user26.getRole();
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test٦٠٩() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test٦٠٩");
        uc2login.data.UserRepository userRepository0 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService1 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user5 = new uc2login.data.User("", "", "");
        java.lang.String str6 = user5.getRole();
        java.lang.String str7 = user5.getEmail();
        userRepository0.addUser(user5);
        uc2login.data.User user10 = userRepository0.findByEmail("");
        uc2login.business.AuthenticationService authenticationService11 = new uc2login.business.AuthenticationService(userRepository0);
        uc2login.data.User user13 = userRepository0.findByEmail("hi!");
        uc2login.data.UserRepository userRepository14 = new uc2login.data.UserRepository();
        uc2login.business.AuthenticationService authenticationService15 = new uc2login.business.AuthenticationService(userRepository14);
        uc2login.data.User user19 = new uc2login.data.User("", "", "");
        java.lang.String str20 = user19.getRole();
        java.lang.String str21 = user19.getEmail();
        userRepository14.addUser(user19);
        java.lang.String str23 = user19.getRole();
        userRepository0.addUser(user19);
        java.lang.String str25 = user19.getPasswordHash();
        java.lang.String str26 = user19.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }
}

