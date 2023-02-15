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

    // isFull
    boolean isFull() {
        if (topOfStack == arr.length -1) {
            System.out.println("The Stack is full!");
            return true;
        } else {
            return false;
        }
    }

    // Push
    void push(int value) {
        if (isFull()) {
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("The value " + value + " is successfully inserted");
        }
    }

    // Pop
    int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        } else {
            int topStack  = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    // Peek method
    int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        } else {
            return arr[topOfStack];
        }
    }

}
