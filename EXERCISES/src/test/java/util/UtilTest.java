package util;

import org.junit.jupiter.api.Test;
import tdd.Util;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UtilTest {
    @Test
    public void getMaxValue() {
        List<Integer> numbers = List.of(5, 6, 8, 3, 9);
        int expected = 9;

        int result = Util.getMaxValue(numbers);

        assertEquals(expected, result);
    }

    @Test
    public  void testList() {
        List mockedList = mock(List.class);

        when(mockedList.get(0)).thenReturn("A");
        when(mockedList.get(1)).thenReturn(new Exception("exception position 1"));

        System.out.println(mockedList.get(0));
        System.out.println(mockedList.get(1));
        System.out.println(mockedList.get(2));
    }
}
