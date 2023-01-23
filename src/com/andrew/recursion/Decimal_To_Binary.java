package com.andrew.recursion;

public class Decimal_To_Binary {

    public static void main(String[] args) {
        Decimal_To_Binary main = new Decimal_To_Binary();
        var result = main.decimalToBinary(10);
        System.out.println(result);
    }

    // Decimal to Binary
    private int decimalToBinary(int n) {
        if (n==0){
            return 0;
        }
        return n%2 + 10*decimalToBinary(n/2);

    }

}
