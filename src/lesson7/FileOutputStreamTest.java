package lesson7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream("src\\lesson6Homework\\task1\\TimeTest.java");
             FileOutputStream fileOutputStream = new FileOutputStream("io/copyClass.txt")
        ) {


            byte[] bytes = fileInputStream.readAllBytes();

            fileOutputStream.write(bytes);



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
