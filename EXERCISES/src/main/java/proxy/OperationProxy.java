package proxy;

import java.util.Scanner;

public class OperationProxy implements IOperation {
    private int value;
    private IOperation operation;

    public OperationProxy(int value) {
        this.value = value;
        this.operation = new Operation(value);
    }

    @Override
    public void process() throws Exception {
        Scanner data = new Scanner(System.in);
        System.out.println("User:");
        String user = data.next();
        System.out.println("Pass:");
        String pass = data.next();

        if(!"admin".equals(user) || !"123".equals(pass)) {
            throw new Exception("Invalid user");
        }

        this.operation.process();

    }
}
