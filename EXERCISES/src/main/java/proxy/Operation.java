package proxy;

public class Operation implements IOperation{
    private int value;

    public Operation(int value) {
        this.value = value;
    }

    @Override
    public void process() throws Exception {
        for (int i = 1; i <= 12; i++) {
            int result = i * value;
            System.out.println(" * " + i + " x " + value + " = " + result);
        }
    }
}
