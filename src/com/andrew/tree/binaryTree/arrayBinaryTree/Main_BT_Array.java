package com.andrew.tree.binaryTree.arrayBinaryTree;

class Main_BT_Array {
    public static void main(String[] args) {
        BinaryTree newBinaryTree = new BinaryTree(9);
        newBinaryTree.insert("N1");
        newBinaryTree.insert("N2");
        newBinaryTree.insert("N3");
        newBinaryTree.insert("N4");
        newBinaryTree.insert("N5");
        newBinaryTree.insert("N6");
        newBinaryTree.insert("N7");
        newBinaryTree.insert("N8");
        newBinaryTree.insert("N9");

        System.out.println("======PreOrder Traversal======");
        newBinaryTree.preOrder(1);
        System.out.println("\n======InOrder Traversal======");
        newBinaryTree.inOrder(1);
        System.out.println("\n======PostOrder Traversal======");
        newBinaryTree.postOrder(1);
        System.out.println("\n======LevelOrder Traversal======");
        newBinaryTree.levelOrder();
        System.out.println("\n======Search Binary Tree======");
        newBinaryTree.search("N5");
        System.out.println("\n======Delete a node in Binary Tree======");
        newBinaryTree.delete("N6");
        newBinaryTree.levelOrder();


    }
}
