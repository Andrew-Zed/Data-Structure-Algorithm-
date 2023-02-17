package com.andrew.special_questions;

import java.util.Arrays;

public class Question {


//    public static double[] maximizeU(int[] arr) {
//        // Sort array in descending order
//        Arrays.sort(arr);
//        int n = arr.length;
//        for (int i = 0; i < n / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[n - 1 - i];
//            arr[n - 1 - i] = temp;
//        }
//
//        // Apply greedy algorithm
//        if (n % 2 == 0) {
//            for (int i = 0; i < n - 1; i += 2) {
//                if (arr[i + 1] > arr[i]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        } else {
//            for (int i = 0; i < n - 2; i += 2) {
//                if (arr[i + 1] > arr[i]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//            if (1.0 / arr[n - 1] > arr[n - 2]) {
//                int temp = arr[n - 1];
//                arr[n - 1] = arr[n - 2];
//                arr[n - 2] = temp;
//            }
//        }
//
//        // Calculate U
//        double U = arr[0];
//        for (int i = 1; i < n - 1; i++) {
//            if (i % 2 == 1) {
//                U *= arr[i];
//            } else {
//                U *= 1.0 / arr[i];
//            }
//        }
//        if (n % 2 == 0) {
//            U *= arr[n - 1];
//        } else {
//            U *= 1.0 / arr[n - 1];
//        }
//
////        return new double[]{U, Arrays.stream(arr).asDoubleStream().toArray()};
//    }

}
