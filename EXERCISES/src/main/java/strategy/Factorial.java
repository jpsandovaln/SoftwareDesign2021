package strategy;

import java.util.Scanner;

public class Factorial implements IOperation{
    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        int num = 0;
        System.out.println("add number");
        num = sc.nextInt();

        for (int idx = 1; idx <= num; idx++) {
            fact *= idx;
        }
        System.out.println("result:" + fact);
    }
}
