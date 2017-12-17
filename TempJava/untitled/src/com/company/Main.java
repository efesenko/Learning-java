package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = new int[10];
        try{
        System.out.println(arr[9001]);
    }
        catch (Exeption) {
            System.out.println("The issue is defined!");
        }
    }
}
