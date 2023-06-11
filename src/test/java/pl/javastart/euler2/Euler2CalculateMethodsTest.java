package pl.javastart.euler2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Euler2CalculateMethodsTest {

    @ParameterizedTest
    @CsvSource(value = {"4000000, 4613732", "10, 10", "34, 44"})
    void shouldReturnSumForSequenceBelowBound(int bound, int sum) {
        //given
        Euler2CalculateMethods calculator = new Euler2CalculateMethods();

        //when
        int result = calculator.getSumForFibonacciSequenceBelowBound(bound);

        //then
        Assertions.assertThat(result).isEqualTo(sum);
    }
}