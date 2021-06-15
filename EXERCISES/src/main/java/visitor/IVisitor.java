package visitor;

public interface IVisitor {
    void visitVideoToImage(VideoToImage videoToImage) throws Exception;
    void visitWordToPdf(WordToPdf wordToPdf) throws Exception;
}
