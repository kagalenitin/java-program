package com.learn.sorting;

/**
 * Created by nkagale on 3/22/16.
 */
public class MergeSort {
    public static void main(String arg[]){
        int[] arr = new int[] {-1, 6, 7, 3, 1, 2, 5, 4, 0};
        mergeSort(arr);
        System.out.println("Sorted array");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }

    public static void mergeSort(int[] ar){
        int len = ar.length;
        //If len<2, return
        if(len<2){
            return;
        }
        //Divide the array into half and divide into left-sub-array and right-sub-array
        int mid = len/2;
        int[] left = new int[mid];
        int[] right = new int[len-mid];
        for(int i=0; i<mid; i++){
            left[i] = ar[i];
        }
        for(int j=mid; j<len; j++){
            right[j-mid] = ar[j];
        }

        //Mergesort
        mergeSort(left);
        mergeSort(right);

        //Merge
        merge(left, right, ar);
    }

    public static void merge(int[] left, int[] right, int[] ar){
        int lLen = left.length;
        int rLen = right.length;
        int i=0, j=0, k=0;
        //Compare the values of left and right position element
        while(i<lLen && j < rLen){
            if(left[i] <= right[j]){
                ar[k] = left[i];
                i +=1;
            }else{
                ar[k] = right[j];
                j +=1;
            }
            k +=1;
        }
        // If after merging, there are elements left in left array, copy over in ar;
        while(i<lLen){
            ar[k] = left[i];
            i +=1;
            k +=1;
        }
        // If after merging, there are elements left in right array, copy over in ar;
        while(j<rLen){
            ar[k] = right[j];
            j +=1;
            k +=1;
        }
    }

    public static void inPlaceMergeSort(int[] ar, int start, int end){
        if(start<end){
            int mid = ar.length;
            inPlaceMergeSort(ar,start, mid);
            inPlaceMergeSort(ar, mid+1, end);

        }
    }

    public static void inPlaceMerge(int[] ar, int start, int end){

    }

}
