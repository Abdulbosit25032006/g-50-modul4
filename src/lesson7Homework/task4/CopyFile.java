package lesson7Homework.task4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class CopyFile {
    public static void main(String[] args) {

        try (
                Reader reader = new FileReader("io/text.txt");
                Writer writer = new FileWriter("io/copyClass.txt")
        ) {

            while (reader.ready()){
                int read = reader.read();
                System.out.println((char) read);
                writer.write(read);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
