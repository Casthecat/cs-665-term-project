package edu.bu.met.cs665.formatter;

/**
 * Optional formatter using Markdown syntax.
 */
public class MarkdownFormatter implements MessageFormatter {

    @Override
    public String format(String title, String body) {
        return "# " + title + "\n\n" + body;
    }
}

