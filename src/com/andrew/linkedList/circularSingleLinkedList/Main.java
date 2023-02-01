package com.andrew.linkedList.circularSingleLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(5);
        csll.insertCSLL(4,0); // inserting a node at the beginning of LinkedList (location 0)
        csll.insertCSLL(7, 1); // inserting a node at the beginning of LinkedList (location 1)
        csll.insertCSLL(2, 8); // inserting a node at the beginning of LinkedList (location 8)
        System.out.println(csll.head.value);
    }
}
