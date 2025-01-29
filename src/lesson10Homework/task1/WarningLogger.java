package lesson10Homework.task1;

import lesson10Homework.FileHandlerTest;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WarningLogger {

    public static Logger logger = Logger.getLogger(WarningLogger.class.getName());

    public static void main(String[] args) throws IOException {

        FileHandler fileHandler = new FileHandler("io/lesson9homework/warningLog.txt");

        fileHandler.setLevel(Level.WARNING);

        MyWarningFormat myWarningFormat = new MyWarningFormat();
        FileHandlerTest fileHandlerTest = new FileHandlerTest();

        fileHandler.setFormatter(myWarningFormat);

        logger.addHandler(fileHandler);
        logger.addHandler(fileHandlerTest);


        logger.log(Level.WARNING,"This homework");
//        logger.log(Level.SEVERE,"This is not file writing");
        logger.log(Level.INFO,"This izs info");




    }



}
