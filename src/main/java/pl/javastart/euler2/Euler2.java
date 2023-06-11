package pl.javastart.euler2;

public class Euler2 {

    public static void main(String[] args) {
        Euler2CalculateMethods calculator = new Euler2CalculateMethods();
        int sum = calculator.getSumForFibonacciSequenceBelowBound(4_000_000);
        System.out.println(sum);
    }
}
