package handler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import request.Level;
import request.Message;

public class FileLogger implements Handler {
    private Handler nextHandler;
    private File file;

    public FileLogger(Handler nextHandler, String fileName) {
        this.nextHandler = nextHandler;
        this.file = new File(fileName);
    }

    @Override
    public void handleRequest(Message msg) {
        if (msg.getLevel() == Level.INFO) {
            System.out.println("Writing to file: " + msg);
            try (FileWriter writer = new FileWriter(file)) {
                writer.write(msg.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (nextHandler != null) {
            nextHandler.handleRequest(msg);
        }
    }
}
