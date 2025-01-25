package lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    public static void main(String[] args) {

//        Alfa();

//        number();

        String str = "sdjlhvl6531*- +*+*";

        Pattern pattern = Pattern.compile("[\\W+\\d]");

        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.print(matcher.group());
        }




    }

    private static void number() {
        String str = "sdjlhvl6531";

//        String string = str.replaceAll("\\[w&&[\\^d]]", "");
//        System.out.println(string);

        Pattern pattern = Pattern.compile("\\d");

        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.print(matcher.group());
        }
    }

    private static void Alfa() {
        String str = "sdjlhvl6531";

//        String string = str.replaceAll("\\[w&&[\\^d]]", "");
//        System.out.println(string);

        Pattern pattern = Pattern.compile("[a-zA-Z]");

        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.print(matcher.group());
        }
    }

}
