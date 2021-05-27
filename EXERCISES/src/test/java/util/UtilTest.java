package util;

import org.junit.jupiter.api.Test;
import tdd.Util;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilTest {
    @Test
    public void getMaxValue() {
        List<Integer> numbers = List.of(5, 6, 8, 3, 9);
        int expected = 9;

        int result = Util.getMaxValue(numbers);

        assertEquals(expected, result);
    }
}
