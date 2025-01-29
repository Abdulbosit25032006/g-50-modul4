package Imtihon.example1.task4;


import java.io.IOException;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLoggerTest {

    public static Logger logger = Logger.getLogger(MyLoggerTest.class.getName());

    public static void main(String[] args) throws IOException {

        MyFormatter myFormatter = new MyFormatter();
        FileHandler fileHandler = new FileHandler("io/fileLog.txt");

        logger.addHandler(fileHandler);

        fileHandler.setFormatter(myFormatter);

        fileHandler.setLevel(Level.SEVERE);

        logger.log(Level.WARNING, "This is message");

        exception();

        logger.log(Level.INFO,"this is not file");


        System.out.println(fileHandler);


    }

    private static void exception() {
        try {

            if (new Random().nextBoolean()) {
                throw new RuntimeException("exception");
            }
        } catch (Exception e) {

            logger.log(Level.SEVERE, e.getMessage(), e);
        }


    }


}
