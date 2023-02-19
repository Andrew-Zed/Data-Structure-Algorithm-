package com.andrew.questions;

import java.util.Arrays;

class LeetCodeQs1365 {

    public static void main(String[] args) {
        int[] input = {8,1,2,2,3};
        // expected output = [4,0,1,1,3]
        LeetCodeQs1365 qs1365 = new LeetCodeQs1365();
        int[] result = qs1365.smallerNumbersThanCurrent(input);
        System.out.println(Arrays.toString(result));
    }

        public int[] smallerNumbersThanCurrent(int[] nums) {

            int[] counts = new int[101]; // the range of nums[i] is 0 <= nums[i] <= 100
            int[] result = new int[nums.length];

            // count the frequency of each element in nums
            for (int num : nums) {
                counts[num]++;
            }

            // calculate the running sum of the counts array
            for (int i = 1; i < counts.length; i++) {
                counts[i] += counts[i - 1];
            }

            // populate the result array by looking up the count of each element in counts
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    result[i] = counts[nums[i] - 1];
                }
            }

            return result;

        }
}
