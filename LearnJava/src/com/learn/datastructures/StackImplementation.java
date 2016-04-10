package com.learn.datastructures;

/**
 * Created by nkagale on 3/8/16.
 */
public class StackImplementation {
    public static void main(String args[]){

        Stack st = new Stack();
        st.insertFirst(50);
        System.out.println(" TOP of List: " + st.top());
        st.insertFirst(40);
        System.out.println(" TOP of List: " + st.top());
        st.insertFirst(30);
        System.out.println(" TOP of List: " + st.top());
        st.displayList();
        st.insertFirst(60);
        st.deleteFirst();
        System.out.println(" TOP of List: " + st.top());
        System.out.println("Is List Empty? " + st.isEmpty());
        st.deleteFirst();
        st.deleteFirst();
        System.out.println("Is List Empty? " + st.isEmpty());
        if(st.deleteFirst()==null){
            System.out.println("List is empty");
        }else{
            st.displayList();
        }
    }
}

class Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data = data;
    }

    public void displayNode() {
        System.out.print(data);
        System.out.print("  ");
    }
}

class Stack{
    private Node first = null;

    public void insertFirst(int data){
        Node n = new Node(data);
        n.next = first;
        first = n;
    }

    public Node deleteFirst(){
        Node temp = first;
        if(!isEmpty()){
            first = first.next;
        }
        return temp;
    }

    public void displayList(){
        Node current = first;
        while(current!=null){
            current.displayNode();
            current = current.next;
        }
    }

    public boolean isEmpty(){
        return  (first == null);
    }

    public int top(){
        return first.data;
    }
}