package com.andrew.linkedList.circularSingleLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
//        csll.createCSLL(5);
        csll.insertCSLL(4,0); // inserting a node at the beginning of LinkedList (location 0)
        csll.insertCSLL(7, 1); // inserting a node at the beginning of LinkedList (location 1)
        csll.insertCSLL(2, 2); // inserting a node at the beginning of LinkedList (location 2)
        csll.insertCSLL(8, 3); // inserting a node in the LinkedList (location 3)
        csll.insertCSLL(6, 8); // inserting a node in the LinkedList (location 8)


        System.out.println("head -> " + csll.head.value);
        System.out.println("================================");
        csll.traversalCSLL();
        csll.deleteNode(1 );
        csll.traversalCSLL();
    }
}
