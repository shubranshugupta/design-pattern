package request;

public class Message {
    private String message;
    private Level level;

    public Message(String message, Level level) {
        this.message = message;
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return message;
    }
}
