package prototype;

public interface IProduct extends Cloneable {
    void build();
    Object clone();
    Object deepClone();
}
