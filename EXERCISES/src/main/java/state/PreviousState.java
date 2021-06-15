package state;

public class PreviousState implements IPlayerState{
    @Override
    public void execute() {
        System.out.println("PREVIOUS...");
    }
}
