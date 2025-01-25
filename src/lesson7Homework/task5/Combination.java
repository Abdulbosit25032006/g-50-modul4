package lesson7Homework.task5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Combination {
    public static void main(String[] args) {

        try (
                Reader oldReader = new FileReader("io/oldFile.txt");
                Reader endReader = new FileReader("io/newFile.txt");
                Writer writer = new FileWriter("io/newCopyFile.txt")
                ){

            while (oldReader.ready()){
                writer.write(oldReader.read());
            }

            while (endReader.ready()){
                writer.write(endReader.read());
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
