package com.andrew.stack.stackWithLinkedList;

class Stack {

    LinkedList linkedList;

    public Stack() {
        linkedList = new LinkedList();
    }

    // Push Method
    void push(int value) {
        linkedList.insertInLinkedList(value, 0);
        System.out.println("Inserted " + value + " in Stack");
    }

    // isEmpty
    boolean isEmpty() {
        if(linkedList.head == null) {
            return true;
        } else {
            return false;
        }
    }


}
