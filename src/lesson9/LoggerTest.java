package lesson9;

import java.io.IOException;
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

        Handler fileHandler = new FileHandler("io/logger/fileLog.txt",true);
        fileHandler.setFormatter(new SimpleFormatter());

        logger.addHandler(fileHandler);

        logger.log(Level.WARNING,"This info log test");

        logger.log(new LogRecord(Level.WARNING,"bu log record orqali yozildi"));
//nma gap
    }
}
