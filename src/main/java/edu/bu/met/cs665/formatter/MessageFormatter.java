package edu.bu.met.cs665.formatter;

/**
 * Strategy interface for formatting notification messages.
 * Different formatting strategies implement this interface.
 */
public interface MessageFormatter {

    /**
     * Formats a title and body into a single content string.
     *
     * @param title notification title
     * @param body notification body
     * @return formatted content
     */
    String format(String title, String body);
}
