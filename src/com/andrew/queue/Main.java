package com.andrew.queue;

public class Main {
    public static void main(String[] args) {
        QueueArray newQueue = new QueueArray(5);
        newQueue.enQueue(1);
        newQueue.enQueue(2);
        newQueue.enQueue(3);
        newQueue.enQueue(4);
        newQueue.enQueue(5);
        int result = newQueue.peek();
        System.out.println(result);
        int result2 = newQueue.peek();
        System.out.println(result2);
    }
}
