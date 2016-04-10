package com.learn.arrayprograms;

import java.util.Arrays;
import java.util.BitSet;

/**
 * Created by nkagale on 3/15/16.
 */
public class FindMissingNumber {
    public static void main(String arg[]){
        int[] arr = new int[]{1, 2, 3, 5, 6, 7, 9};

        printMissingNumber(arr, 10);
    }

    private static void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);

        for (int number : numbers) {
            bitSet.set(number - 1);
        }

        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
                Arrays.toString(numbers), count);
        int lastMissingIndex = 0;

        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }

    }

}
