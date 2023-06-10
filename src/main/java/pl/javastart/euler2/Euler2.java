package pl.javastart.euler2;

import java.util.ArrayList;

public class Euler2 {

    public static void main(String[] args) {
        Euler2CalculateMethods calculator = new Euler2CalculateMethods();
        ArrayList<Integer> fibonacciSequence = calculator.getFibonacciSequenceBelow4Millions();
        int sum = calculator.calculateSumForArrayList(fibonacciSequence);
        System.out.println(sum);
    }
}
