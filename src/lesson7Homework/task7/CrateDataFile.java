package lesson7Homework.task7;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.time.LocalDate;
import java.time.Month;

public class CrateDataFile {

    public static void main(String[] args) {

        String folderName = "C:/Users/O M E N/Desktop/2025";

        File file = new File(folderName);


        System.out.println("file.mkdir() = " + file.mkdir());


        LocalDate localDate = LocalDate.of(2025,1,1);

        while (localDate.getYear() == 2025) {

            String monthName = folderName + "/" + localDate.getMonth();
            File newFile = new File(monthName);
            System.out.println(newFile.mkdir());

            Month month = localDate.getMonth();
//            System.err.println(month);

            while (localDate.getMonth().equals(month)) {

                String dayName = monthName + "/" + localDate + ".txt";

                try (Writer writer = new FileWriter(dayName)) {

                    writer.write(localDate.toString());

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

                localDate = localDate.plusDays(1);
//                System.out.println(localDate);

            }
        }


    }
}
