package pl.javastart.euler2;

public class Euler2 {

    public static void main(String[] args) {
        FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
        System.out.println(fibonacciCalculator.sumEvenFibonacciNumbers(4000000 - 1));
    }
}
