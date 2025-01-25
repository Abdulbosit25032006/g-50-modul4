package lesson6Homework.task7.taask8;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Time {
    public static void main(String[] args) {
        displayAllTimes();
    }

    public static void displayTimeInZone(ZoneId zoneId) {
        ZonedDateTime timeInZone = ZonedDateTime.now(zoneId);
        System.out.println(zoneId + ": " + timeInZone);
    }

    public static void displayAllTimes() {
        ZoneId africaAbidjan = ZoneId.of("Africa/Abidjan");
        ZoneId americaNewYork = ZoneId.of("America/New_York");
        ZoneId asiaTokyo = ZoneId.of("Asia/Tokyo");
        ZoneId europeLondon = ZoneId.of("Europe/London");

        displayTimeInZone(africaAbidjan);
        displayTimeInZone(americaNewYork);
        displayTimeInZone(asiaTokyo);
        displayTimeInZone(europeLondon);
    }




}
