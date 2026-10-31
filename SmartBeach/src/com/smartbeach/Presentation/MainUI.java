package com.smartbeach.Presentation;

import com.smartbeach.business.BeachService;
import com.smartbeach.data.Beach;
import java.util.List;
import java.util.Scanner;

 //طبقة العرض (Presentation Layer)
public class MainUI {
    public static void main(String[] args) {
        BeachService beachService = new BeachService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("   Smart Beach Management System - UC-3   ");
        System.out.println("   (IoT Sensors & Auto-Status Integration)");
        System.out.println("==========================================\n");

        // 1. عرض جميع الشواطئ مع حالتها التلقائية
        System.out.println("--- Live Beaches Status (IoT Data) ---");
        List<Beach> beaches = beachService.viewAvailableBeaches();

        int index = 1;
        for (Beach b : beaches) {
            System.out.println(index + ". Beach Name    : " + b.getName());
            System.out.println("   Location      : " + b.getLocation());
            System.out.println("   Temp/Visitors : " + b.getTemperature() + " C | " + b.getVisitorCount() + " visitors");
            System.out.println("   Auto-Status   : " + b.getStatus());
            System.out.println("------------------------------------------");
            index++;
        }

        // 2. البحث عن شاطئ محدد
        System.out.println("\n--- Search & Check Specific Beach ---");
        System.out.print("Enter the beach name you want to check: ");
        String searchName = scanner.nextLine();

        Beach foundBeach = beachService.getBeachDetails(searchName);

        System.out.println("\n------------------------------------------");
        if (foundBeach != null) {
            System.out.println(" Beach Found Successfully!");
            System.out.println(" Name             : " + foundBeach.getName());
            System.out.println(" Location         : " + foundBeach.getLocation());
            System.out.println(" Temperature      : " + foundBeach.getTemperature() + " C");
            System.out.println(" Current Visitors : " + foundBeach.getVisitorCount());
            System.out.println(" Live Status      : " + foundBeach.getStatus());
        } else {
            System.out.println(" Sorry, the beach '" + searchName + "' was not found.");
        }
        System.out.println("------------------------------------------");

        scanner.close();
    }
}