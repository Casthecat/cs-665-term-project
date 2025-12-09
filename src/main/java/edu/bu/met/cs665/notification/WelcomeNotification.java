package edu.bu.met.cs665.notification;

import edu.bu.met.cs665.sender.MessageSender;
import edu.bu.met.cs665.formatter.MessageFormatter;

/** Notification sent to welcome a new user. */
public class WelcomeNotification extends Notification {

    public WelcomeNotification(MessageSender sender, MessageFormatter formatter) {
        super(sender, formatter);
    }

    @Override
    protected String generateTitle() {
        return "Welcome!";
    }

    @Override
    protected String generateBody() {
        return "We are excited to have you join us. Enjoy your experience!";
    }
}
