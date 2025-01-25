package lesson9;

import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

public class TelegramHandler extends StreamHandler {

//    @Override
//    public boolean isLoggable(LogRecord record) {
////        return record.getLevel()
//    }

    @Override
    public synchronized void publish(LogRecord record) {
        super.publish(record);
    }
}
