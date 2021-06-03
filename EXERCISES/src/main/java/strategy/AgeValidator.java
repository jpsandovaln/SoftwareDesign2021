package strategy;

public class AgeValidator implements  IValidator{
    private int age;

    public AgeValidator(int age) {
        this.age = age;
    }
    @Override
    public boolean isValid() {
        if(this.age <= 0 || this.age >= 100) {
            return false;
        }
        return true;
    }
}
