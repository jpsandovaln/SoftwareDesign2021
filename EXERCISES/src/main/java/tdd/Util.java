package tdd;

import java.util.List;

public class Util {
    /*public static int getMaxValue(List<Integer> numbers) {
        return 9;
    }*/

    /* public static int getMaxValue(List<Integer> numbers) {
        int maxValue = 0;
        for (int value : numbers) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }*/

    public static int getMaxValue(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(value -> value)
                .max()
                .orElseThrow();
    }
}
