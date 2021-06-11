package state;

public class InitState implements IPlayerState{
    @Override
    public void execute() {
        System.out.println("Init");
    }
}
