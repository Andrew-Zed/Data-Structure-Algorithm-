package com.andrew.queue.arrayQueue.circularQueue;

class CircularQueue {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;

    CircularQueue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The CQ is successfully created with size of " + size);
    }

    // isEmpty
    boolean isEmpty() {
         if(topOfQueue == -1) {
             return true;
         } else {
             return false;
         }
    }
}
