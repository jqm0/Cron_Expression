package com.example.cron_Expression;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    // Weekdays
    @Scheduled(cron =  "*/5 * * * 1-5")
    public void display(){
        System.out.println("Drink water");
    }
    // Weekends
    @Scheduled(cron =  "*/15 * * * 6-7")
    public void displayforWeekends(){
        System.out.println("Drink water");
    }
}
