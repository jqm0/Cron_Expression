package com.example.cron_Expression;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron =  "0 30 23 13 * 5")
    public void display(){
        System.out.println("Drink water");
    }

}
