package lesson7Homework.task6;

import java.io.*;

public class SearchingWord {
    public static void main(String[] args) {

        try (
                Reader reader = new FileReader("C:\\Users\\O M E N\\Downloads\\Telegram Desktop\\lug'at.txt");
                Writer writer = new FileWriter("C:\\Users\\O M E N\\Downloads\\Telegram Desktop\\copyLug'at.txt")
        ) {

//            while (reader.ready()){
//                writer.write(reader.read());
//            }

            boolean found = true;

            String str = "anonymous";
            StringBuilder stringBuilder = new StringBuilder();
            int c;

            while ((c = reader.read()) != -1) {

                stringBuilder.append((char) c);


                if (stringBuilder.length() == str.length()) {

                    if (str.contentEquals(stringBuilder)) {

                        System.err.println("siz izlagan soz topildi : << " +stringBuilder+ " >>");
                        found = false;
                        break;
                    }

                    stringBuilder.deleteCharAt(0);
                }


            }

            if (found) {
                System.err.println("siz izlagan soz topilmadi");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}
