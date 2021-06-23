package command;

public class EndCbbaServer implements Command{
    private IServer server;

    public EndCbbaServer(IServer server) {
        this.server = server;
    }
    @Override
    public void execute() {
        this.server.openConnection();
        this.server.turnOff();
        this.server.closeConnection();
    }
}
