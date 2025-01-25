package lesson6Homework.task7;

import java.time.LocalDate;
import java.time.Month;

public class AboutMonth {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();


        Month month = now.getMonth();

        int days = month.maxLength();

        int dayOfMonth = now.getDayOfMonth();

        int value = month.getValue();


        System.out.printf("Joriy oy: \n" +
                "oyning nomi ---- %s \n" +
                "davomiyligi ---- %s \n" +
                "oyning kuni ---- %s \n" +
                "tartib raqami -- %s \n" +
                "",month, days,dayOfMonth,value);


    }
}
