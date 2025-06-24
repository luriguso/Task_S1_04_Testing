package level2.exercise2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class AssertReferenceTest {
    @Test
    void isSameAs_returnsTrue_whenReferencesPointToSameObject(){
        String name = "name";
        String name1 = "name";
        Assertions.assertThat(name).withFailMessage("The references do not point to the same object").isSameAs(name1);
    }
    @Test
    void isNotSameAs_returnsTrue_whenReferencesPointToDifferentObjects(){
        String text1 = new String("hello");
        String text2 = new String("hello");

        Assertions.assertThat(text1).withFailMessage("Expected different references")
                .isNotSameAs(text2);
    }
}
