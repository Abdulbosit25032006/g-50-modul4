package Imtihon.example1.task4;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class MyFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {

//        Instant instant = record.getInstant();
        LocalDate localDate = LocalDate.now();
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
//        String format = dateTimeFormatter.format(localDate);


        Level level = record.getLevel();

        String message = record.getMessage();

        Throwable thrown = record.getThrown();
        if (thrown!=null) {

            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            thrown.printStackTrace(printWriter);

            message = message + "\n" + stringWriter;

        }


        return "%s %s\n%s".formatted(
                localDate,
                level,
                message
        );
    }
}
