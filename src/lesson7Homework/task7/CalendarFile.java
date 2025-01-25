package lesson7Homework.task7;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class CalendarFile {
    public static void main(String[] args) {

        Calendar instance = Calendar.getInstance();
        Date time = instance.getTime();

        LocalDate now = LocalDate.now();
        Month month = now.getMonth();


        String fileName = "C:/Users/O M E N/Desktop/2025/" + month + "/" + now + ".txt";

        try (Writer writer = new FileWriter(fileName)) {

            writer.write(LocalDateTime.now().toString());


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
