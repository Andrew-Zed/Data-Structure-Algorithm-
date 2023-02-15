package com.andrew.stack.stackWithLinkedList;

class Main {

    public static void main(String[] args) {

        Stack newStack = new Stack();
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);

        int result = newStack.peek();
        System.out.println(result);
        int result2 = newStack.peek();
        System.out.println(result2);

    }



}
