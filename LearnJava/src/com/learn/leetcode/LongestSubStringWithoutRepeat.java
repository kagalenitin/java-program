package com.learn.leetcode;

import java.util.*;

public class LongestSubStringWithoutRepeat {
    public static void main(String args[]){
        System.out.println(lengthOfLongestSubstring("abcabcade"));
    }

    public static int lengthOfLongestSubstring(String s) {

        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        Iterator<Character> iter = set.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next());
        }


        return ans;
    }


}
