package com.andrew.queue.linkedListQueue;

class Main {
    public static void main(String[] args) {
        QueueLinkedList newQLL = new QueueLinkedList();
        newQLL.enQueue(10);
        newQLL.enQueue(20);
        newQLL.enQueue(30);
        newQLL.enQueue(40);
        int result = newQLL.deQueue();
        System.out.println(result);
        int result2 = newQLL.deQueue();
        System.out.println(result2);
        System.out.println("==========================");

        int result3 = newQLL.peek();
        System.out.println(result3);
        int result4 = newQLL.peek();
        System.out.println(result4);

        newQLL.deleteQueue();

    }
}
