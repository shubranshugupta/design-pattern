import java.io.Serializable;

public class Logger implements Serializable, Cloneable {
    private static Logger logger;

    private Logger() {
        if (logger != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static Logger getInstance() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void log(String message) {
        System.out.println("Logging: " + message);
    }

    public void close() {
        logger = null;
    }

    protected Object readResolve() {
        return getInstance();
    }

    @Override
    protected Logger clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
