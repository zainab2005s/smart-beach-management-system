import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", (int) 'a', (int) 'a');
        java.lang.String str5 = beach4.getName();
        int int6 = beach4.getTemperature();
        java.lang.String str7 = beach4.getName();
        java.lang.String str8 = beach4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.smartbeach.data.BeachRepository beachRepository0 = new com.smartbeach.data.BeachRepository();
        java.util.List<com.smartbeach.data.Beach> beachList1 = beachRepository0.getBeachesList();
        java.lang.Class<?> wildcardClass2 = beachList1.getClass();
        org.junit.Assert.assertNotNull(beachList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.smartbeach.business.BeachService beachService0 = new com.smartbeach.business.BeachService();
        com.smartbeach.data.Beach beach2 = beachService0.getBeachDetails("hi!");
        java.lang.Class<?> wildcardClass3 = beachService0.getClass();
        org.junit.Assert.assertNull(beach2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.smartbeach.business.BeachService beachService0 = new com.smartbeach.business.BeachService();
        com.smartbeach.data.Beach beach2 = beachService0.getBeachDetails("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = beach2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(beach2);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", (int) 'a', (int) 'a');
        java.lang.Class<?> wildcardClass5 = beach4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("hi!", "", (int) (short) -1, (int) ' ');
        java.lang.Class<?> wildcardClass5 = beach4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.smartbeach.business.BeachService beachService0 = new com.smartbeach.business.BeachService();
        com.smartbeach.data.Beach beach2 = beachService0.getBeachDetails("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = beach2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(beach2);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", (int) 'a', (int) 'a');
        java.lang.String str5 = beach4.getName();
        int int6 = beach4.getTemperature();
        java.lang.Class<?> wildcardClass7 = beach4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", (int) 'a', (int) 'a');
        java.lang.String str5 = beach4.getName();
        java.lang.String str6 = beach4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", 1, 1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.smartbeach.data.BeachRepository beachRepository0 = new com.smartbeach.data.BeachRepository();
        java.util.List<com.smartbeach.data.Beach> beachList1 = beachRepository0.getBeachesList();
        java.util.List<com.smartbeach.data.Beach> beachList2 = beachRepository0.getBeachesList();
        com.smartbeach.data.Beach beach4 = beachRepository0.findBeachByName("");
        com.smartbeach.data.Beach beach6 = beachRepository0.findBeachByName("hi!");
        org.junit.Assert.assertNotNull(beachList1);
        org.junit.Assert.assertNotNull(beachList2);
        org.junit.Assert.assertNull(beach4);
        org.junit.Assert.assertNull(beach6);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "Open / Very Sunny & Hot", (int) ' ', 1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", 100, (int) (byte) 1);
        java.lang.String str5 = beach4.getLocation();
        int int6 = beach4.getVisitorCount();
        int int7 = beach4.getTemperature();
        java.lang.Class<?> wildcardClass8 = beach4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("hi!", "", (int) (short) 10, (int) (short) 0);
        int int5 = beach4.getTemperature();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", 100, (int) (byte) 1);
        java.lang.String str5 = beach4.getLocation();
        int int6 = beach4.getVisitorCount();
        java.lang.String str7 = beach4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("hi!", "", (int) (short) -1, (int) ' ');
        java.lang.String str5 = beach4.getLocation();
        int int6 = beach4.getTemperature();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.smartbeach.business.BeachService beachService0 = new com.smartbeach.business.BeachService();
        java.util.List<com.smartbeach.data.Beach> beachList1 = beachService0.viewAvailableBeaches();
        com.smartbeach.data.Beach beach3 = beachService0.getBeachDetails("hi!");
        com.smartbeach.data.Beach beach5 = beachService0.getBeachDetails("");
        com.smartbeach.data.Beach beach7 = beachService0.getBeachDetails("");
        com.smartbeach.data.Beach beach9 = beachService0.getBeachDetails("hi!");
        org.junit.Assert.assertNotNull(beachList1);
        org.junit.Assert.assertNull(beach3);
        org.junit.Assert.assertNull(beach5);
        org.junit.Assert.assertNull(beach7);
        org.junit.Assert.assertNull(beach9);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", (int) 'a', (int) 'a');
        java.lang.String str5 = beach4.getStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Open / Very Sunny & Hot" + "'", str5, "Open / Very Sunny & Hot");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "Open / Very Sunny & Hot", (int) (short) 1, 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.smartbeach.business.BeachService beachService0 = new com.smartbeach.business.BeachService();
        java.util.List<com.smartbeach.data.Beach> beachList1 = beachService0.viewAvailableBeaches();
        com.smartbeach.data.Beach beach3 = beachService0.getBeachDetails("hi!");
        com.smartbeach.data.Beach beach5 = beachService0.getBeachDetails("Open / Very Sunny & Hot");
        com.smartbeach.data.Beach beach7 = beachService0.getBeachDetails("hi!");
        java.util.List<com.smartbeach.data.Beach> beachList8 = beachService0.viewAvailableBeaches();
        com.smartbeach.data.Beach beach10 = beachService0.getBeachDetails("");
        org.junit.Assert.assertNotNull(beachList1);
        org.junit.Assert.assertNull(beach3);
        org.junit.Assert.assertNull(beach5);
        org.junit.Assert.assertNull(beach7);
        org.junit.Assert.assertNotNull(beachList8);
        org.junit.Assert.assertNull(beach10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.smartbeach.data.BeachRepository beachRepository0 = new com.smartbeach.data.BeachRepository();
        java.util.List<com.smartbeach.data.Beach> beachList1 = beachRepository0.getBeachesList();
        java.util.List<com.smartbeach.data.Beach> beachList2 = beachRepository0.getBeachesList();
        java.util.List<com.smartbeach.data.Beach> beachList3 = beachRepository0.getBeachesList();
        java.lang.Class<?> wildcardClass4 = beachList3.getClass();
        org.junit.Assert.assertNotNull(beachList1);
        org.junit.Assert.assertNotNull(beachList2);
        org.junit.Assert.assertNotNull(beachList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", 0, (int) (short) -1);
        int int5 = beach4.getVisitorCount();
        int int6 = beach4.getVisitorCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.smartbeach.data.BeachRepository beachRepository0 = new com.smartbeach.data.BeachRepository();
        com.smartbeach.data.Beach beach2 = beachRepository0.findBeachByName("");
        com.smartbeach.data.Beach beach4 = beachRepository0.findBeachByName("");
        com.smartbeach.data.Beach beach6 = beachRepository0.findBeachByName("Open / Very Sunny & Hot");
        java.util.List<com.smartbeach.data.Beach> beachList7 = beachRepository0.getBeachesList();
        org.junit.Assert.assertNull(beach2);
        org.junit.Assert.assertNull(beach4);
        org.junit.Assert.assertNull(beach6);
        org.junit.Assert.assertNotNull(beachList7);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("hi!", "Open / Ideal Weather", (int) ' ', (int) ' ');
        int int5 = beach4.getTemperature();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "Open / Very Sunny & Hot", 97, (int) (short) 100);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", 100, (int) (byte) 1);
        java.lang.String str5 = beach4.getLocation();
        java.lang.String str6 = beach4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.smartbeach.business.BeachService beachService0 = new com.smartbeach.business.BeachService();
        com.smartbeach.data.Beach beach2 = beachService0.getBeachDetails("");
        java.util.List<com.smartbeach.data.Beach> beachList3 = beachService0.viewAvailableBeaches();
        java.util.List<com.smartbeach.data.Beach> beachList4 = beachService0.viewAvailableBeaches();
        org.junit.Assert.assertNull(beach2);
        org.junit.Assert.assertNotNull(beachList3);
        org.junit.Assert.assertNotNull(beachList4);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", 100, (int) (byte) 1);
        java.lang.String str5 = beach4.getLocation();
        java.lang.String str6 = beach4.getName();
        java.lang.String str7 = beach4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", 0, (int) (short) -1);
        java.lang.String str5 = beach4.getLocation();
        java.lang.String str6 = beach4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("Open / Ideal Weather", "", (int) (byte) -1, 97);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("hi!", "Open / Ideal Weather", 100, (int) (byte) 0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("Open / Very Sunny & Hot", "Open / Ideal Weather", 10, 32);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.smartbeach.data.BeachRepository beachRepository0 = new com.smartbeach.data.BeachRepository();
        java.util.List<com.smartbeach.data.Beach> beachList1 = beachRepository0.getBeachesList();
        java.util.List<com.smartbeach.data.Beach> beachList2 = beachRepository0.getBeachesList();
        com.smartbeach.data.Beach beach4 = beachRepository0.findBeachByName("");
        java.util.List<com.smartbeach.data.Beach> beachList5 = beachRepository0.getBeachesList();
        com.smartbeach.data.Beach beach7 = beachRepository0.findBeachByName("");
        org.junit.Assert.assertNotNull(beachList1);
        org.junit.Assert.assertNotNull(beachList2);
        org.junit.Assert.assertNull(beach4);
        org.junit.Assert.assertNotNull(beachList5);
        org.junit.Assert.assertNull(beach7);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", (int) 'a', (int) 'a');
        int int5 = beach4.getTemperature();
        java.lang.String str6 = beach4.getName();
        int int7 = beach4.getTemperature();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", 0, (int) (short) -1);
        int int5 = beach4.getTemperature();
        int int6 = beach4.getVisitorCount();
        java.lang.String str7 = beach4.getStatus();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Open / Ideal Weather" + "'", str7, "Open / Ideal Weather");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.smartbeach.business.BeachService beachService0 = new com.smartbeach.business.BeachService();
        java.util.List<com.smartbeach.data.Beach> beachList1 = beachService0.viewAvailableBeaches();
        com.smartbeach.data.Beach beach3 = beachService0.getBeachDetails("hi!");
        com.smartbeach.data.Beach beach5 = beachService0.getBeachDetails("");
        java.util.List<com.smartbeach.data.Beach> beachList6 = beachService0.viewAvailableBeaches();
        com.smartbeach.data.Beach beach8 = beachService0.getBeachDetails("");
        org.junit.Assert.assertNotNull(beachList1);
        org.junit.Assert.assertNull(beach3);
        org.junit.Assert.assertNull(beach5);
        org.junit.Assert.assertNotNull(beachList6);
        org.junit.Assert.assertNull(beach8);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("hi!", "Open / Ideal Weather", 0, 97);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", (int) 'a', (int) 'a');
        int int5 = beach4.getTemperature();
        java.lang.String str6 = beach4.getName();
        java.lang.Class<?> wildcardClass7 = beach4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", (int) 'a', (int) 'a');
        java.lang.String str5 = beach4.getName();
        int int6 = beach4.getTemperature();
        int int7 = beach4.getVisitorCount();
        java.lang.String str8 = beach4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", 100, (int) (byte) 1);
        java.lang.String str5 = beach4.getLocation();
        int int6 = beach4.getVisitorCount();
        int int7 = beach4.getVisitorCount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.smartbeach.data.BeachRepository beachRepository0 = new com.smartbeach.data.BeachRepository();
        java.util.List<com.smartbeach.data.Beach> beachList1 = beachRepository0.getBeachesList();
        com.smartbeach.data.Beach beach3 = beachRepository0.findBeachByName("hi!");
        java.util.List<com.smartbeach.data.Beach> beachList4 = beachRepository0.getBeachesList();
        org.junit.Assert.assertNotNull(beachList1);
        org.junit.Assert.assertNull(beach3);
        org.junit.Assert.assertNotNull(beachList4);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", 0, (int) (short) -1);
        int int5 = beach4.getTemperature();
        java.lang.String str6 = beach4.getStatus();
        java.lang.String str7 = beach4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Open / Ideal Weather" + "'", str6, "Open / Ideal Weather");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", 32, 1);
        int int5 = beach4.getTemperature();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.smartbeach.business.BeachService beachService0 = new com.smartbeach.business.BeachService();
        java.util.List<com.smartbeach.data.Beach> beachList1 = beachService0.viewAvailableBeaches();
        java.util.List<com.smartbeach.data.Beach> beachList2 = beachService0.viewAvailableBeaches();
        java.lang.Class<?> wildcardClass3 = beachList2.getClass();
        org.junit.Assert.assertNotNull(beachList1);
        org.junit.Assert.assertNotNull(beachList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", (int) 'a', (int) 'a');
        java.lang.String str5 = beach4.getName();
        int int6 = beach4.getVisitorCount();
        java.lang.String str7 = beach4.getName();
        int int8 = beach4.getTemperature();
        java.lang.String str9 = beach4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", (int) 'a', (int) 'a');
        int int5 = beach4.getTemperature();
        int int6 = beach4.getTemperature();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.smartbeach.data.BeachRepository beachRepository0 = new com.smartbeach.data.BeachRepository();
        com.smartbeach.data.Beach beach2 = beachRepository0.findBeachByName("");
        com.smartbeach.data.Beach beach4 = beachRepository0.findBeachByName("");
        com.smartbeach.data.Beach beach6 = beachRepository0.findBeachByName("hi!");
        java.util.List<com.smartbeach.data.Beach> beachList7 = beachRepository0.getBeachesList();
        org.junit.Assert.assertNull(beach2);
        org.junit.Assert.assertNull(beach4);
        org.junit.Assert.assertNull(beach6);
        org.junit.Assert.assertNotNull(beachList7);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("Open / Very Sunny & Hot", "hi!", (-1), (int) 'a');
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", (int) 'a', (int) 'a');
        java.lang.String str5 = beach4.getName();
        int int6 = beach4.getTemperature();
        java.lang.String str7 = beach4.getStatus();
        int int8 = beach4.getVisitorCount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Open / Very Sunny & Hot" + "'", str7, "Open / Very Sunny & Hot");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.smartbeach.data.BeachRepository beachRepository0 = new com.smartbeach.data.BeachRepository();
        java.util.List<com.smartbeach.data.Beach> beachList1 = beachRepository0.getBeachesList();
        com.smartbeach.data.Beach beach3 = beachRepository0.findBeachByName("");
        com.smartbeach.data.Beach beach5 = beachRepository0.findBeachByName("");
        java.util.List<com.smartbeach.data.Beach> beachList6 = beachRepository0.getBeachesList();
        java.util.List<com.smartbeach.data.Beach> beachList7 = beachRepository0.getBeachesList();
        com.smartbeach.data.Beach beach9 = beachRepository0.findBeachByName("Open / Very Sunny & Hot");
        org.junit.Assert.assertNotNull(beachList1);
        org.junit.Assert.assertNull(beach3);
        org.junit.Assert.assertNull(beach5);
        org.junit.Assert.assertNotNull(beachList6);
        org.junit.Assert.assertNotNull(beachList7);
        org.junit.Assert.assertNull(beach9);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.smartbeach.data.BeachRepository beachRepository0 = new com.smartbeach.data.BeachRepository();
        com.smartbeach.data.Beach beach2 = beachRepository0.findBeachByName("hi!");
        org.junit.Assert.assertNull(beach2);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", (int) 'a', (int) 'a');
        java.lang.String str5 = beach4.getName();
        int int6 = beach4.getTemperature();
        java.lang.String str7 = beach4.getName();
        java.lang.String str8 = beach4.getName();
        int int9 = beach4.getTemperature();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("Open / Ideal Weather", "Open / Very Sunny & Hot", 0, (int) (byte) 1);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.smartbeach.business.BeachService beachService0 = new com.smartbeach.business.BeachService();
        com.smartbeach.data.Beach beach2 = beachService0.getBeachDetails("");
        com.smartbeach.data.Beach beach4 = beachService0.getBeachDetails("");
        org.junit.Assert.assertNull(beach2);
        org.junit.Assert.assertNull(beach4);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("hi!", "", (int) (short) -1, (int) ' ');
        java.lang.String str5 = beach4.getLocation();
        java.lang.String str6 = beach4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        com.smartbeach.business.BeachService beachService0 = new com.smartbeach.business.BeachService();
        java.util.List<com.smartbeach.data.Beach> beachList1 = beachService0.viewAvailableBeaches();
        com.smartbeach.data.Beach beach3 = beachService0.getBeachDetails("hi!");
        com.smartbeach.data.Beach beach5 = beachService0.getBeachDetails("");
        java.util.List<com.smartbeach.data.Beach> beachList6 = beachService0.viewAvailableBeaches();
        java.util.List<com.smartbeach.data.Beach> beachList7 = beachService0.viewAvailableBeaches();
        java.util.List<com.smartbeach.data.Beach> beachList8 = beachService0.viewAvailableBeaches();
        org.junit.Assert.assertNotNull(beachList1);
        org.junit.Assert.assertNull(beach3);
        org.junit.Assert.assertNull(beach5);
        org.junit.Assert.assertNotNull(beachList6);
        org.junit.Assert.assertNotNull(beachList7);
        org.junit.Assert.assertNotNull(beachList8);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", 0, (int) (short) -1);
        java.lang.String str5 = beach4.getLocation();
        java.lang.String str6 = beach4.getStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Open / Ideal Weather" + "'", str6, "Open / Ideal Weather");
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", 0, (int) (short) -1);
        int int5 = beach4.getVisitorCount();
        int int6 = beach4.getTemperature();
        int int7 = beach4.getTemperature();
        int int8 = beach4.getVisitorCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", 100, (int) (byte) 1);
        java.lang.String str5 = beach4.getLocation();
        java.lang.String str6 = beach4.getName();
        java.lang.String str7 = beach4.getName();
        java.lang.String str8 = beach4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        com.smartbeach.business.BeachService beachService0 = new com.smartbeach.business.BeachService();
        java.util.List<com.smartbeach.data.Beach> beachList1 = beachService0.viewAvailableBeaches();
        com.smartbeach.data.Beach beach3 = beachService0.getBeachDetails("hi!");
        com.smartbeach.data.Beach beach5 = beachService0.getBeachDetails("Open / Very Sunny & Hot");
        java.util.List<com.smartbeach.data.Beach> beachList6 = beachService0.viewAvailableBeaches();
        java.util.List<com.smartbeach.data.Beach> beachList7 = beachService0.viewAvailableBeaches();
        org.junit.Assert.assertNotNull(beachList1);
        org.junit.Assert.assertNull(beach3);
        org.junit.Assert.assertNull(beach5);
        org.junit.Assert.assertNotNull(beachList6);
        org.junit.Assert.assertNotNull(beachList7);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", (int) 'a', (int) 'a');
        java.lang.String str5 = beach4.getName();
        int int6 = beach4.getVisitorCount();
        java.lang.String str7 = beach4.getStatus();
        java.lang.String str8 = beach4.getName();
        java.lang.String str9 = beach4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Open / Very Sunny & Hot" + "'", str7, "Open / Very Sunny & Hot");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        com.smartbeach.data.BeachRepository beachRepository0 = new com.smartbeach.data.BeachRepository();
        java.util.List<com.smartbeach.data.Beach> beachList1 = beachRepository0.getBeachesList();
        com.smartbeach.data.Beach beach3 = beachRepository0.findBeachByName("Open / Very Sunny & Hot");
        java.util.List<com.smartbeach.data.Beach> beachList4 = beachRepository0.getBeachesList();
        org.junit.Assert.assertNotNull(beachList1);
        org.junit.Assert.assertNull(beach3);
        org.junit.Assert.assertNotNull(beachList4);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", (int) 'a', (int) 'a');
        java.lang.String str5 = beach4.getName();
        int int6 = beach4.getTemperature();
        java.lang.String str7 = beach4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", (int) 'a', (int) 'a');
        java.lang.String str5 = beach4.getName();
        int int6 = beach4.getTemperature();
        int int7 = beach4.getVisitorCount();
        java.lang.Class<?> wildcardClass8 = beach4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", 0, (int) (short) -1);
        int int5 = beach4.getTemperature();
        java.lang.String str6 = beach4.getStatus();
        int int7 = beach4.getTemperature();
        java.lang.String str8 = beach4.getLocation();
        int int9 = beach4.getTemperature();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Open / Ideal Weather" + "'", str6, "Open / Ideal Weather");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        com.smartbeach.business.BeachService beachService0 = new com.smartbeach.business.BeachService();
        java.util.List<com.smartbeach.data.Beach> beachList1 = beachService0.viewAvailableBeaches();
        java.util.List<com.smartbeach.data.Beach> beachList2 = beachService0.viewAvailableBeaches();
        com.smartbeach.data.Beach beach4 = beachService0.getBeachDetails("hi!");
        java.util.List<com.smartbeach.data.Beach> beachList5 = beachService0.viewAvailableBeaches();
        org.junit.Assert.assertNotNull(beachList1);
        org.junit.Assert.assertNotNull(beachList2);
        org.junit.Assert.assertNull(beach4);
        org.junit.Assert.assertNotNull(beachList5);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", 100, (int) (byte) 1);
        java.lang.String str5 = beach4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("Open / Very Sunny & Hot", "", (int) (short) 0, (-1));
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "hi!", 100, (int) (byte) 1);
        java.lang.String str5 = beach4.getLocation();
        int int6 = beach4.getTemperature();
        java.lang.String str7 = beach4.getName();
        java.lang.Class<?> wildcardClass8 = beach4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("hi!", "", (int) (short) 10, (int) (short) 0);
        java.lang.String str5 = beach4.getName();
        java.lang.Class<?> wildcardClass6 = beach4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("hi!", "hi!", (int) (byte) 100, (int) (short) 0);
        int int5 = beach4.getVisitorCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        com.smartbeach.business.BeachService beachService0 = new com.smartbeach.business.BeachService();
        java.util.List<com.smartbeach.data.Beach> beachList1 = beachService0.viewAvailableBeaches();
        com.smartbeach.data.Beach beach3 = beachService0.getBeachDetails("hi!");
        com.smartbeach.data.Beach beach5 = beachService0.getBeachDetails("");
        com.smartbeach.data.Beach beach7 = beachService0.getBeachDetails("");
        com.smartbeach.data.Beach beach9 = beachService0.getBeachDetails("");
        com.smartbeach.data.Beach beach11 = beachService0.getBeachDetails("hi!");
        org.junit.Assert.assertNotNull(beachList1);
        org.junit.Assert.assertNull(beach3);
        org.junit.Assert.assertNull(beach5);
        org.junit.Assert.assertNull(beach7);
        org.junit.Assert.assertNull(beach9);
        org.junit.Assert.assertNull(beach11);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        com.smartbeach.data.Beach beach4 = new com.smartbeach.data.Beach("", "Open / Ideal Weather", (int) (byte) -1, 32);
    }
}

