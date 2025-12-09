package edu.bu.met.cs665.formatter;

/**
 * Formats messages into simple plain text.
 */
public class PlainTextFormatter implements MessageFormatter {

    @Override
    public String format(String title, String body) {
        return "Title: " + title + "\n" + "Body: " + body;
    }
}
