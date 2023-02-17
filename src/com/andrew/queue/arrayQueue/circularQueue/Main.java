package com.andrew.queue.arrayQueue.circularQueue;

public class Main {
    public static void main(String[] args) {
        CircularQueue newCQ = new CircularQueue(5);
        boolean result = newCQ.isEmpty();
        System.out.println(result);
    }
}
