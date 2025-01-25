package lesson6Homework.task1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class TimeTest {
    public static void main(String[] args) {

        Date date = new Date();

        TimeMethod(date);

        System.out.println("--------------------------------------------------");

        LocalDate localDate = LocalDate.now();
        System.out.println(" LocalDate = " + localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(" LocalTime = " + localTime);


    }

    private static void TimeMethod(Date date) {
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat1.format(date);

        System.out.println("Date format = " + format);

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm:ss.S");
        String format1 = simpleDateFormat2.format(date);
        System.out.println("Time format = " + format1);
    }
}
