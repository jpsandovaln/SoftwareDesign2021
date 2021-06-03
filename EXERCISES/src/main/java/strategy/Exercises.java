package strategy;

import java.util.Scanner;

public class Exercises {
    public void operations(String ope) {
        if ("list".equals(ope)) {
            int num = 1;
            while (num <= 100) {
                System.out.println(num);
                num++;
            }
        }
        if ("max".equals(ope)) {
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

        if ("fact".equals(ope)) {
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
    public void operations2(String ope) {
        OperationContext context = new OperationContext();
        if ("list".equals(ope)) {
           context.setOperation(new ListNumber());
        }
        if ("max".equals(ope)) {
            context.setOperation(new MaxNumber());
        }

        if ("fact".equals(ope)) {
            context.setOperation(new Factorial());
        }
        context.execute();
    }
}
