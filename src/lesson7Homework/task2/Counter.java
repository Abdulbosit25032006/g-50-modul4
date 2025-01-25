package lesson7Homework.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Counter {
    public static void main(String[] args) {

        File file = new File("io/copyClass.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            int counter = 0;
            while (bufferedReader.readLine() != null) {
                counter++;
            }

            System.out.println(counter);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
