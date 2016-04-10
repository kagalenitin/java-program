package com.learn.sorting;

/**
 * Created by nkagale on 3/21/16.
 */
public class QuickSort {
    public static void main(String arg[]){
        int[] arr = new int[] {6, 7, 3, 1, 2, 5, 4, 0, -1};
        quickSort(arr, 0, arr.length-1);
        System.out.println("Sorted array");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }

    public static void quickSort(int[] ar, int start, int end){
        if(start>=end) return;
        int pIndex = partition(ar, start, end);
        quickSort(ar, start, pIndex-1);
        quickSort(ar, pIndex + 1, end);
    }

    public static int partition(int[] ar, int start, int end){
        int pivot = ar[end];
        int pIndex = start;
        for(int i=start; i<end; i++){
            if (ar[i]<=pivot){
                swap(ar, i, pIndex);
                pIndex += 1;
            }
        }
        swap(ar, pIndex, end);
        return pIndex;
    }

    public static void swap(int[] ar, int pos1, int pos2){
        int temp = ar[pos1];
        ar[pos1] = ar[pos2];
        ar[pos2] = temp;
    }

}
