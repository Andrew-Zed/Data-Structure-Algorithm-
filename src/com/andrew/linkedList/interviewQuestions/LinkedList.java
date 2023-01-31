package com.andrew.linkedList.interviewQuestions;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    void createLL(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
    }

    void insertNode(int nodeValue){
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    void traversalLL(){
        Node tempNode = head;
        for (int i=0; i<size; i++){
            System.out.print(tempNode.value);
            if (i!=size-1){
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }

}
