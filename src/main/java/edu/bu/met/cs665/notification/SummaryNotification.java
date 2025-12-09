package edu.bu.met.cs665.notification;

import edu.bu.met.cs665.sender.MessageSender;
import edu.bu.met.cs665.formatter.MessageFormatter;

/** Periodic summary update. */
public class SummaryNotification extends Notification {

    public SummaryNotification(MessageSender sender, MessageFormatter formatter) {
        super(sender, formatter);
    }

    @Override
    protected String generateTitle() {
        return "Your Weekly Summary";
    }

    @Override
    protected String generateBody() {
        return "Here is your activity summary for the week. Keep up the great work!";
    }
}
