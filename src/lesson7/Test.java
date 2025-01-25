package lesson7;

import java.io.File;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\O M E N\\IdeaProjects\\g50-modul4");
        showAllInnerFiles(file);

    }

    public static void showAllInnerFiles(File file) {

        File[] files = file.listFiles();
        for (File oneFile : files) {

            if (Objects.equals(oneFile.getName(), "ImtihonJavoblari.txt")) {
//            if (Objects.equals(oneFile.getName(), "lesson1")) {
                System.out.println(oneFile.getAbsoluteFile());
                return;
            }
            if (oneFile.isDirectory()) {

                showAllInnerFiles(oneFile);
            }


        }


    }
}
