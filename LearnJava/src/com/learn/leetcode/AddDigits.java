package com.learn.leetcode;

import java.util.BitSet;

/**
 * Created by nkagale on 4/12/16.
 */
public class AddDigits {
    public static void main(String argp[]){
        int[] numArray = new int[] {1, 4, 5, 23,38, 19};
        int num = 38;
        if(num<10){
            System.out.println(num);
        }else{
            System.out.println(addDigit(num));
        }
    }

    public static int addDigit(int num){
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;

    }
}
