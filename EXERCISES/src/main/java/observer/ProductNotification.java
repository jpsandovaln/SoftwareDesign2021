package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductNotification implements IObservableProductNotification{
    private Map<String, List<IClient>> clientMap;

    public ProductNotification() {
        this.clientMap = new HashMap<>();
        this.clientMap.put("car", new ArrayList<>());
        this.clientMap.put("pc", new ArrayList<>());
    }

    @Override
    public void notifyAllClients(String product, String message) {
        var clientList = this.clientMap.get(product);
        clientList.stream().forEach(client -> client.sendMessage(message));
    }

    @Override
    public void addObserverClient(String product, IClient client) {
        var clientList = this.clientMap.get(product);
        clientList.add(client);
    }

    @Override
    public void removeObserverClient(String product, IClient client) {
        var clientList = this.clientMap.get(product);
        clientList.remove(client);
    }
}
