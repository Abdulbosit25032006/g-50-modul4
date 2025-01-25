package lesson6Homework.task9;

import java.time.LocalTime;
import java.time.ZonedDateTime;

public class TimeZone {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();

        ZonedDateTime now1 = ZonedDateTime.now();
        System.out.println("now1 = " + now1);


    }
}
