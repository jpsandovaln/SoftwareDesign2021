package state;

public class PauseState implements IPlayerState{
    @Override
    public void execute() {
        System.out.println("Pausing");
    }
}
