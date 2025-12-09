package edu.bu.met.cs665.sender;

/**
 * Implementor in the Bridge pattern.
 * Defines sending behavior for different delivery channels.
 */
public interface MessageSender {

    /**
     * Sends a formatted message to the specified user.
     *
     * @param content fully formatted notification content
     * @param user the user receiving the message
     */
    void sendMessage(String content, String user);
}
