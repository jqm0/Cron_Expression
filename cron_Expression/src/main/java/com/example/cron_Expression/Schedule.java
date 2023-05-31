package com.example.cron_Expression;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron =  "* 30 16 * 7,8 0-4")
    public void display(){
        System.out.println("Drink water");
    }


}
