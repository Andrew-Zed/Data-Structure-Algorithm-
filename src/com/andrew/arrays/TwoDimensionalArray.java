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

    // Accessing cell value from a given array
     void accessCell(int row, int col) {
         System.out.println("\nAccessing Row# " + row + ", Col# " + col);
          try {
              System.out.println("Cell value is " + arr[row][col]);
          } catch (ArrayIndexOutOfBoundsException e) {
              System.out.println("Invalid Index for 2D array");
          }
     }

     // Traverse 2D array
    void traverse2DArray() {
        for (int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Searching a single value from the Array
    void searchingValue(int value) {
        for (int row= 0; row<arr.length; row++) {
            for (int col=0; col < arr[0].length; col++){
                if (arr[row][col] == value) {
                    System.out.println("The value " + value + " is found at row: " + row + " Col " + col);
                    return;
                }
            }
        }
        System.out.println(" The value " + value + " is not found in the 2D array");
    }

    // Deleting value from Array
    void deleteValueFromArray(int row, int col) {
        try {
            System.out.println("Successfully deleted: " + arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This index is not valid for the array ");
        }
    }


    @Override
    public String toString() {
        return "TwoDimensionArray{" +
                "int2DArray=" + Arrays.deepToString(arr) +
                '}';
    }

}
