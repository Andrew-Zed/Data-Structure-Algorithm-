package com.andrew.tree.binaryTree.arrayBinaryTree;

class BinaryTree {
    String[] arr;
    int lastUsedIndex;

     BinaryTree(int size) {
        arr = new String[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("Blank Tree of size " + size + " has been created");
    }

    // isFull
    boolean isFull() {
       if (arr.length - 1 == lastUsedIndex) {
           return true;
       }
       return false;
    }

    // insert method
    void insert(String value) {
         if (!isFull()) {
             arr[lastUsedIndex + 1] = value;
             lastUsedIndex++;
             System.out.println("The value of " + value + " has been inserted");
         } else {
             System.out.println("The BT is full");
         }
    }
}
