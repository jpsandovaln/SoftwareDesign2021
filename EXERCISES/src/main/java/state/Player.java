package state;

public class Player {
    public final static  String INIT_STATE = "init";
    public final static String PLAY_STATE = "play";
    public final static  String STOP_STATE = "stop";
    public final static String PAUSE_STATE = "pause";
    public final static String NEXT_STATE = "next..";
    public final static String PREVIOUS_STATE = "previous";

    private String currentState;

    private String trackTitle;
    private String filePath;

    public Player(String trackTitle, String filePath) {
        this.trackTitle = trackTitle;
        this.filePath = filePath;
        this.currentState = INIT_STATE;
    }

    public void setState(String state) {
        this.currentState = state;
    }

    public void execute() {
        if (INIT_STATE.equals(this.currentState)) {
            System.out.println("INIT");


        }

        if (PLAY_STATE.equals(this.currentState)) {
            System.out.println("playing");


        }

        if (STOP_STATE.equals(this.currentState)) {
            System.out.println("stopping");
        }

        if (PAUSE_STATE.equals(this.currentState)) {
            System.out.println("PAUSING");
        }

        if (NEXT_STATE.equals(this.currentState)) {
            System.out.println("next");
        }
        if (PREVIOUS_STATE.equals(this.currentState)) {
            System.out.println("previous");
        }
    }

}
