package mock;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class DataBaseValue {
    public List<String> getWords() throws IOException {
        Path path1 = Paths.get("src/main/resources/words.txt");
        String values1 = Files.readAllLines(path1).get(0);

        List<String> list1 = Arrays.asList(values1.split(","));
        return list1;
    }

    public List<String> getNumbers() throws IOException {
        Path path1 = Paths.get("src/main/resources/numbers.txt");
        String values1 = Files.readAllLines(path1).get(0);

        List<String> list1 = Arrays.asList(values1.split(","));
        return list1;
    }
}
