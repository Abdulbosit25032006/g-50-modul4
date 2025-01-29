package lesson7Homework.task1;

import java.io.File;
import java.util.Objects;

public class SearchingFile {

    public static void main(String[] args) {


        String name = "java";
        File file = new File("C:");
        searchingFiles(file, name);


    }

    public static void searchingFiles(File file, String fileName) {

        if (file.isDirectory()) {

            for (File oneFile : Objects.requireNonNull(file.listFiles())) {
                if (equals(oneFile.getAbsoluteFile().getName(), fileName)) {
                    System.out.println(oneFile.getAbsoluteFile().getName());
                }
                if (file.isDirectory()) {
                    searchingFiles(oneFile, fileName);
                }
            }
        }


    }

    public static boolean equals(String currentFile, String searchingName) {

        if (currentFile.equals(searchingName)) {
            return true;
        }

        for (int i = 0; i < currentFile.length() - searchingName.length() + 1; i++) {
            String substring = currentFile.substring(i, i + searchingName.length());
            if (substring.equals(searchingName)) {
                return true;
            }
        }

        return false;
    }


}
