package com.smartbeach.business;

import com.smartbeach.data.Beach;
import com.smartbeach.data.BeachRepository;
import java.util.List;
 //طبقة الأعمال (Business Logic Layer)
// تقوم بمعالجة طلبات عرض الشواطئ والتأكد من صحتها.
public class BeachService {
    private BeachRepository repository;

    public BeachService() {
        this.repository = new BeachRepository();
    }

    // دالة لجلب قائمة الشواطئ المتاحة للزوار
    public List<Beach> viewAvailableBeaches() {
        return repository.getBeachesList();
    }
   public Beach getBeachDetails(String name) {
        return repository.findBeachByName(name); 
}
}