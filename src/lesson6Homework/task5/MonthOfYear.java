package lesson6Homework.task5;

import java.time.LocalDate;
import java.time.Month;

public class MonthOfYear {
    public static void main(String[] args) {



        LocalDate now = LocalDate.now();
        int year = now.getYear();
        Month month = now.getMonth();
        System.out.println("Current Month: " + month);
        System.out.println("Current Year: " + year);

        int counter = 0;

        while (now.getYear() < 2026) {
            counter++;
            now = now.plusMonths(1);
        }

        System.out.println("Counter of months : " + counter);

    }
}
