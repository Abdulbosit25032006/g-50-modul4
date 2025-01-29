package lesson10Homework.task1;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class MyWarningFormat extends Formatter {
    @Override
    public String format(LogRecord record) {

        Instant instant = record.getInstant();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String formatter = dateTimeFormatter.format(localDateTime);

        Level level = record.getLevel();

        String message = record.getMessage();

//        Throwable thrown = record.get();

//        if (level == Level.WARNING){
//
//            StringWriter stringWriter = new StringWriter();
//            PrintWriter printWriter = new PrintWriter(stringWriter);
//            .printStackTrace(printWriter);
//
//            message = message + "\n" + stringWriter;
//        }


        return "%s\n%s %s\n".formatted(
                formatter,
                level,
                message
        );
    }
}
