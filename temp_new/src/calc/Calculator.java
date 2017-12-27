package calc;

import java.util.Scanner;

public class Calculator {
    double a, b, result;
    String operation;
    Scanner scanner = new Scanner(System.in);

    public String getOperation() {
        operation = scanner.next();
        return operation;
    }

    public double getA() {

        return a = scanner.nextDouble();
    }

    public double getB() {
        return b = scanner.nextDouble();
    }

    public void getResult() {
        switch (operation) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                if (b != 0)
                    System.out.println(a / b);
                 else {
                    System.out.println("EXEPTION!!!!");
                 }
                break;
            default:
                System.out.println("Plz enter correct operation!!!");

        }

    }
}
