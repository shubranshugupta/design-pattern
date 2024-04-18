package handler;

import request.Message;

public interface Handler {
    void handleRequest(Message request);
}
