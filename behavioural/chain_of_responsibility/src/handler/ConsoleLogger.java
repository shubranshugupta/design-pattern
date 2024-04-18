package handler;

import request.Level;
import request.Message;

public class ConsoleLogger implements Handler {
    private Handler nextHandler;

    public ConsoleLogger(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Message msg) {
        if (msg.getLevel() == Level.DEBUG)
            System.out.println("Writing to console: " + msg);

        if (nextHandler != null) {
            nextHandler.handleRequest(msg);
        }
    }
}
