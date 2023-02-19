package com.andrew.queue.queueQuestion;

class Main {
    public static void main(String[] args) {
        ThreeInOne newStacks = new ThreeInOne(3);
        boolean result = newStacks.isFull(2);
        System.out.println(result);

        System.out.println("========================");

        boolean result2 = newStacks.isEmpty(0);
        System.out.println(result2);

        newStacks.push(0, 1);
        newStacks.push(0, 2);
        newStacks.push(1, 4);
        newStacks.push(1, 5);
        newStacks.push(2, 8);

        int result3 = newStacks.pop(2);
        System.out.println(result3 + " pop");
        int result4 = newStacks.peek(2);
        System.out.println(result4 + " peek");


    }
}
