package lesson6Homework.task4;

import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class SundayDate {

    public static void main(String[] args) {

        // Joriy sanadan oldingi va keyingi YAKSHANBA kunlarining sanasini
        // yyyy.mm.dd formatda chiqarib beradigan method tuzing va
        // bu methodni main() methodida chaqirib ishlating.

        date();



    }

    public static void date(){

        LocalDate currentDate = LocalDate.now();

        LocalDate oldSunday = currentDate.with(DayOfWeek.SUNDAY).minusWeeks(1);

        LocalDate nextSunday = currentDate.with(DayOfWeek.SUNDAY);
        System.out.println("nextSunday = " + nextSunday);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy.MM.dd");

        System.out.println("Old sunday: " + oldSunday.format(format));
        System.out.println("next sunday: " + nextSunday.format(format));


    }
}
