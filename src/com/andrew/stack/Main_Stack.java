package com.andrew.stack;

class Main_Stack {

    public static void main(String[] args) {
        Stack newStack = new Stack(4);
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);

        int result = newStack.peek();
        System.out.println(result);
        System.out.println();
        int result2 = newStack.peek();
        System.out.println(result2);

    }

}
