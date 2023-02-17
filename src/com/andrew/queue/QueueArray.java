package com.andrew.queue;

class QueueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    // Create Queue
    QueueArray(int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The Queue is successfully created with the size of: " + size);
    }

    // IsFull
    boolean isFull() {
        if (topOfQueue == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    // isEmpty
    boolean isEmpty() {
        if ((beginningOfQueue == -1) || (beginningOfQueue == arr.length)) {
            return true;
        } else {
            return false;
        }
    }


}
