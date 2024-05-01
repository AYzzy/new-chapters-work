import junit.framework.TestCase;

public class ExerciseTest extends TestCase {

    public void testMethod() {
        int num1 = 0;
        int num2 = -7;
        int total  = 13;
        assertEquals(total,Exercise.method(num1,num2));
    }
}