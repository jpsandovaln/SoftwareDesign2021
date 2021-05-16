package generics;

public class GenericObject<T> {
    private T val;

    public GenericObject(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

}
