package com.andrew.bigOQustion;

public class Maximum_Product {

    public static void main(String[] args) {
        Maximum_Product mn = new Maximum_Product();
        int[] intArray = {10, 20, 30, 40, 50};
        String pairs = mn.maxProduct(intArray);
        System.out.println(pairs);
    }

    String maxProduct(int[] intArray) {
        int maxProduct = 0;
        String pairs = "";
        for (int i = 0; i<intArray.length; i++) {
            for(int j= i+1; j<intArray.length; j++) {
                if(intArray[i]*intArray[j] > maxProduct) {
                    maxProduct = intArray[i]*intArray[j];
                    pairs = Integer.toString(intArray[i])+ ", " + Integer.toString(intArray[j]);
                }
            }
        }
        return pairs;
    }

}
