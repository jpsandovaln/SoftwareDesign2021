package command;

public class StartCbbaServer implements Command{
    private IServer server;

    public StartCbbaServer(IServer server) {
        this.server = server;
    }
    @Override
    public void execute() {
        this.server.openConnection();
        this.server.verifyConnection();
        this.server.turnOn();
        this.server.startServices();
        this.server.closeConnection();
    }
}
