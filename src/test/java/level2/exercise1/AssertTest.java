package level2.exercise1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class AssertTest {
    @Test
    void isEqualTo_returnsTrue_whenTwoIntegersAreEqual(){
        int numero1 = 10;
        int numero2 = 10;
        assertThat(numero1).isEqualTo(numero2);
        System.out.println("The test passed: both values are equal");
    }

    @Test
    public void isNotEqualTo_returnsTrue_whenTwoDifferentIntegersAreCompared(){
        Integer day = 25;
        Integer day1 = 29;

        assertThat(day).isNotEqualTo(day1).
                withFailMessage("The test must pass, since the values are different");
        System.out.println("The test passed: both values are not equal");

    }
    @Test
    public void integerEqualityAssertion_passes_whenValuesAreEqual(){
        int summer = 10;
        int summer1 = 10;

        assertThat(summer).isEqualTo(summer1);
        System.out.println("The test passed: both values are equal");
    }
    @Test
    public void integerInequalityAssertion_passes_whenValuesAreNotEqual(){
        int winter = 56;
        int winter1 = 32;

        assertThat(winter).isNotEqualTo(winter1).
                withFailMessage("the test must fail, since they are different");
        System.out.println("The test passed: both values are not equal");

    }
}
