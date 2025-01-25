package lesson8Homework.task5;

import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataFormatted {
    public static void main(String[] args) {

        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");

        String str = "Today's date is 22/01/2025, and tomorrow is 23-01-2025";


        Pattern compile = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");


        Matcher matcher = compile.matcher(str);

        while (matcher.find()) {
            stringJoiner.add(matcher.group());
        }

        Pattern compile2 = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");


        Matcher matcher2 = compile2.matcher(str);

        while (matcher2.find()) {
            stringJoiner.add(matcher2.group());
        }


        System.out.println("result -> " + stringJoiner);

    }
}
