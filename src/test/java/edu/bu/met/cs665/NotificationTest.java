package edu.bu.met.cs665;

import edu.bu.met.cs665.notification.*;
import edu.bu.met.cs665.sender.*;
import edu.bu.met.cs665.formatter.*;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests the behavior of the Bridge + Strategy notification system.
 */
public class NotificationTest {

    @Test
    public void testWelcomeNotificationPlainEmail() {
        MessageSender sender = new EmailSender();
        MessageFormatter formatter = new PlainTextFormatter();
        Notification n = new WelcomeNotification(sender, formatter);

        // Should not throw any exceptions
        n.send("Alice");
    }

    @Test
    public void testPromotionNotificationHtmlSms() {
        MessageSender sender = new SmsSender();
        MessageFormatter formatter = new HtmlFormatter();
        Notification n = new PromotionNotification(sender, formatter);

        n.send("Bob"); // No exception means Bridge worked
    }

    @Test
    public void testSwitchSenderAndFormatter() {
        Notification n = new SummaryNotification(
                new EmailSender(), new PlainTextFormatter());

        // Switch at runtime
        n.setSender(new SmsSender());
        n.setFormatter(new HtmlFormatter());

        n.send("Charlie"); // Should still work
    }
}
