package Imtihon.example1.task2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SingleThreadDays {

    public static void main(String[] args) {

        long begin = System.currentTimeMillis();

        LocalDate oldDate = LocalDate.of(1990, 1, 1);
        System.out.println("oldDate     = " + oldDate);

        LocalDate currentDate = LocalDate.now();
        System.out.println("currentDate = " + currentDate);

        LocalDate whileDate = oldDate;

        int leapYears = 0;
        int countDay = 0;

        while (whileDate.isBefore(currentDate) || whileDate.isEqual(currentDate)) {

            if (whileDate.getDayOfWeek() != DayOfWeek.SATURDAY && whileDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
                countDay++;
            }
            whileDate = whileDate.plusDays(1);

        }

        LocalDate leapYear = oldDate;

        while (leapYear.isBefore(currentDate) || leapYear.equals(currentDate)) {

            if (leapYear.isLeapYear())
                leapYears++;

            leapYear = leapYear.plusYears(1);

        }


        System.out.println("leapYears = " + leapYears);
        System.out.println("countDay = " + countDay);


        long end = System.currentTimeMillis();

        System.out.println(end - begin);

    }


}
