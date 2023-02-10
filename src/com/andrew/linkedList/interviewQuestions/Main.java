package com.andrew.linkedList.interviewQuestions;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.createLL(1);
        ll.insertNode(2);
        ll.insertNode(3);
        ll.insertNode(4);
        ll.insertNode(5);
        ll.insertNode(3);
        ll.insertNode(6);
        ll.traverselLL();
        Questions qs = new Questions();
        qs.deleteDuplicate(ll);
        ll.traverselLL();
//        Node n = qs.nthToTheLast(ll, 3);
//        System.out.println(n.value);
        qs.partition(ll, 4);
        ll.traverselLL();

    }
}
