import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentResultTest {

    @Test
    void testGradeA() {
        StudentResult result = new StudentResult();

        assertEquals("A", result.getGrade(75));
    }

    @Test
    void testGradeB() {
        StudentResult result = new StudentResult();

        assertEquals("B", result.getGrade(65));
    }

   @Test
   void testGradeC() {
        StudentResult result = new StudentResult();

        assertEquals("C", result.getGrade(55));
    }
  
   @Test
    void testGradeF() {
        StudentResult result = new StudentResult();

        assertEquals("F", result.getGrade(40));
    }

  }