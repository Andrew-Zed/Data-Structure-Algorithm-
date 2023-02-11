package com.andrew.linkedList.interviewQuestions;

public class Main {
    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//        ll.createLL(1);
//        ll.insertNode(2);
//        ll.insertNode(3);
//        ll.insertNode(4);
//        ll.insertNode(5);
//        ll.insertNode(3);
//        ll.insertNode(6);
//        ll.traverseLL();
//        Questions qs = new Questions();
//        qs.deleteDuplicate(ll);
//        ll.traverseLL();
////        Node n = qs.nthToTheLast(ll, 3);
////        System.out.println(n.value);
//        qs.partition(ll, 4);
//        ll.traverseLL();
        LinkedList llA = new LinkedList();
        llA.insertNode(7);
        llA.insertNode(1);
        llA.insertNode(6);
        LinkedList llB = new LinkedList();
        llB.insertNode(5);
        llB.insertNode(9);
        llB.insertNode(2);
        llA.traverseLL();
        llB.traverseLL();
        Questions q = new Questions();
        LinkedList result = q.sumList(llA, llB);
        result.traverseLL();

    }
}
