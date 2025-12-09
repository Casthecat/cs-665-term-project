package edu.bu.met.cs665.notification;

import edu.bu.met.cs665.sender.MessageSender;
import edu.bu.met.cs665.formatter.MessageFormatter;

/** Notification sent for promotion or discount events. */
public class PromotionNotification extends Notification {

    public PromotionNotification(MessageSender sender, MessageFormatter formatter) {
        super(sender, formatter);
    }

    @Override
    protected String generateTitle() {
        return "Special Promotion Just for You";
    }

    @Override
    protected String generateBody() {
        return "Enjoy 25% off on selected items! Limited time only.";
    }
}
