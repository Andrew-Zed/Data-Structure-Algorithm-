package com.andrew.linkedList.singlyLinkedList;

public class Main {
    public static void main(String[] args) {
        Singly_LinkedList sLL = new Singly_LinkedList();
        sLL.createSinglyLinkedList(5);
        System.out.println(sLL.head.value);
    }

}
