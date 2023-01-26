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
        System.out.println(Arrays.deepToString(twoDArray.arr));
        System.out.println("+++++++++++++++++++++++++");
        System.out.println(twoDArray);


    }

}
