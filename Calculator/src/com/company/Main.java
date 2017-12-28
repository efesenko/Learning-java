package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code
        Calculator calculator = new Calculator();

        System.out.println(calculator.getSum(10,15) );
        System.out.println(calculator.getMinus(10,15) );
        System.out.println(calculator.getDivision(10,15) );
        System.out.println(calculator.getMultiplication(10,15) );

    }
}
