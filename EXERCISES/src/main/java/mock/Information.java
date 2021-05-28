package mock;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Information {
    private DataBaseValue dataBaseValue;

    public List<String> loadData() throws IOException {
        List<String> newList = Stream
                .concat(
                        dataBaseValue.getWords().stream(),
                        dataBaseValue.getNumbers().stream()
                )
                .collect(Collectors.toList());
        return newList;
    }

    public void setDataBaseValue(DataBaseValue dataBaseValue) {
        this.dataBaseValue = dataBaseValue;
    }
}
