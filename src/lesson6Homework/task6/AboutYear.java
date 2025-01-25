package lesson6Homework.task6;

import java.time.LocalDate;
import java.time.Month;

public class AboutYear {

    public static void main(String[] args) {

        year();


    }

    private static void year() {

        LocalDate now = LocalDate.now();
        boolean leapYear = now.isLeapYear();
//        System.out.println("leapYear = " + leapYear);

        int dayOfMonth = now.getDayOfMonth();

        int dayOfYear = now.getDayOfYear();

        LocalDate localDate = LocalDate.of(2025, 1, 1);
        System.out.println("localDate = " + localDate);

        int counter = 0;
        while (localDate.getYear() < 2026) {
            counter++;
            localDate = localDate.plusDays(1);
        }


        System.out.printf("Joriy yil \n" +
                        "Kabisa yili -- %s \n" +
                        "oyning ------- %s kuni \n" +
                        "yilning ------ %s kuni \n" +
                        "yilda -------- %s kun bor",
                leapYear, dayOfMonth, dayOfYear, counter);

    }


}
