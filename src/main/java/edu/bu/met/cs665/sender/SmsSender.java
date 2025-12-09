package edu.bu.met.cs665.sender;

/**
 * Concrete implementor for sending notifications via SMS.
 */
public class SmsSender implements MessageSender {

    @Override
    public void sendMessage(String content, String user) {
        System.out.println("[SMS] Sending to " + user + "...");
        System.out.println(content);
    }
}
