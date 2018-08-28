package com.learn.operators;

/*
    Convert Integer to Binary
    input: 9 - o/p - 01001
 */
public class IntegerToBinary {
    public static void main(String args[]){
        foo(9);

    }

    public static void foo(int num){
        int d;
        d = num % 2;
        if (num != 0)
            foo(num >> 1);

        System.out.print(d);
    }
}
