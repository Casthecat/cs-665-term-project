package edu.bu.met.cs665.notification;

import edu.bu.met.cs665.sender.MessageSender;
import edu.bu.met.cs665.formatter.MessageFormatter;

/** Urgent notification alerting the user. */
public class AlertNotification extends Notification {

    public AlertNotification(MessageSender sender, MessageFormatter formatter) {
        super(sender, formatter);
    }

    @Override
    protected String generateTitle() {
        return "Important Alert";
    }

    @Override
    protected String generateBody() {
        return "Please review your account activity immediately.";
    }
}
