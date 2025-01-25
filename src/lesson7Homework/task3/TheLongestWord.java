package lesson7Homework.task3;

import java.io.BufferedReader;
import java.io.FileReader;


public class TheLongestWord {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\O M E N\\Downloads\\Telegram Desktop\\lug'at.txt"))) {

            StringBuilder stringBuilder = new StringBuilder();

            while (bufferedReader.ready()) {

                String aLong = isLong(bufferedReader.readLine());

                if (stringBuilder.length() < aLong.length()) {

                    stringBuilder.delete(0, stringBuilder.length());
                    stringBuilder.append(aLong);

                }


            }

            System.err.println("The long word -> " + stringBuilder);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static String isLong(String line) {

        String str = "null";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {

            stringBuilder.append(line.charAt(i));

            if (line.charAt(i) == ' ' || i == line.length() - 1) {
                if (str.length() < stringBuilder.length()) {
                    str = stringBuilder.toString();
                }
                if (line.charAt(i) == ' ') {
                    stringBuilder.delete(0, stringBuilder.length());
                }

            }

        }
        return str;
    }
}
