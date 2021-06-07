package adapter;

public class HdmiToRcaAdapter implements ICable {
    @Override
    public void transmitDataMultimedia() {
        RcaCable rcaCable = new RcaCable();
        rcaCable.video();
        rcaCable.audioL();
        rcaCable.audioR();
    }
}
