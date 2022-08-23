package com.learn.trees;


import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    Node root;
    public static void main(String args[]){
        BreadthFirstSearch trees = new BreadthFirstSearch();
        trees.root = new Node(10);
        trees.root.left = new Node(6);
        trees.root.right = new Node(12);
        trees.root.left.left = new Node(5);
        trees.root.left.right = new Node(8);

        trees.levelOrder(trees.root);
        System.out.println(trees.findHeight(trees.root) + " is the height of the tree");
    }

    public void levelOrder(Node root){
        if(root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            Node current = queue.peek();
            System.out.println(current.value + " ");
            if(current.left != null) queue.add(current.left);
            if(current.right != null) queue.add(current.right);
            queue.remove(); // remove the element
        }
    }

    /*
        findHeight:
        Height of a node = No. of edges in longest path from root to leaf node.
        Height of a tree = Height of root
        Height of tree with 1 node = 0

        Depth of a node = no. of edges in path from the root to that node.
     */
    public int findHeight(Node root) {
        if(root == null) return -1;
        return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
    }
}
