package com.andrew.linkedList.interviewQuestions;

import java.util.HashSet;

class Questions {

    // Question 1 - Delete duplicate
    void deleteDuplicate(LinkedList ll) {
        HashSet<Integer> hs = new HashSet<>();
        Node current = ll.head;
        Node prev = null;
        while (current != null) {
            int curval = current.value;
            if (hs.contains(curval)) {
                prev.next = current.next;
                ll.size--;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
    }

    // Question 2 - Nth to the Last
    Node nthToTheLast(LinkedList ll, int n) {
        Node p1 = ll.head;
        Node p2 = ll.head;
        for (int i = 0; i < n; i++) {
            if (p2 == null) return null;
            p2 = p2.next;
        }
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return  p1;
    }

    // Question 3 - Partition
    LinkedList partition(LinkedList ll, int x) {
        Node currentNode = ll.head;
        ll.tail = ll.head;
        while (currentNode != null) {
            Node next = currentNode.next;
            if (currentNode.value < x) {
                currentNode.next = ll.head;
                ll.head = currentNode;
            } else {
                ll.tail.next = currentNode;
                ll.tail = currentNode;
            }
            currentNode = next;
        }
        ll.tail.next = null;
        return ll;
    }

}
