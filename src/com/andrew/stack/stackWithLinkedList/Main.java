package com.andrew.stack.stackWithLinkedList;

class Main {

    public static void main(String[] args) {

        Stack newStack = new Stack();
        boolean result1 = newStack.isEmpty();
        System.out.println(result1);

        newStack.push(1);
        newStack.push(2);
        newStack.push(3);

        boolean result = newStack.isEmpty();
        System.out.println(result);

    }



}
