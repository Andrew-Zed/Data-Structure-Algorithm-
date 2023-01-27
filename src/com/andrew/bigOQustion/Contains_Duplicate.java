package com.andrew.bigOQustion;

public class Contains_Duplicate {

    public static void main(String[] args) {
        Contains_Duplicate duplicate = new Contains_Duplicate();
        int[] intArray = {1,2,6,4,5,6};
        boolean result = duplicate.isUnique(intArray);
        System.out.println(result);
    }

    // Is Unique
    boolean isUnique(int[] intArray) {
        for (int i=0; i<intArray.length; i++) {
            for (int j=i+1; j<intArray.length; j++) {
                if(intArray[i] == intArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
