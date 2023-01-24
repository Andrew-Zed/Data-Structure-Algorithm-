package com.andrew.bigOQustion;

import java.util.Arrays;

public class Pairs_Two_Sum {

    public static void main(String[] args) {
        Pairs_Two_Sum pairsTwoSum = new Pairs_Two_Sum();
        int[] intArray = {2,7,13,15};
        int[] result = pairsTwoSum.twoSum(intArray, 20);
        System.out.println(Arrays.toString(result));

    }

    // Two Sum
    int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j< nums.length; j++) {
                if(nums[i] +nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No Solution Found");
    }

}
