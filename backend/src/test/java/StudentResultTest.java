import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentResultTest {

    @Test
    void testPass() {
        StudentResult result = new StudentResult();

        assertEquals("Pass", result.getResult(75));
    }

    @Test
    void testFail() {
        StudentResult result = new StudentResult();

        assertEquals("Fail", result.getResult(40));
    }
}