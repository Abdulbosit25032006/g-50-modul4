package lesson6Homework.task3;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DefineAge {

    public static void main(String[] args) {


        // todo Foydalanuvchi tug'ilgan yili, oyi va kunini kiritganida
        // todo hozir necha yosh, oy va kunligini hisoblab chiqaradigan dastur tuzing.

        LocalDate currentDate = LocalDate.now();
        System.out.println("currentDate = " + currentDate);

        LocalDate localDate = LocalDate.of(2006, 3, 25);


        Period period = Period.between(localDate, currentDate);

        int years = period.getYears();

        int months = period.getMonths() % 12;

        int days = period.getDays();

        System.out.printf("Age -> %d yil %d oy %d kun\n",years,months,days);

        System.out.println("between = " + period);


    }

}
