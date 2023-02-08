package com.andrew.linkedList.doublyLinkedList;

class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(1);
        dll.insertDLL(2, 0);
        dll.insertDLL(3, 1);
        dll.insertDLL(5, 7) ;
        System.out.println(dll.head.next.value);
        dll.traverseDLL();
//        dll.reverseTraverseDLL();
        dll.searchNode(5) ;
        dll.deleteNodeDLL(7);
        dll.traverseDLL();
        dll.deleteDLL();
        dll.traverseDLL();
    }
}
