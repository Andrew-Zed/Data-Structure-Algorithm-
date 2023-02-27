package com.andrew.tree.binarySearchTree;

class Main_BST {
    public static void main(String[] args) {
        BinarySearchTree newBST = new BinarySearchTree();
        newBST.insert(70);
        newBST.insert(50);
        newBST.insert(90);
        newBST.insert(30);
        newBST.insert(60);
        newBST.insert(80);
        newBST.insert(100);
        newBST.insert(20);
        newBST.insert(40);
        System.out.println("\n========PreOrder Traversal==========");
        newBST.preOrder(newBST.root);
        System.out.println("\n========InOrder Traversal==========");
        newBST.inOrder(newBST.root);
        System.out.println("\n========PostOrder Traversal==========");
        newBST.postOrder(newBST.root);
        System.out.println("\n========LevelOrder Traversal==========");
        newBST.levelOrder();
        System.out.println("\n========Search Binary Tree==========");
        newBST.search(newBST.root, 40);
        System.out.println("\n============Delete Node==============");
        newBST.levelOrder();
        System.out.println();
        newBST.deleteNode(newBST.root, 90);
        newBST.levelOrder();

    }
}
