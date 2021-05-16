package generics;

public class Validation<T> implements IGeneric<T> {
    @Override
    public boolean validate(T value) {
        return value == null;
    }
}
