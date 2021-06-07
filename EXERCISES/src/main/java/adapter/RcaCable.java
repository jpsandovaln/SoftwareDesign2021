package adapter;

public class RcaCable implements ICable  {

    @Override
    public void transmitDataMultimedia() {
        this.video();
        this.audioR();
        this.audioL();
    }

    public void video() {
        System.out.println("send video");
    }

    public void audioR() {
        System.out.println("send audio right");
    }

    public void audioL() {
        System.out.println("send audio left");
    }
}
