package state;

public class StopState implements IPlayerState{
    @Override
    public void execute() {
        System.out.println("stopping...");
    }
}
