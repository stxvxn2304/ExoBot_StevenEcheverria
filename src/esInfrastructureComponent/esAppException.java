package esInfrastructureComponent;

import java.time.format.DateTimeFormatter;

public class esAppException extends Exception {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-");

}
