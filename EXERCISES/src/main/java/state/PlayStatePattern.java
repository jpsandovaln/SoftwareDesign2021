package state;

public class PlayStatePattern {
    private String trackTitle;
    private String filePath;
    private IPlayerState iPlayerState;

    public PlayStatePattern(String trackTitle, String filePath) {
        this.trackTitle = trackTitle;
        this.filePath = filePath;
        this.iPlayerState = new InitState();
    }

    public void setState(IPlayerState state) {
        this.iPlayerState = state;
    }

    public void execute() {
        this.iPlayerState.execute();
    }
}
