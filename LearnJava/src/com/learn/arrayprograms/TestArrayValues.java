//package com.learn.arrayprograms;
//
//import java.lang.Integer;import java.lang.NumberFormatException;import java.lang.String;import java.lang.System;import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
///**
// * Created by nkagale on 2/27/16.
// */
//public class TestArrayValues {
//
//    public static void main(String args[]){
//
//        int arraySize = 0;
//        String inputValue;
//        Scanner reader = new Scanner(System.in);
//        int inputInt = Integer.parseInt(getUserInput(reader, "Enter an integer Value (0<n<1000): "));
//
//        System.out.println("The array size is " + inputInt);
//
//        int[][] dynamicArray = makeAnNDimensionalArray(inputInt);
//
//        System.out.println("Print the array input values");
//        for(int row=0; row<inputInt; row++){
//            for (int col=0; col<inputInt; col++){
//                System.out.print(dynamicArray[row][col]+ " ");
//            }
//            System.out.println();
//        }
//
//        calculateSurroundingBlocks(dynamicArray);
//    }
//
//    public static int calculateSurroundingBlocks(int[][] arrayForCalculation){
//        int sumDiagonalOne = 0;
//        for(int i=0; i<arrayForCalculation.length; i++){
//            for(int j=0; j<arrayForCalculation.length; j++){
//                if(i==j){
//                    sumDiagonalOne = sumDiagonalOne + (arrayForCalculation[i][j]);
//                }
//            }
//        }
//        return sumDiagonalOne;
//    }
//
//
//    public static int[][] makeAnNDimensionalArray(int arraySize){
////        List arrayList = new ArrayList(arraySize);
//        //Currently dealing with 3x3 array size only
//        int[][] nDimensionalArray = new int[arraySize][arraySize];
//        Scanner in = new Scanner(System.in);
//
//        for(int row=0; row<nDimensionalArray.length; row++){
//            for(int col = 0; col < nDimensionalArray.length; col++){
//                int inputInt = Integer.parseInt(getArrayValueInput(in, "Enter the values in array (0 and 1) only: "));
//                nDimensionalArray[row][col] = inputInt;
//                System.out.print("Inserting value at position " + nDimensionalArray[row][col] + " for " + inputInt+" ");
//            }
//            System.out.println();
//        }
//
//        return nDimensionalArray;
//    }
//
//
////    public static String getArrayValueInput(Scanner reader, String getValue){
////        System.out.println(getValue);
////        String arrVal = null;
////        int count=0;
//////        while(count<2){
////        arrVal = reader.nextLine();
////        if(checkInputIsInteger(arrVal)){
////            if((Integer.parseInt(arrVal)==0) || (Integer.parseInt(arrVal)==1)){
////                break;
////            }
//////                System.out.println("Try again: Should be a (0 or 1)");
////            count++;
////        }
////
//////        }
////        return arrVal;
////    }
//
//    public static String getUserInput(Scanner reader, String getValue){
//        System.out.println(getValue);
//        String inputValue = null;
//        int count=0;
//        while(count<3){
//            inputValue = reader.nextLine();
//            if(checkInputIsInteger(inputValue)){
//                if((Integer.parseInt(inputValue)>0) && (Integer.parseInt(inputValue)<=1000)){
//                    break;
//                }
//
//            }
//            System.out.println("Try again: Should be a number<1000");
//            count++;
//        }
//        return inputValue;
//    }
//
//    public static boolean checkInputIsInteger(String str) { // Check if string is integer
//        try {
//            Integer.parseInt(str); // If this doesn't fail then it's integer
//            return true;
//        } catch(NumberFormatException e) {
//            return false; // Wasn't integer
//        }
//    }
//}
