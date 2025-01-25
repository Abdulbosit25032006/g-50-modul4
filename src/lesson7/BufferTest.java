package lesson7;

import java.io.*;
import java.nio.Buffer;

public class BufferTest {
    public static void main(String[] args) throws Exception {


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\O M E N\\IdeaProjects\\g50-modul4\\io\\copyClass.txt"));
             BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\O M E N\\IdeaProjects\\g50-modul4\\io/text.txt"));
        ) {

            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());

            String str;
            while ((str = bufferedReader.readLine()) != null){
                System.out.println(str);
            }

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }


    }
}
