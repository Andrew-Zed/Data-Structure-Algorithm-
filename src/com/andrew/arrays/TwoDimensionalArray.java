package com.andrew.arrays;

import java.util.Arrays;

public class TwoDimensionalArray {

    int[][] arr = null;

    // Constructor
    public TwoDimensionalArray(int numberOrRows, int numberOfColumns) {
        this.arr = new int[numberOrRows][numberOfColumns];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    // Inserting value in the Array
    void insertValueInTheArray(int row, int col, int value) {
        try{
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("The value is Successfully inserted in the 2D array");
            } else {
                System.out.println("This cell is already occupied");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index for 2D array");
        }

    }


    @Override
    public String toString() {
        return "TwoDimensionArray{" +
                "int2DArray=" + Arrays.deepToString(arr) +
                '}';
    }

}
