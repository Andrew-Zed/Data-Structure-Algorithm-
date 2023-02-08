package com.andrew.linkedList.doublyLinkedList;

class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

     DoublyNode createDLL(int nodeValue) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }

    // Insertion Method
     void insertDLL(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if (head == null) {
            createDLL(nodeValue);
            return;
        } else if (location == 0){
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    // Traverse DLL
    void traverseDLL() {
         if (head != null) {
             DoublyNode tempNode = head;
             for (int i = 0; i < size; i++) {
                 System.out.print(tempNode.value);
                 if (i != size - 1) {
                     System.out.print(" -> ");
                 }
                 tempNode =  tempNode.next;

             }
         } else {
             System.out.println("The DLL does not exist");
         }
        System.out.println("\n");
    }

    // Reverse Traverse of DLL
    void reverseTraverseDLL() {
         if (head != null) {
             DoublyNode tempNode = tail;
             for(int i = 0; i < size; i++) {
                 System.out.print(tempNode.value);
                 if (i != size-1) {
                     System.out.print(" <- ");
                 }
                 tempNode = tempNode.prev;
             }
         } else {
             System.out.println("The DLL does not exist");
         }
        System.out.println("\n");
    }

    // Search Node
    boolean searchNode(int nodeValue) {
         if (head != null) {
             DoublyNode tempNode = head;
             for (int i = 0; i < size; i++) {
                 if (tempNode.value == nodeValue) {
                     System.out.println("The Node is found at the location: " + i);
                     return true;
                 }
                 tempNode = tempNode.next;
             }
         }
         System.out.println("Node not found");
         return false;
    }

    // Deletion Method
    void deleteNodeDLL(int location) {
         if (head == null) {
             System.out.println("The DLL does not exist!");
             return;
         } else if (location == 0) {
              if (size == 1) {
                  head = null;
                  tail = null;
                  size--;
              } else {
                  head = head.next;
                  head.prev = null;
                  size--;
              }
         } else if (location >= size) {
             DoublyNode tempNode = tail.prev;
             if (size == 1) {
                 head = null;
                 tail = null;
                 size--;
                 return;
             } else {
                 tempNode.next = null;
                 tail = tempNode;
                 size--;
             }
         } else {
             DoublyNode tempNode = head;
             for (int i=0; i<location-1; i++) {
                 tempNode = tempNode.next;
             }
             tempNode.next = tempNode.next.next;
             tempNode.next.prev = tempNode;
             size--;
         }
    }

    // Deleting an entire DLL
    void deleteDLL() {
         DoublyNode tempNode = head;
         for (int i=0; i<size; i++) {
             tempNode.prev = null;
             tempNode = tempNode.next;
         }
         head = null;
         tail = null;
        System.out.println("The DLL has been deleted");
    }

}
