package state;

public class PlayState implements IPlayerState{
    @Override
    public void execute() {
        System.out.println("PLAYING..");
    }
}
