package command;

public class CbbaServer implements IServer{
    @Override
    public void turnOff() {
        System.out.println("turn off cbba server");
    }

    @Override
    public void turnOn() {
        System.out.println("turn on cbba server");
    }

    @Override
    public void openConnection() {
        System.out.println("open connection cbba server");
    }

    @Override
    public void closeConnection() {
        System.out.println("close connection cbba server");
    }

    @Override
    public void verifyConnection() {
        System.out.println("verify connection cbba server");
    }

    @Override
    public void startServices() {
        System.out.println("ostart service cbba server");
    }
}
