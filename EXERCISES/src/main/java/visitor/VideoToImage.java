package visitor;

public class VideoToImage implements Asset {
    private String videoName;
    private String outputExt;

    public VideoToImage(String videoName, String outputExt) {
        this.videoName = videoName;
        this.outputExt = outputExt;
    }

    @Override
    public void convert() {
        System.out.println("converting video to image ...");
    }

    @Override
    public void accept(IVisitor visitor) throws Exception {
        visitor.visitVideoToImage(this);
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getOutputExt() {
        return outputExt;
    }

    public void setOutputExt(String outputExt) {
        this.outputExt = outputExt;
    }
}
