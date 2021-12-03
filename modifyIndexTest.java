import static org.junit.Assert.*;

import org.junit.jupiter.api.*;
public class modifyIndexTest {

    @Test
    void testAddTopic() {

   
    }

    @Test
    void testPrint() {
        modifyIndex test = new modifyIndex();
        assertTrue(test.toString() != null);    
    }

    @Test
    void testRemoveTopic() {
        modifyIndex test = new modifyIndex();
        test.addTopic();
        assertTrue(test.size() < 0);       
    }

    @Test
    void testSelectTopic() {
        
    }

    @Test
    void testSize() {
        
    }

    
}
