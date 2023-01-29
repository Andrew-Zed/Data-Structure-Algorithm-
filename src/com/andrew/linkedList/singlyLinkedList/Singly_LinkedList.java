package com.andrew.linkedList.singlyLinkedList;

public class Singly_LinkedList {
    Node head;
    Node tail;
    int size;

    Node createSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

}
