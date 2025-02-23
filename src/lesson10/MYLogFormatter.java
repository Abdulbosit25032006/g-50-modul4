package lesson10;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class MYLogFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {

        Instant instant = record.getInstant();

        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy'T'HH:mm:ss");

        String format = formatter.format(localDateTime);

        String className = record.getSourceClassName();

        long longThreadID = record.getLongThreadID();

        Level level = record.getLevel();

        String message = record.getMessage();

        Throwable thrown = record.getThrown();

        if (thrown != null) {
            StringWriter stringWriter = new StringWriter();

            PrintWriter printWriter = new PrintWriter(stringWriter);

            thrown.printStackTrace(printWriter);

            message = message + "\n" + stringWriter;

        }


        return "-> %s %s %s%n%s: %s%n".formatted(
                format,
                className,
                longThreadID,
                level,
                message
        );
    }
}
