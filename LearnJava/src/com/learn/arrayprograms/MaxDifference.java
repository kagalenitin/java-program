package com.learn.arrayprograms;

/**
 * Created by nkagale on 3/7/16.
 */
public class MaxDifference {
    public static void main(String arg[]){
        int[] arr = new int[] {1,2,4,5,6};//{1, 6, 5, 4, 3, 2, 1};
        System.out.println(maxDifference(arr));
    }

    public static int maxDifference(int[] array){
        if(array.length<=1){
            return -1;
        }else{
            int maxDiff = array[1] - array[0];
            int minElement = array[0];
            for(int i=0; i<array.length;i++){
                if(array[i]>minElement){
                    int diff = array[i] - minElement;
                    if(diff > maxDiff){
                        maxDiff = diff;
                    }
                }else{
                    minElement = array[i];
                }
            }
            return maxDiff;
        }

    }
}
