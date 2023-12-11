package pl.javastart.euler2;

import java.util.ArrayList;
import java.util.List;

public class FibonacciCalculator {
    public int sumEvenFibonacciNumbers(int limit) {
        return generateFibonacciSequence(limit).stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, Integer::sum);
    }

    private List<Integer> generateFibonacciSequence(int limit) {
        List<Integer> list = new ArrayList<>();
        int x = 0;
        int y = 1;

        while (x <= limit) {
            list.add(x);
            int temp = x + y;
            x = y;
            y = temp;
        }

        return list;
    }
}
