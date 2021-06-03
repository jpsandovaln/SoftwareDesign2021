package strategy;

import java.util.Scanner;

public class MaxNumber implements IOperation {
    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);

        System.out.println("add first number");
        int num1 = sc.nextInt();

        System.out.println("add second number");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " es mayor");
        } else {
            System.out.println(num2 + " es mayor");
        }
    }
}
