package lesson7Homework.task6;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.SimpleFormatter;

public class Test {
    public static void main(String[] args) {
//
//        Calendar instance = Calendar.getInstance();
//        System.out.println(instance);
//
////        Date time = instance.getTime();
////        System.out.println(time);
////
////
////        long timeInMillis = instance.getTimeInMillis();
////        System.out.println(timeInMillis);
////
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM");
//        String format = simpleDateFormat.format(instance.getTime());
//        System.out.println(format);


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\O M E N\\Downloads\\Telegram Desktop\\lug'at.txt"));) {

            Map<String, String> dictionary = new HashMap<>();

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }

                //Ethic  —n. Set of moral principles (the quaker ethic). —adj. = *ethical. [greek: related to *ethos]
                //Ethical  adj. 1 relating to morals, esp. As concerning human conduct. 2 morally correct. 3 (of a drug etc.) Not advertised to the general public, and usu. Available only on prescription.  ethically adv.
                String key = null;
                String value = null;
                int endIndex = line.indexOf(" ");

                if (endIndex == -1) {
                    continue;
                }

                key = line.substring(0, endIndex);
                value = line.substring(endIndex + 1);

                dictionary.put(key, value);


            }

            System.out.println("Ethical-> " + dictionary.get("Ethical"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
