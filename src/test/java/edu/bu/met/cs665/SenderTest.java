package edu.bu.met.cs665;

import edu.bu.met.cs665.sender.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class SenderTest {

    @Test
    public void testEmailSender() {
        MessageSender s = new EmailSender();
        s.sendMessage("test content", "user");
    }

    @Test
    public void testSmsSender() {
        MessageSender s = new SmsSender();
        s.sendMessage("hello", "user2");
    }

    @Test
    public void testPushSender() {
        MessageSender s = new PushSender();
        s.sendMessage("msg", "user3");
    }
}
