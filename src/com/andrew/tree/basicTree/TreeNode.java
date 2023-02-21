package com.andrew.tree.basicTree;

import java.util.ArrayList;

class TreeNode {
    String data;
    ArrayList<TreeNode> children;

     TreeNode(String data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    void addChild(TreeNode node) {
         this.children.add(node);
    }

    String print(int level) {
         String ret;
         ret = " ".repeat(level) +  data + "\n";
        for (TreeNode node: this.children) {
            ret += node.print(level + 1);
        }
        return ret;
    }

}
