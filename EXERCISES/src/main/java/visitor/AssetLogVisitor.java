package visitor;

public class AssetLogVisitor implements IVisitor {
    @Override
    public void visitVideoToImage(VideoToImage videoToImage) throws Exception {
        System.out.println("Log video to image");
        System.out.println("video name: " + videoToImage.getVideoName());
        System.out.println("output ext: " + videoToImage.getOutputExt());
    }

    @Override
    public void visitWordToPdf(WordToPdf wordToPdf) throws Exception {
        System.out.println("Log word to pdf");
        System.out.println("output name: " + wordToPdf.getOutputName());
        System.out.println("Binary: " + wordToPdf.getBinary());
    }
}
