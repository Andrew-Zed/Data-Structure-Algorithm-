package com.andrew.recursion;

public class Fibonacci_Numbers {

    public static void main(String[] args) {

        Fibonacci_Numbers recursion = new Fibonacci_Numbers();
        var rec = recursion.fibonacci(5);
        System.out.println(rec);

    }

    //Writing Fibonacci Recursion
    protected int fibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        if(n==0 || n==1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

}
