package visitor;

public interface Asset {
    void convert();
    void accept(IVisitor visitor) throws Exception;
}
