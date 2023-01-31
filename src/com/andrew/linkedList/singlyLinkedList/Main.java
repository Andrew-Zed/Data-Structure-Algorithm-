package com.andrew.linkedList.singlyLinkedList;

public class Main {
    public static void main(String[] args) {
        Singly_LinkedList sLL = new Singly_LinkedList();
        sLL.createSinglyLinkedList(5);
//        System.out.println(sLL.head.value);
        sLL.insertInLinkedList(6, 1);
//        System.out.println(sLL.head.next.value);
        sLL.insertInLinkedList(7, 3);
        sLL.insertInLinkedList(8, 4);
        sLL.insertInLinkedList(9, 5);
        sLL.insertInLinkedList(12, 0);
//        System.out.println(sLL.head.next.next.value);

        sLL.traversalSinglyLinkedList();
//        sLL.searchNode(8);
        sLL.deletionOfNode(7);
        sLL.traversalSinglyLinkedList();
    }

}
