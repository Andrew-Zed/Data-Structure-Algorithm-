package com.andrew.linkedList.singlyLinkedList;

public class Main {
    public static void main(String[] args) {
        Singly_LinkedList sLL = new Singly_LinkedList();
        sLL.createSinglyLinkedList(5);
        System.out.println(sLL.head.value);
        sLL.insertInLinkedList(6, 1);
        System.out.println(sLL.head.next.value);
        sLL.insertInLinkedList(7, 3);
        System.out.println(sLL.head.next.next.value);
    }

}
