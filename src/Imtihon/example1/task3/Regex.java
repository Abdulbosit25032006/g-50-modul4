package Imtihon.example1.task3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\O M E N\\IdeaProjects\\g-50-modul4\\io");

        String fileSearcher = fileSearcher(file, "text.txt");

        if (fileSearcher != null) {

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileSearcher))) {

                while (bufferedReader.ready()) {

                    String string = bufferedReader.readLine();


                    Pattern pattern = Pattern.compile("\\d{2,}");

                    Matcher matcher = pattern.matcher(string);

                    while (matcher.find()) {

                        System.out.println("matcher.group() = " + matcher.group());
                    }

                }

            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

    }

    public static String fileSearcher(File file, String pathName) {

        if (file.isDirectory()) {

            File[] files = file.listFiles();

            if (files != null) {

                for (File file1 : files) {

                    if (file1.isDirectory()) {
                        String string = fileSearcher(file1, pathName);
                        if (string != null) {
                            return string;
                        }

                    }
                    if (file1.getName().equals(pathName)) {
                        return file1.getAbsolutePath();
                    }

                }
            }
        }
        return null;
    }
}
