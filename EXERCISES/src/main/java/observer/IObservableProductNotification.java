package observer;

public interface IObservableProductNotification {
    void notifyAllClients(String product, String message);
    void addObserverClient(String product, IClient client);
    void removeObserverClient(String product, IClient client);
}
