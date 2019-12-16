package modules;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {

    @Test
    public void cipherText() {
    }

    @Test
    public void getUserMessage_testGetUserMessage_String() {
        Encrypt testGetUserMessage = new Encrypt("elvin",3);
        assertEquals("elvin", testGetUserMessage.getUserMessage());

    }

    @Test
    public void getShiftKey_testGetShiftKey_int() {
        Encrypt testGetShiftKey = new Encrypt("elvin",3);
        assertEquals(3, testGetShiftKey.getShiftKey());
    }
}