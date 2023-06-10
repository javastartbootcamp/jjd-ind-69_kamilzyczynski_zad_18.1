package pl.javastart.euler2;

import java.util.ArrayList;

public class Euler2CalculateMethods {

    public ArrayList<Integer> getFibonacciSequenceBelow4Millions() {
        int firstNumber = 1;
        int nextNumber = 2;

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(firstNumber);
        numbers.add(nextNumber);
        while (firstNumber < 4000000) {
            int add = firstNumber + nextNumber;
            firstNumber = nextNumber;
            nextNumber = add;
            numbers.add(add);
        }
        return numbers;
    }
    public int calculateSumForArrayList(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}
