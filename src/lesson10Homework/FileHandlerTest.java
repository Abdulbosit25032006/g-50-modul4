package lesson10Homework;

import java.io.IOException;
import java.util.logging.*;

public class FileHandlerTest extends StreamHandler {

    @Override
    public boolean isLoggable(LogRecord record) {
        return record.getLevel() == Level.WARNING;
    }

    @Override
    public synchronized void publish(LogRecord record) {

        if (isLoggable(record)) {
            String text = this.getFormatter().format(record);

            System.out.println(text);

        }

//        super.publish(record);
    }
}
