package com.hello;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 5;
        printX(a++);
        System.out.println(a);
    }

    public static void printX(int x){
        System.out.println(x);
    }
}
