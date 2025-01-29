package lesson10;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TgHandlerTest {

    public static Logger logger = Logger.getLogger(TgHandlerTest.class.getName());

    public static void main(String[] args) {

        TelegramHandler telegramHandler = new TelegramHandler();

        MYLogFormatter formatter = new MYLogFormatter();

        telegramHandler.setFormatter(formatter);
        logger.addHandler(telegramHandler);



        logger.info("This is and not sen telegram");

        exceptionTest();

    }

    private static void exceptionTest() {

        try {
            if (new Random().nextBoolean()) {
                throw new RuntimeException("massage");
            }
        } catch (Exception e) {

            logger.log(Level.SEVERE, e.getMessage(), e);

//            throw new RuntimeException(e);
        }

    }
}
