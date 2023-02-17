package com.andrew.queue.arrayQueue.linearQueue;

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

    // Enqueue
    void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Queue is Full!");
        } else if (isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " into the queue");
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " into the queue");
        }
    }

    // deQueue
    int deQueue() {
        if (isEmpty()) {
            System.out.println("The Queue is empty!");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            }
            return result;
        }
    }

    // Peek
    int peek() {
        if (!isEmpty()) {
            return arr[beginningOfQueue];
        } else {
            System.out.println("The Queue is empty");
            return -1;
        }
    }

    // delete
    void deleteQueue() {
        arr = null;
        System.out.println("The Queue is successfully deleted");
    }

}
