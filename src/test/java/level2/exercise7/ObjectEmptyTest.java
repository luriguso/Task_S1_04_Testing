package level2.exercise7;

import level2.exercise6.classManagement.Classroom;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class ObjectEmptyTest {
    @Test
    void objectIsEmpty(){
        Optional<String> emptyOptional = Optional.empty();

        Assertions.assertThat(emptyOptional).withFailMessage("The object is not empty").isEmpty();
    }
}
