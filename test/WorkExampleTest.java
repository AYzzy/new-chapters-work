import fresh.WordReverser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WorkExampleTest {
    @Test
    public void testMultipleWords() {
        String input = "it is a beautiful world";
        String expectedOutput = "world beautiful a is it";
        assertEquals(expectedOutput, WordReverser.revereWords(input));
    }
}
