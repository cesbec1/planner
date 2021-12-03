import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeAll;
public class IndexMenuTest {
    @BeforeAll
    void displayMenu() {
        modifyIndex test = new modifyIndex();
        test.addTopic();
    }
    
}
