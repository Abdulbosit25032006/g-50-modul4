package lesson4Homework.task3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class execuroServiseScheduledThread {
    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);



        scheduledExecutorService.scheduleAtFixedRate(()-> System.out.println(new Date()),0,1, TimeUnit.SECONDS);




    }
}
