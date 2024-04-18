package handler;

import request.Level;
import request.Message;

public class EmailLogger implements Handler {
    private Handler nextHandler;

    public EmailLogger(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Message msg) {
        if (msg.getLevel() == Level.ERROR)
            System.out.println("Sending email: " + msg);

        if (nextHandler != null) {
            nextHandler.handleRequest(msg);
        }
    }
}
