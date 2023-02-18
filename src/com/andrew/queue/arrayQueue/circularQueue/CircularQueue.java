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

    // isFull
    boolean isFull() {
        if (topOfQueue + 1 == beginningOfQueue) {
            return true;
        } else if (beginningOfQueue == 0 && topOfQueue+1 == size) {
            return true;
        } else return false;
    }

    // enQueue
    void enQueue(int value) {
        if (isFull()) {
            System.out.println("The CQ is full!");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        } else {
            if (topOfQueue+1 == size) {
                topOfQueue = 0;
            } else {
                topOfQueue++;
            }
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        }
    }

    // deQueue
    int deQueue() {
        if (isEmpty()) {
            System.out.println("The CQ is empty");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if (beginningOfQueue == topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            } else if (beginningOfQueue + 1 == size) {
                beginningOfQueue = 0;
            } else {
                beginningOfQueue++;
            }
            return result;
        }
    }

    // peek
    int peek() {
        if (isEmpty()) {
            System.out.println("The CQ is empty");
            return -1;
        } else {
            return arr[beginningOfQueue];
        }
    }

    // deleteQueue
    void deleteQueue() {
        arr = null;
        System.out.println("The CQ is successfully deleted");
    }

}
