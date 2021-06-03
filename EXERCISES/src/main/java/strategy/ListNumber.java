package strategy;

public class ListNumber implements IOperation {
    @Override
    public void process() {
        int num = 1;
        while (num <= 100) {
            System.out.println(num);
            num++;
        }
    }
}
