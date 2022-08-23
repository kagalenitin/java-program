package com.learn.singlylinkedlist;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class PalindromeLinkedList {
    ListNode head;
    public static void main(String[] args) {
        PalindromeLinkedList pLL = new PalindromeLinkedList();
        pLL.head = new ListNode(1);
        pLL.head.next = new ListNode(0);
        pLL.head.next.next = new ListNode(1);
//        pLL.head.next.next.next = new ListNode(1);
//        pLL.head.next.next.next.next = new ListNode(4);

//        pLL.printList(pLL.head);
        System.out.println(pLL.isPalindrome(pLL.head) + " is the value");
    }

    public void printList(ListNode node) {
        while(node !=null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public boolean isPalindrome(ListNode node) {
        Stack<Integer> stack = new Stack<>();
        if(node.next == null) return true;
        while(node!=null) {
            if(!stack.contains(node.val)) {
                stack.push(node.val);
            }else{
                stack.pop();
            }
            node = node.next;
        }
        if(stack.empty()) return true;
        else return false;
    }

}
