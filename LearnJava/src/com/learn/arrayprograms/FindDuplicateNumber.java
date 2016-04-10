package com.learn.arrayprograms;

import java.util.HashSet;

/**
 * Created by nkagale on 3/15/16.
 */
public class FindDuplicateNumber {
    public static void main(String arg[]){
        int[] arr = new int[]{1, 2, 3, 4, 5, 5, 6, 7, 7};
        findDuplicate(arr);
    }

    public static void findDuplicate(int ar[]){
        if(ar.length <=1){
            System.out.println("No duplicate values");
        }else if((ar.length == 2) && (ar[0] == ar[1])){
            System.out.println("Duplicate value is " + ar[0]);
        }else{
            HashSet hashSet = new HashSet();
            for(int i=0; i<ar.length; i++){
                try{
                    if(!hashSet.contains(ar[i])){
                        hashSet.add(ar[i]);
                    }else{
                        System.out.println("Duplicate entry found " + ar[i]);
                    }

                }catch(Exception ex){
                    System.out.println("Duplicate entry found " + ar[i]);
                }
            }

        }


    }

}
