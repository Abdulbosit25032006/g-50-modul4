package lesson8Homework.task4;

import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Separation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        String str = "apple is amazing and art is fun";

        String str = scanner.nextLine();

//        Matcher matcher = pattern.matcher(str);

        StringBuilder stringBuilder = new StringBuilder();
        StringJoiner stringJoiner = new StringJoiner(",");

        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1 || str.charAt(i) != ' ') {
                stringBuilder.append(str.charAt(i));
            }

            if (i == str.length() - 1 || str.charAt(i) == ' '){
                Pattern pattern = Pattern.compile("^a|A\\p{Lower}+");
                Matcher matcher = pattern.matcher(stringBuilder);

                while (matcher.find()) {
                    System.out.println("(^a\\\\p{Lower}+ ) -> " + matcher.group());
                    stringJoiner.add(stringBuilder);
                }
//                System.err.println("stringBuilder = " + stringBuilder);
                stringBuilder.delete(0, stringBuilder.length());
            }
        }


        System.out.println("result -> " + stringJoiner);


    }

}
