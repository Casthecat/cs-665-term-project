package edu.bu.met.cs665.formatter;

/**
 * Formats messages using basic HTML tags.
 */
public class HtmlFormatter implements MessageFormatter {

    @Override
    public String format(String title, String body) {
        return "<h1>" + title + "</h1>" + "<p>" + body + "</p>";
    }
}

