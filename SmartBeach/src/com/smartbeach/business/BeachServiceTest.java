package com.smartbeach.business;

import com.smartbeach.data.Beach;
import java.util.List;


//كلاس اختبار مسؤول عن التحقق من طبقة العمليات والخدمات (Business Logic)

public class BeachServiceTest {
    
    public static void main(String[] args) {
        System.out.println("========== RUNNING SERVICE TESTS ==========");
        
        BeachService service = new BeachService();
        
        // التحقق من عمل دالة عرض الشواطئ المتاحة عبر الـ Service
        List<Beach> beaches = service.viewAvailableBeaches();
        boolean isListNotEmpty = beaches != null && !beaches.isEmpty();
        System.out.println("Test 1 (View Beaches): " + (isListNotEmpty ? "PASSED ✅" : "FAILED ❌"));
    }
}