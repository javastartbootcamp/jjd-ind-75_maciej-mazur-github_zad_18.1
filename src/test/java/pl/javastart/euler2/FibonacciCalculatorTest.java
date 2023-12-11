package pl.javastart.euler2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/*
W treści zadania wspomniane było, by napisać co najmniej 3 testy, uznałem jednak, że konstrukcja poniższego testu
zapewnia sprawdzenie nawet większej ilości scenariuszy przy jednoczesnej niedużej ilości kodu.
 */
class FibonacciCalculatorTest {
    @ParameterizedTest(name = "Limit {0}, expected sum {1}")
    @CsvSource({"1, 0", "2, 2", "10, 10", "34, 44"})
    void shouldBeEqualToGivenNumberForGivenLimit(int limit, int expectedSum) {
        //given
        FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();

        //when
        int result = fibonacciCalculator.sumEvenFibonacciNumbers(limit);

        //then
        assertThat(result).isEqualTo(expectedSum);
        assertEquals(0, result % 2);
    }

}