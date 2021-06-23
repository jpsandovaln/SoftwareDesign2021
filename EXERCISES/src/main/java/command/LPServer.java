package command;

public class LPServer implements IServer {
    @Override
    public void turnOff() {
        System.out.println("turn off La paz server");
    }

    @Override
    public void turnOn() {
        System.out.println("turn on La paz server");
    }

    @Override
    public void openConnection() {
        System.out.println("open connection La paz server");
    }

    @Override
    public void closeConnection() {
        System.out.println("close connection La paz server");
    }

    @Override
    public void verifyConnection() {
        System.out.println("verify connection La paz server");
    }

    @Override
    public void startServices() {
        System.out.println("start service La paz server");
    }
}
