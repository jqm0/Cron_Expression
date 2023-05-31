package com.example.cron_Expression;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron =  "0 */5 * * 1-5 *")
    // Weekdays

    public void display(){
        System.out.println("Drink water");
    }
    @Scheduled(cron =  "0 */15 * * 6-7 *")
    // Weekends
    public void display2(){
        System.out.println("Drink water");
    }
}
