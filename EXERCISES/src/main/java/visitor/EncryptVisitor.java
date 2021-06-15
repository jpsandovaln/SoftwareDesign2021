package visitor;

import java.util.Base64;

public class EncryptVisitor implements IVisitor{
    @Override
    public void visitVideoToImage(VideoToImage videoToImage) throws Exception {
        String nameBase64 = Base64.getEncoder().encodeToString(videoToImage.getVideoName().getBytes());
        String outputExtBase64 = Base64.getEncoder().encodeToString(videoToImage.getOutputExt().getBytes());
        videoToImage.setVideoName(nameBase64);
        videoToImage.setOutputExt(outputExtBase64);
    }

    @Override
    public void visitWordToPdf(WordToPdf wordToPdf) throws Exception {
        String nameBase64 = Base64.getEncoder().encodeToString(wordToPdf.getOutputName().getBytes());
        String binaryBase64 = Base64.getEncoder().encodeToString(wordToPdf.getBinary().getBytes());
        wordToPdf.setOutputName(nameBase64);
        wordToPdf.setBinary(binaryBase64);
    }
}
