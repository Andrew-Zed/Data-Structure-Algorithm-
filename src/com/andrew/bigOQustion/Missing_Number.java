package com.andrew.bigOQustion;

public class Missing_Number {

    //Find the missing number in integer array

    public static void main(String[] args) {
        Missing_Number number = new Missing_Number();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        number.missingNumber(array);

    }

     void missingNumber(int[] intArray) {
        int sum1 = 0;
        int sum2 = 0;

         for (int i: intArray) {
             sum1 +=i;
         }
         sum2 = 20*(20+1)/2;
        int difference = sum2 - sum1;

         System.out.println("Missing Number is " + difference);

     }

}
