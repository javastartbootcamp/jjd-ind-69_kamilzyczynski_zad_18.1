package pl.javastart.euler2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class Euler2CalculateMethodsTest {

    private Euler2CalculateMethods calculator = new Euler2CalculateMethods();
    ArrayList<Integer> list = calculator.getFibonacciSequenceBelow4Millions();

    @Test
    void shouldReturn4613732() {
        //when
        int sum = calculator.calculateSumForArrayList(list);

        //then
        Assertions.assertThat(sum).isEqualTo(4613732);
    }
    @Test
    void shouldLastElementOfSequenceBe9227435() {
        //when
        Integer lastNumber = list.get(list.size() - 1);

        //then
        Assertions.assertThat(lastNumber).isEqualTo(9227465);
    }

    @Test
    void shouldSizeOfSequenceBe34() {
        //when
        int size = list.size();

        //then
        Assertions.assertThat(size).isEqualTo(34);
    }
}