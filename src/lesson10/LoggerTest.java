package lesson10;

import java.io.IOException;
import java.util.Random;
import java.util.logging.*;

public class LoggerTest {

//    static {
//        System.setProperty(
//                "java.util.logging.config.file",
//                "C:\\Program Files\\Java\\jdk-17\\conf\\logging.properties"
//        );
//    }

    public static Logger logger = Logger.getLogger(LoggerTest.class.getName());


    public static void main(String[] args) throws IOException {

        logger.setLevel(Level.INFO);

        Handler fileHandler = new FileHandler("io/fileLog.txt");

        TelegramHandler telegramHandler = new TelegramHandler();

//        SimpleFormatter formatter = new SimpleFormatter();
        MYLogFormatter formatter = new MYLogFormatter();

        fileHandler.setFormatter(formatter);

        logger.addHandler(fileHandler);

        logger.log(Level.WARNING, "This info log test");

//        logger.log(new LogRecord(Level.WARNING,"bu log record orqali yozildi"));

        logger.info("info ... ");

        logger.severe("severe ...");


        exception();

        logger.addHandler(telegramHandler);

    }

    private static void exception() {
        try {
            if (new Random().nextBoolean()) {
                throw new RuntimeException("exception");
            }
        } catch (RuntimeException e) {

            logger.log(Level.SEVERE, "exception", e);

            throw new RuntimeException(e);
        }

    }


}
