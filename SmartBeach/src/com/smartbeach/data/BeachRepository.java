package com.smartbeach.data;

import java.util.ArrayList;
import java.util.List;

// كلاس مسؤول عن استرجاع بيانات الشواطئ مع دعم محاكاة الحساسات
public class BeachRepository {
    
    public List<Beach> getBeachesList() {
        List<Beach> beaches = new ArrayList<>();
        // تمرير البيانات: (الاسم، الموقع، درجة الحرارة، عدد الزوار الحالي من الحساسات)
        beaches.add(new Beach("Marassi Beach", "Diyar Al Muharraq", 36, 150));
        beaches.add(new Beach("Bilaj Al Jazayer", "Zallaq", 32, 350)); // هذا الشاطئ سيكون مزدحماً تلقائياً بناءً على الحساس
        beaches.add(new Beach("Al Jazayer Beach", "Zallaq", 30, 90));
        return beaches;
    }

    public Beach findBeachByName(String name) {
        for (Beach beach : getBeachesList()) {
            if (beach.getName().equalsIgnoreCase(name)) {
                return beach;
            }
        }
        return null;
    }
}