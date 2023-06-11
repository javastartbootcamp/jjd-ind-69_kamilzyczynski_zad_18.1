package pl.javastart.euler2;

public class Euler2CalculateMethods {

    public int getSumForFibonacciSequenceBelowBound(int bound) {
        int firstNumber = 1;
        int nextNumber = 2;
        int sum = 2;

        while (firstNumber < bound) {
            int add = firstNumber + nextNumber;
            firstNumber = nextNumber;
            nextNumber = add;

            if (nextNumber % 2 == 0) {
                sum += nextNumber;
            }
        }
        return sum;
    }
}
