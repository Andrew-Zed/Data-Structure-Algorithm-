package com.andrew.recursion;

public class Power {
    public static void main(String[] args) {
        Power pow = new Power();
        var result = pow.power(4, -2);
        System.out.println(result);
    }

    // Using Recursion to calculate power
    // Note negative exponential was not taking into consideration
    private int power(int base, int exp) {
        if (exp<0){
            return -1;
        }
        if (exp==0 || exp==1) {
            return base;
        }
        return base * power(base, exp-1);
    }

}
