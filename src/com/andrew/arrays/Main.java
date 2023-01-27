package com.andrew.arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0,10);
        sda.insert(1, 20);
        sda.insert(2, 30);
        sda.insert(1,30);
        sda.insert(12, 120);
        
        System.out.println(sda);
        System.out.println("===================================== 2D Array below ===================================== ");

        TwoDimensionalArray twoDArray = new TwoDimensionalArray(3, 3);
        twoDArray.insertValueInTheArray(0, 0, 10);
        twoDArray.insertValueInTheArray(0,0,10);
        twoDArray.insertValueInTheArray(0, 1, 20);
        twoDArray.insertValueInTheArray(0, 2, 30);
        twoDArray.insertValueInTheArray(1,0, 40);
        twoDArray.insertValueInTheArray(1, 1, 50);
        twoDArray.insertValueInTheArray(1,2,60);
        twoDArray.insertValueInTheArray(2, 0, 70);
        twoDArray.insertValueInTheArray(2,1, 80);
        twoDArray.insertValueInTheArray(2,2,90);
        System.out.println(Arrays.deepToString(twoDArray.arr));
        System.out.println("+++++++++++++++++++++++++");
        System.out.println(twoDArray);

        System.out.println("Accessing a 2D Array ================================== ");
        twoDArray.accessCell(0,0);

        System.out.println("Traversing a 2D Array ================================== ");
        twoDArray.traverse2DArray();
        System.out.println("===========================================");

        System.out.println("Searching Value in 2D Array");
        twoDArray.searchingValue(50);


    }

}
