package com.andrew.linkedList.circularDoublyLinkedList;

class CircularDoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    // Create CDLL
    DoublyNode createCDLL(int nodeValue) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        newNode.next = newNode;
        newNode.prev = newNode;
        size=1;
        return head;
    }
}
