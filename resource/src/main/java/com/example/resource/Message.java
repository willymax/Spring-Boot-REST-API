package com.example.resource;

public class Message {
    private String theMessage;
    public Message(String theMessage) {
        this.theMessage = theMessage;
    }

    public String getTheMessage() {
        return theMessage;
    }

    @Override
    public String toString() {
        return "Message{" +
                "theMessage='" + theMessage + '\'' +
                '}';
    }
}
