package com.andrew.stack;

class Stack {
    int[] arr;
    int topOfStack;

    Stack(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with the size of: " + size);
    }

    // isEmpty
    boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        } else {
            return false;
        }
    }


}
