package modules;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {

    @Test
    public void decrypt() {

    }

    @Test
    public void getUserMessage_getUserMessage_String() {
        Decrypt testUserMessage = new Decrypt("elvin",4);
        assertEquals("elvin",testUserMessage.getUserMessage());


    }

    @Test
    public void getShiftKey_saveShiftKey_int() {
        Decrypt testShiftKey = new Decrypt("elvin",3);
        assertEquals(3, testShiftKey.getShiftKey());
    }
}