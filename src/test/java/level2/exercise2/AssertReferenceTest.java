package level2.exercise2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class AssertReferenceTest {
    @Test
    void assertReferenceTestEquality(){
        String name = "name";
        String name1 = "name";
        Assertions.assertThat(name).withFailMessage("The references do not point to the same object").isSameAs(name1);
    }
    @Test
    void asertReferenceTestNotEquality(){
        String text1 = new String("hello");
        String text2 = new String("hello");

        Assertions.assertThat(text1).withFailMessage("Expected different references")
                .isNotSameAs(text2);
    }
}
