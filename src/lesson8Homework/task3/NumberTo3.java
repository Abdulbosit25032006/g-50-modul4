package lesson8Homework.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberTo3 {

    public static void main(String[] args) {

        String string = "asc123sdc351";

        Pattern pattern = Pattern.compile("\\d");

        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.print(matcher.group());
        }

    }
}
