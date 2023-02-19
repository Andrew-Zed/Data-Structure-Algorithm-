package com.andrew.queue.queueQuestion;

class ThreeInOne {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    ThreeInOne(int stackSize) {
        stackCapacity = stackSize;
        values = new int[stackSize * numberOfStacks];
        sizes = new int[numberOfStacks];
    }

    // isFull
    protected boolean isFull(int stackNum) {
        if (sizes[stackNum] == stackCapacity) {
            return true;
        } else return false;
    }

    // isEmpty
    protected boolean isEmpty(int stackNum) {
        if (sizes[stackNum] == 0) {
            return true;
        } return false;
    }

    // indexOfTop
    private int indexOfTop(int stackNum) {
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset + size - 1;
    }

    // push
    void push(int stackNum, int value) {
        if (isFull(stackNum)) {
            System.out.println("The Stack is Full");
        } else {
            sizes[stackNum]++;
            values[indexOfTop(stackNum)] = value;
        }
    }

    // pop
    int pop(int stackNum) {
        if (isEmpty(stackNum)) {
            System.out.println("The Stack is Empty");
            return -1;
        } else {
            int topIndex = indexOfTop(stackNum);
            int value = values[topIndex];
            values[topIndex] = 0;
            sizes[stackNum]--;
            return value;
        }
    }

    // peek
    int peek(int stackNum) {
        if (isEmpty(stackNum)) {
            System.out.println("The Stack is Empty");
            return -1;
        } else {
            return values[indexOfTop(stackNum)];
        }
    }

}
