package visitor;

public class AssetValidatorVisitor implements IVisitor{
    @Override
    public void visitVideoToImage(VideoToImage videoToImage) throws Exception {
        if (null == videoToImage.getVideoName() || videoToImage.getVideoName().isEmpty()) {
            throw new Exception("Invalid video name");
        }
        if (null == videoToImage.getOutputExt() || videoToImage.getOutputExt().isEmpty()) {
            throw new Exception("Invalid output ext");
        }
    }

    @Override
    public void visitWordToPdf(WordToPdf wordToPdf) throws Exception {
        if (null == wordToPdf.getOutputName() || wordToPdf.getOutputName().isEmpty()) {
            throw new Exception("Invalid output name");
        }
        if (null == wordToPdf.getBinary() || wordToPdf.getBinary().isEmpty()) {
            throw new Exception("Invalid binary");
        }
    }
}
