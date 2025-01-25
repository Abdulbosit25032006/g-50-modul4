package lesson6Homework.task2;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class TimeFormatComparison {
    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime = " + currentTime);

        LocalTime localTime = LocalTime.of(12, 0);
        System.out.println("localTime = " + localTime);


        Duration between = Duration.between(localTime, currentTime);

        long hours = Math.abs(between.toHours());
        System.out.println("hours = " + hours);

        long minutes = Math.abs(between.toMinutes() % 60);
        System.out.println("minutes = " + minutes);

        long seconds = Math.abs(between.getSeconds() % 60);
        System.out.println("seconds = " + seconds);

        System.out.printf("Time -> %d:%d:%d \n",hours,minutes,seconds);

        System.out.println("between = " + between);


    }
}
