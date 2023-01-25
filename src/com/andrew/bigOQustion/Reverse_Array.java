package com.andrew.bigOQustion;

import java.util.Arrays;

public class Reverse_Array {

    public static void main(String[] args) {
        Reverse_Array reverseArray = new Reverse_Array();
        int[] customArray = {1, 2, 3, 4, 5, 6, 7, 8};
        reverseArray.reverse(customArray);

    }

    //method to reverse an array using iterative approach.
    void reverse(int[] array) {
      for (int i=0; i<array.length/2; i++){
          int other = array.length-i - 1;
          int temp = array[i];
          array[i] = array[other];
          array[other] = temp;
      }
        System.out.println(Arrays.toString(array));
    }

}
