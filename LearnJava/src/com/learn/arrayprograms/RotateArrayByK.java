package com.learn.arrayprograms;

/**
 * Created by nkagale on 6/2/16.
 */
public class RotateArrayByK {
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4, 5, 6};

        int[] rotatedArray = rotateByK(arr, 4);
        printArray(rotatedArray);
    }

    public static int[] rotateByK(int[] arr, int k){
        int len = arr.length;
        while(k > 0){
            rotateOnce(arr);
            k--;
        }
        return arr;
    }

    public static void rotateOnce(int[] arr){
        int i;
        int len = arr.length;
        int temp = arr[0];
        for(i=0; i<len-1; i++)
            arr[i] = arr[i+1];
        arr[i] = temp;
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
