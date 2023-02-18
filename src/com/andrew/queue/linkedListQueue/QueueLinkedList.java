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

    // deQueue
    int deQueue() {
        int value = -1;
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
        } else {
            value = list.head.value;
            list.deletionOfNode(0);
        }
        return value;
    }

    // peek
    int peek() {
        if(isEmpty()) {
            System.out.println("The Queue is Empty");
            return -1;
        } else return list.head.value;
    }

    // delete Queue
    void deleteQueue() {
        list.head = null;
        list.tail = null;
        System.out.println("The Queue is successfully deleted");
    }

}
