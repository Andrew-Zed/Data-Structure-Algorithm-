package com.andrew.recursion;

public class Greatest_Common_Divisor {

    public static void main(String[] args) {
        
        Greatest_Common_Divisor common_divisor = new Greatest_Common_Divisor();
        var result = common_divisor.gcd(14, 4);
        System.out.println(result);
    }

    //Greatest Common Divisor
    private int gcd(int a, int b) {
        if (a<0 || b<0) {
            return -1;
        }
        if(b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }

}

// gcd(8, 4)
// 8/4 = 2
