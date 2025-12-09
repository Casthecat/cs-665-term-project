package edu.bu.met.cs665.sender;

/**
 * Concrete implementor for push notification delivery.
 */
public class PushSender implements MessageSender {

    @Override
    public void sendMessage(String content, String user) {
        System.out.println("[Push] Sending to " + user + "...");
        System.out.println(content);
    }
}
