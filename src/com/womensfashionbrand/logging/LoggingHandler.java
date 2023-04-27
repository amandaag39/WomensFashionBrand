import org.apache.log4j.Logger;

public class LoggingHandler {
    private static final Logger logger = Logger.getLogger(LoggingHandler.class);

    public void logSomething() {
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");
    }
}
