package com.learn.arrayprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by nkagale on 3/7/16.
 */
public class StairCase {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int _n;
        _n = Integer.parseInt(in.nextLine().trim());

        if((_n<1) || (_n>100)){
            System.out.println("Sorry! The staircase is out of range");
        }else{
            for(int i=1; i<=_n; i++){
                for(int j=1; j<=_n; j++){
                    if((i+j)>_n){
                        System.out.print("#");
                    }else{
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }

//        String [] someArray = new String[]{"A", "B", "C", "A", "B", "C"};
//        Map<String,Integer> repeatationMap= new HashMap<String,Integer>();
//        for(String str : someArray){
//
//            if(repeatationMap.containsKey(str)) {
//                repeatationMap.put(str,repeatationMap.get(str) + 1);
//            }
//            else {
//                repeatationMap.put(str, 1);
//            }
//        }
//
//        int count = 0;
//        for(int repatCount : repeatationMap.values()){
//            if(repatCount > 1) {
//                count++;
//            }
//        }
//        System.out.println("Number of Strings repeated : " + count);
//
//        int[] someArray1 = new int[] {1, 1, 3, 4, 2, 5, 8, 8, 2};
//        System.out.println("Count of duplicates " + countDuplicates(someArray1));
//    }
//
//    static int countDuplicates(int[] numbers) {
//        int count = 0;
//        if(numbers.length<=0){
//            return count;
//        }else{
//            Map<Integer, Integer> duplicateCount = new HashMap<Integer, Integer>();
//            for(int rpt : numbers){
//                if(duplicateCount.containsKey(rpt)){
//                    duplicateCount.put(rpt, duplicateCount.get(rpt) + 1);
//                }else{
//                    duplicateCount.put(rpt, 1);
//                }
//
//            }
//            for(int repeatCount : duplicateCount.values()){
//                if(repeatCount > 1){
//                    count++;
//                }
//            }
//
//            return count;
//        }
//
    }


}
