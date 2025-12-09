package edu.bu.met.cs665.demo;

import edu.bu.met.cs665.notification.*;
import edu.bu.met.cs665.sender.*;
import edu.bu.met.cs665.formatter.*;

/**
 * Demonstrates the Notification System using Bridge + Strategy patterns.
 */
public class DemoMain {

    public static void main(String[] args) {

        // 1. Welcome notification sent via Email in plain text
        Notification welcome = new WelcomeNotification(
                new EmailSender(),
                new PlainTextFormatter());
        welcome.send("Alice");

        System.out.println("-------------------------------");

        // 2. Promotion notification sent via SMS in HTML format
        Notification promo = new PromotionNotification(
                new SmsSender(),
                new HtmlFormatter());
        promo.send("Bob");

        System.out.println("-------------------------------");

        // 3. Alert notification sent via Push with Markdown
        Notification alert = new AlertNotification(
                new PushSender(),
                new MarkdownFormatter());
        alert.send("Charlie");

        System.out.println("-------------------------------");

        // 4. Dynamically switching sender & formatter at runtime
        Notification summary = new SummaryNotification(
                new EmailSender(),
                new PlainTextFormatter());
        summary.send("Diana");

        System.out.println(">> Switching to SMS + HTML formatter...");
        summary.setSender(new SmsSender());
        summary.setFormatter(new HtmlFormatter());
        summary.send("Diana");
    }
}
