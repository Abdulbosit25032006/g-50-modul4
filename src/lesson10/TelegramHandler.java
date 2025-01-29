package lesson10;

import java.io.IOException;
import java.util.logging.*;

public class TelegramHandler extends StreamHandler {

    @Override
    public boolean isLoggable(LogRecord record) {
        return record.getLevel() == Level.SEVERE;
    }

    @Override
    public synchronized void publish(LogRecord record) {


        String text = this.getFormatter().format(record);

        System.out.println("bunit telegramga jonatish kerak " + text);


    }


}
