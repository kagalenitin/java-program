package com.learn.sorting;

/**
 * Created by nkagale on 3/21/16.
 */
public class SelectionSort {

    public static void main(String arg[]){
        int[] arr = new int[] {6, 7, 3, 1, 2, 5, 4};
        selectionSort(arr);
        System.out.println("Sorted array");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }

    public static void selectionSort(int[] ar){
        int len = ar.length;
        int iMin;
        for(int i=0; i< len-1; i++){
            iMin = i;
            for(int j=i+1; j< len; j++){
                if(ar[j]<ar[iMin])
                    iMin = j;
            }

            int temp = ar[i];
            ar[i] = ar[iMin];
            ar[iMin] = temp;

        }
    }
}
