package lectures.lecture21_Logger;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyWebService {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(MyWebService.class.getName());
        logger.setLevel(Level.CONFIG);
        ConsoleHandler consoleHandler = new ConsoleHandler();

        logger.addHandler(consoleHandler);

        FileHandler fileHandler = new FileHandler("common.log");
        logger.addHandler(fileHandler);

        logger.info("Some informational message");
        logger.config("Configuration message");
        logger.warning("Warning message");
        logger.severe("Several message");

        logger.log(Level.INFO, "INFO_Message");



    }
}
