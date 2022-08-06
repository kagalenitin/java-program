package com.learn.trees;

import java.util.Queue;

public class BreadthFirstSearch {
    Node root;

    public static void main(String args[]) {
        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        breadthFirstSearch.root = new Node(3);
        breadthFirstSearch.root.left = new Node(9);
        breadthFirstSearch.root.right = new Node(20);
        breadthFirstSearch.root.right.left = new Node(15);
        breadthFirstSearch.root.right.right = new Node(7);
    }

    public void levelOrder(Node node) {
        if (root == null) return ;
        
    }
}
