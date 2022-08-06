package com.learn.trees;

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTrees {
    Node root;

    public static void main(String args[]){
        BinaryTrees trees = new BinaryTrees();
        trees.root = new Node(10);
        trees.root.left = new Node(6);
        trees.root.right = new Node(12);
        trees.root.left.left = new Node(5);

        System.out.println("Binary Tree PreOrder: ");
        trees.traversePreOrder(trees.root);

        System.out.println("Binary Tree PostOrder: ");
        trees.traversePostOrder(trees.root);

        System.out.println("Binary Tree InOrder: ");
        trees.traverseInOrder(trees.root);
    }

    public void traversePreOrder(Node node){
        if(node != null){
            System.out.println(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(Node node) {
        if(node!= null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.println(" " + node.value);
        }
    }

    public void traverseInOrder(Node node) {
        if(node != null) {
            traverseInOrder(node.left);
            System.out.println(node.value);
            traverseInOrder(node.right);
        }
    }
}
