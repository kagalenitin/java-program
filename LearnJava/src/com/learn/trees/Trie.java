package com.learn.trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class TrieNode {
    private boolean isLeaf;
    private List<TrieNode> children = null;

    private static final int CHAR_SIZE = 26;

    TrieNode(){
        isLeaf = false;
        children = new ArrayList<>(Collections.nCopies(CHAR_SIZE, null));
    }

    public void insert(String word) {
        System.out.println("Inserting key " + word + " to the Trie");
        TrieNode curr = this;
        for(char ch : word.toCharArray()){
            if(curr.children.get(ch - 'a') == null){
                curr.children.set(ch - 'a', new TrieNode());
            }

            curr = curr.children.get(ch - 'a');

            curr.isLeaf = true;
        }
    }

    public boolean search(String word) {
        System.out.println("Searching for the value: " + word);
        TrieNode curr = this;
        for (char ch : word.toCharArray()) {
            curr = curr.children.get(ch - 'a');
            if(curr == null){
                return false;
            }
        }
        return curr.isLeaf;
    }

    public boolean startsWith(String prefix) {
        System.out.println("Searching for word starting with: " + prefix);
        TrieNode curr = this;

        for(char ch: prefix.toCharArray()) {
            curr = curr.children.get(ch - 'a');
            if(curr == null) {
                return false;
            }
        }
        return true;
    }
}

public class Trie {
    public static void main(String arg[]){
        TrieNode head = new TrieNode();
        head.insert("techie");
        if(head.search("teche")){
            System.out.println("Found the word");
        }else{
            System.out.println("Did not find the word.");
        }

        if(head.startsWith("ct")) {
            System.out.println("Found the word");
        }else{
            System.out.println("Did not find word starting with ");
        }
    }
}
