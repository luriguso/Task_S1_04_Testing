package level3.exercise1;

import level3.exercise1.classData.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void shouldReturnSum_whenAddingTwoNumbers(){
        Calculator calculator = new Calculator();

        Assertions.assertEquals(50, calculator.sum(20,30), "The sum of first and second should be 50");
    }

    @Test
    void shouldReturnDifference_whenSubtractingTwoNumbers(){
        Calculator calculator = new Calculator();

        Assertions.assertEquals(10, calculator.subtraction(20, 10), "The subtraction of first and second should be 10");
    }

    @Test
    void shouldReturnProduct_whenMultiplyingTwoNumbers(){
        Calculator calculator = new Calculator();

        Assertions.assertEquals(15, calculator.multiplication(5,3), "The multiplication of first and second should be 15");
    }

    @Test
    void shouldReturnQuotient_whenDividingTwoNumbers(){
        Calculator calculator = new Calculator();

        Assertions.assertEquals(2.5, calculator.division(10,4), "The division of first and second should be 2.5");

    }
}
