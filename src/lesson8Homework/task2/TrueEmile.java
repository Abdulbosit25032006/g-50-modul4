package lesson8Homework.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrueEmile {

    public static void main(String[] args) {

        String str = "Hello123@gmail.com";

        Pattern compile = Pattern.compile("\\w+@gmail.com$");

        Matcher matcher = compile.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }


    }
}
