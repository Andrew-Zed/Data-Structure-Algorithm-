package com.andrew.queue.arrayQueue.circularQueue;

public class Main {
    public static void main(String[] args) {
        CircularQueue newCQ = new CircularQueue(4);
        boolean result = newCQ.isFull();
        System.out.println(result);

        newCQ.enQueue(10);
        newCQ.enQueue(20);
        newCQ.enQueue(30);
        newCQ.enQueue(40);
        newCQ.enQueue(50);

    }
}
