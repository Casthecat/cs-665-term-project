package edu.bu.met.cs665;

import edu.bu.met.cs665.formatter.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class FormatterTest {

    @Test
    public void testPlainTextFormatter() {
        MessageFormatter f = new PlainTextFormatter();
        String result = f.format("Hello", "World");

        assertTrue(result.contains("Title: Hello"));
        assertTrue(result.contains("Body: World"));
    }

    @Test
    public void testHtmlFormatter() {
        MessageFormatter f = new HtmlFormatter();
        String result = f.format("Header", "Body text");

        assertEquals("<h1>Header</h1><p>Body text</p>", result);
    }

    @Test
    public void testMarkdownFormatter() {
        MessageFormatter f = new MarkdownFormatter();
        String result = f.format("Header", "Body");

        assertTrue(result.startsWith("# Header"));
    }
}
