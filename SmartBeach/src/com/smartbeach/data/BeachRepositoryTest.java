package com.smartbeach.data;

import java.util.List;


//كلاس اختبار مسؤول عن التحقق من طبقة المستودع واسترجاع بيانات الشواطئ

public class BeachRepositoryTest {
    
    public static void main(String[] args) {
        System.out.println("========== RUNNING REPOSITORY TESTS ==========");
        
        BeachRepository repository = new BeachRepository();
        
        // التحقق من أن قائمة الشواطئ يتم تحميلها بنجاح وليست فارغة
        List<Beach> beaches = repository.getBeachesList();
        boolean isListLoaded = beaches != null && !beaches.isEmpty();
        System.out.println("Test 1 (Repository Load): " + (isListLoaded ? "PASSED ✅" : "FAILED ❌"));
    }
}