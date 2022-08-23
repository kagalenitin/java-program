package com.learn.trees;

public class BinarySearchTree {
    public Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int newData) {
        this.root = insert(root, newData);
    }

    public Node insert(Node root, int newData) {
        if(root == null){
            root = new Node(newData);
            return root;
        }
        // if root.value greater than equal to the new value, then go to left.
        else if(root.value >= newData) {
            root.left = insert(root.left, newData);
        } else {
            root.right = insert(root.right, newData);
        }
        return root;
    }

    public void preOrder(Node root) {
        if(root == null) return;
        System.out.println(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

//    public Node delete(Node root, Node node) {
//        if(root == null ) return null;
//        if(node.value < root.value) {
//            root.left = delete(root.left, node);
//        }else if(node.value > root.value) {
//            root.right = delete(root.right, node);
//        }else if (root.value == node.value) {
//            // We found the node data we want to delete.
//            if(root.left != null && root.right != null){
//
//            }
//
//        }
//    }

    public static void main(String arg[]) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(15);
        bst.insert(12);
        bst.insert(18);
        bst.insert(10);
        bst.insert(8);
        bst.insert(11);
        bst.insert(14);
        bst.preOrder(bst.root);
    }
}
