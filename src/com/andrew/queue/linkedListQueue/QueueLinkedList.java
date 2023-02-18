package com.andrew.queue.linkedListQueue;

class QueueLinkedList {
    LinkedList list;

    QueueLinkedList() {
        list = new LinkedList();
        System.out.println("The Queue is successfully created");
    }

    // isEmpty
    boolean isEmpty() {
        if (list.head == null) {
            return true;
        } else return false;
    }

    // enQueue
    void enQueue(int value) {
        list.insertInLinkedList(value, list.size);
        System.out.println("Successfully inserted " + value + " in the queue.");
    }
}
