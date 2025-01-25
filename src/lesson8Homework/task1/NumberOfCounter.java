package lesson8Homework.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOfCounter {

    public static void main(String[] args) {

        String str = "Hello123  123d;lvm";

        Pattern pattern = Pattern.compile("[0-9]");

        Matcher matcher = pattern.matcher(str);

        int numberCount = 0;

        while (matcher.find())
            numberCount++;


        System.out.println("numberCount = " + numberCount);
    }

}
