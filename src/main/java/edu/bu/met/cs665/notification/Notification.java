package edu.bu.met.cs665.notification;

import edu.bu.met.cs665.sender.MessageSender;
import edu.bu.met.cs665.formatter.MessageFormatter;

/**
 * Abstract representation of a notification.
 * Uses Bridge: combines Notification (abstraction) and MessageSender (implementor).
 * Uses Strategy: MessageFormatter determines formatting style.
 */
public abstract class Notification {

    protected MessageSender sender;
    protected MessageFormatter formatter;

    public Notification(MessageSender sender, MessageFormatter formatter) {
        this.sender = sender;
        this.formatter = formatter;
    }

    /**
     * Template of sending a notification.
     *
     * @param user recipient username
     */
    public void send(String user) {
        String title = generateTitle();
        String body = generateBody();
        String formatted = formatter.format(title, body);
        sender.sendMessage(formatted, user);
    }

    /** Generate notification title (implemented by subclasses). */
    protected abstract String generateTitle();

    /** Generate notification body (implemented by subclasses). */
    protected abstract String generateBody();

    /** Enable runtime switching of sender. */
    public void setSender(MessageSender sender) {
        this.sender = sender;
    }

    /** Enable runtime switching of formatter. */
    public void setFormatter(MessageFormatter formatter) {
        this.formatter = formatter;
    }
}

