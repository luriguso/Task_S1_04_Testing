package level1.exercise2.classData;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DniCalculatorTest {
    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "29876543, A",
            "34567654, B",
            "12347654, N",
            "98765432, M",
            "76543786, Q",
            "65478976, T",
            "56743287, X",
            "65432897, J",
            "78654237, X"
    })


    void calculateLetter_returnsCorrectLetter_whenValidDniProvided(int dni, String expectedLetter) {
        DniCalculator dniCalculator = new DniCalculator(dni);
        String letter = dniCalculator.calculateLetter();
        assertEquals(expectedLetter, letter,
                "The calculated letter does not match the one expected for the ID: " + dni);
    }
}