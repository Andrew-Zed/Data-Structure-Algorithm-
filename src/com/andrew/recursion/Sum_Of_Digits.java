package com.andrew.recursion;

public class Sum_Of_Digits  {

    public static void main(String[] args) {

        Sum_Of_Digits sum_of_digits = new Sum_Of_Digits();
        var result = sum_of_digits.sumOfDigits(123);
        System.out.println(result);

    }

    private int sumOfDigits(int n) {

        if (n==0 || n < 0) {
            return 0;
        }

       return n%10 + sumOfDigits(n/10);

    }

}
