package lesson7Homework.task3;

import java.io.*;

public class TheLongestWordSingle {

    public static void main(String[] args) {



        try (InputStream inputStream = new FileInputStream("io/text.txt")) {

            byte[] bytes = inputStream.readAllBytes();
            String string = new String(bytes);

            System.out.println(isLong(string));

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static String isLong(String str) {
        String longestWord = "";
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar == '\n' || currentChar == ' ') {
                if (builder.length() > longestWord.length()) {
                    longestWord = builder.toString();
                }

            } else {
                builder.append(currentChar);
            }
        }

        if (builder.length() > longestWord.length()) {
            longestWord = builder.toString();
        }

        System.out.println(builder);

        return longestWord;
    }
}
