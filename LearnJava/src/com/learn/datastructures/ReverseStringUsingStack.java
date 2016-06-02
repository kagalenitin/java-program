package com.learn.datastructures;

import java.util.Stack;

/**
 * Created by nkagale on 6/1/16.
 */
public class ReverseStringUsingStack {

    public static void main(String args[]){
        String str = "this";
        System.out.println("Reversed string of " + str + " is " + reverseUsingCustomStack(str));
    }

    public static String reverseUsingStack(String argString){
        StringBuilder reversedString = new StringBuilder();
        if(!(argString.equals(""))){
            char[] charString = argString.toCharArray();
            int len = charString.length;
            Stack stack = new Stack();
            for(int i=0; i<len; i++){
                stack.push(charString[i]);
            }

            while(!(stack.empty())){
                reversedString.append(stack.pop());
            }
        }

        return reversedString.toString();
    }

    public static String reverseUsingCustomStack(String argString){
        StringBuilder reversedString = new StringBuilder();

        if(!(argString.equals(""))){
            char[] charString = argString.toCharArray();
            int len = charString.length;
            StackObject stkObject = new StackObject();

            for(int i=0; i< len; i++){
                stkObject.insertFirst(charString[i]);
            }

            while (!(stkObject.isEmpty())){
                reversedString.append(stkObject.top().data);
                stkObject.deleteFirst();
            }
        }

        return reversedString.toString();
    }
}

class NodeObject{
    public Object data;
    public NodeObject next;

    public NodeObject(Object data){
        this.data = data;
    }

    public void displayNode() {
        System.out.print(this.data);
        System.out.print("  ");
    }
}

class StackObject{
    private NodeObject first = null;

    public void insertFirst(Object data){
        NodeObject n = new NodeObject(data);
        n.next = first;
        first = n;
    }

    public NodeObject deleteFirst(){
        NodeObject temp = first;
        if(!isEmpty()){
            first = first.next;
        }
        return temp;
    }

    public void displayList(){
        NodeObject current = first;
        while(current!=null){
            current.displayNode();
            current = current.next;
        }
    }

    public boolean isEmpty(){
        return  (first == null);
    }

    public NodeObject top(){
        return first;
    }
}