package com.andrew.linkedList.circularSingleLinkedList;

public class CircularSinglyLinkedList {
    Node head;
    Node tail;
    int size;

    Node createCSLL(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

}
