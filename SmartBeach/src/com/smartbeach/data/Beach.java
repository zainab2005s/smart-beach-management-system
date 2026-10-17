package com.smartbeach.data;
// يمثل هذا الكلاس بيانات الشاطئ مع محاكاة التحديث التلقائي للحالة بناء على الحساسات (IoT Simulation)
 
public class Beach {
    private String name;
    private String location;
    private int temperature; // درجات الحرارة (محاكاة لحساسات الطقس)
    private int visitorCount; // عدد الزوار (محاكاة لحساسات عداد الأشخاص)

    public Beach(String name, String location, int temperature, int visitorCount) {
        this.name = name;
        this.location = location;
        this.temperature = temperature;
        this.visitorCount = visitorCount;
    }

    // دالة تلقائية لتقدير وتحديث حالة الشاطئ بناء على البيانات الواردة من الحساسات
    public String getStatus() {
        if (visitorCount > 300) {
            return "Crowded (High Traffic)";
        } else if (temperature > 35) {
            return "Open / Very Sunny & Hot";
        } else {
            return "Open / Ideal Weather";
        }
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getVisitorCount() {
        return visitorCount;
    }
}