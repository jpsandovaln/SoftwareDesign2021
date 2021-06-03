package strategy;

public class OperationContext {
    private IOperation operation;

    public OperationContext() {}

    public void setOperation(IOperation operation) {
        this.operation = operation;
    }

    public void execute() {
        this.operation.process();
    }
}
