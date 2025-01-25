package lesson9;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MYLogFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {

        Instant instant = record.getInstant();

        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy'T'HH:mm:ss");

        String format = formatter.format(localDateTime);



        return "";
    }
}
