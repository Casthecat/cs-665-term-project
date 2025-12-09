package edu.bu.met.cs665.sender;

/**
 * Concrete implementor for sending notifications via Email.
 */
public class EmailSender implements MessageSender {

    @Override
    public void sendMessage(String content, String user) {
        System.out.println("[Email] Sending to " + user + "...");
        System.out.println(content);
    }
}
