package calc;

public class Main {

    public static void main(String[] args) {

        //manual input from the console
        Calculator calculator = new Calculator();
        System.out.println("Plz enter value for a: ");
        calculator.getA();

        System.out.println("Plz enter operation ");
        calculator.getOperation();

        System.out.println("Plz enter value for b: ");
        calculator.getB();

        calculator.getResult();

        //manual input from the code

    }
}
