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

    // Insert Method SinglyLinkedList
    void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if(head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while(index < location -1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    // SinglyLinkedList Traversal
    void traversalSinglyLinkedList() {
        if(head==null) {
            System.out.println("SLL does not exist");
        } else {
            Node tempNode = head;
            for (int i=0; i<size; i++){
                System.out.print(tempNode.value);
                if (i != size-1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    // Search for a node
    boolean searchNode(int nodeValue){
        if(head != null) {
            Node tempNode = head;
            for (int i = 0; i<size; i++){
                if(tempNode.value==nodeValue){
                    System.out.println("Found the node at location " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    // Deleting a node from SinglyLinkedList
    void deletionOfNode(int location){
        if (head == null) {
            System.out.println("The SLL does not exist");
            return;
        } else if (location == 0){
            head = head.next;
            size--;
            if (size==0) {
                tail = null;
            }
        } else if (location >= size){
            Node tempNode = head;
            for (int i=0; i<size-1; i++){
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next=null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location-1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }



}
