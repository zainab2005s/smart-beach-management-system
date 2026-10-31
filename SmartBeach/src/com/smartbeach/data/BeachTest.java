package com.smartbeach.data;

//كلاس اختبار مخصص للتحقق من بيانات الشاطئ وحساب الحالة التلقائية (IoT Status)
public class BeachTest {
    
    public static void main(String[] args) {
        System.out.println("========== RUNNING BEACH DATA TESTS ==========");

        // اختبار حالة الشاطئ المزدحم بناءً على عدد الزوار
        Beach crowdedBeach = new Beach("Test Beach 1", "Zallaq", 28, 350);
        boolean isCrowdedTestPassed = crowdedBeach.getStatus().equals("Crowded (High Traffic)");
        System.out.println("Test 1 (Crowded Status): " + (isCrowdedTestPassed ? "PASSED ✅" : "FAILED ❌"));
    }
}