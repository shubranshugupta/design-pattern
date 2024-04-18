import handler.*;
import request.*;

public class MainClass {
    public static void main(String[] args) throws Exception {
        Handler consoleLogger = new ConsoleLogger(
                new EmailLogger(
                        new FileLogger(null, "log.txt")));

        Message msg1 = new Message("This is an information message.", Level.INFO);
        Message msg2 = new Message("This is a debug message.", Level.DEBUG);
        Message msg3 = new Message("This is an error message.", Level.ERROR);

        consoleLogger.handleRequest(msg1);
        consoleLogger.handleRequest(msg2);
        consoleLogger.handleRequest(msg3);
    }
}
