package command;

public interface IServer {
    void turnOff();
    void turnOn();
    void openConnection();
    void closeConnection();
    void verifyConnection();
    void startServices();
}

