package com.andrew.linkedList.circularDoublyLinkedList;

class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createCDLL(1);
        System.out.println(cdll.head.value);
        cdll.insertNode(2, 1);
        cdll.insertNode(7, 2);
        cdll.insertNode(10, 3);
        cdll.insertNode(5, 8);
        cdll.insertNode(4, 4);
        cdll.traverseCDLL();
        cdll.reverseTraversalCDLL();
    }
}
