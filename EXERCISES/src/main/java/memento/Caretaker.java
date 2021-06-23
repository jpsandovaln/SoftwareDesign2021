package memento;

import java.util.HashMap;
import java.util.Map;

public class Caretaker {
    private Map<Integer, Memento> pcMap = new HashMap<>();

    public void addComputer(int key, Memento memento) {
        this.pcMap.put(key, memento);
    }

    public Memento getComputer(int key) {
        return this.pcMap.get(key);
    }
}
