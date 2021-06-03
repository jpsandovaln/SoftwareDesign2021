package strategy;

public class EmptyOrNotNull implements IValidator{
    private String value;

    public EmptyOrNotNull(String value) {
        this.value = value;
    }
    @Override
    public boolean isValid() {
        if (this.value == null || this.value.isEmpty()) {
            return false;
        }
        return true;
    }
}
