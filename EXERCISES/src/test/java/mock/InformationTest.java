package mock;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class InformationTest {

    @Test
    void loadData() throws IOException {
        List<String> expected = Arrays.asList("a", "b", "c", "d", "1", "3", "5", "7", "8");

        DataBaseValue dataBaseValue = new DataBaseValue();
        Information info = new Information();
        info.setDataBaseValue(dataBaseValue);
        List<String> result = info.loadData();
        System.out.println(result);

        assertEquals(expected, result);
    }

    @Test
    void loadDataMock() throws IOException {
        DataBaseValue dataBaseValue = mock(DataBaseValue.class);
        when(dataBaseValue.getNumbers()).thenReturn(Arrays.asList("1", "2"));
        when(dataBaseValue.getWords()).thenReturn(Arrays.asList("x", "y"));

        List<String> expected = Arrays.asList("x", "y", "1", "2");

        Information info = new Information();
        info.setDataBaseValue(dataBaseValue);
        List<String> result = info.loadData();

        System.out.println(result);
        assertEquals(expected, result);
    }
}