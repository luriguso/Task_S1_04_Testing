package level2.exercise6;

import level2.exercise6.classData.Student;
import level2.exercise6.classManagement.Classroom;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayIndexOutOfBoundsExceptionTest {

    @Test
    void ArrayIndexOutOfBoundsException(){
        Classroom classroom = new  Classroom();

        assertThrows(ArrayIndexOutOfBoundsException.class, classroom::triggerOutOfBounds, "Expected ArrayIndexOutOfBoundsException to be thrown");
    }
}
