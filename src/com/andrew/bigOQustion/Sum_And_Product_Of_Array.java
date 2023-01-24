package com.andrew.bigOQustion;

public class Sum_And_Product_Of_Array {

    public static void main(String[] args) {

        Sum_And_Product_Of_Array sumAndProductOfArray = new Sum_And_Product_Of_Array();
        int[] customArray = {1, 4, 5, 9, 7, 3};
        sumAndProductOfArray.spOfArray(customArray);

    }
    // Calculate the sum and product of elements in an array
    void spOfArray(int[] array) {
        int sum = 0;
        int product = 1;

        for (int i=0; i<array.length; i++) {
            sum +=array[i];
        }

        for (int i=0; i<array.length; i++) {
            product *=array[i];
        }

        System.out.println(sum + ", " +product);

    }

}
