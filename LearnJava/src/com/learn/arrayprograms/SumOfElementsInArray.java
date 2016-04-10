package com.learn.arrayprograms;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by nkagale on 3/4/16.
 */
public class SumOfElementsInArray {
    int[] arraySize;
    static boolean inputFailed = false;
    Scanner scanner = new Scanner(System.in);

    long[] longArraySize;
    /*
        Read the ArrayInput Size
     */
    public String readArrayInputSize(){
        String returnValue = null;

        System.out.println("Enter the size of Array (size<10): ");
        returnValue = scanner.nextLine();

        //Check if input is Integer
        if(checkInputIsInteger(returnValue)){
            //Check the array size is <=10
            if((Integer.parseInt(returnValue)>=0) && (Integer.parseInt(returnValue)<10)){
                return returnValue;
            }else{
                System.out.println("Max. array size is 10");
            }
        }else{
            System.out.println("Enter Integer value");
        }

        return null;
    }

    /*
        Check if Input is Integer
     */
    public boolean checkInputIsInteger(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch(NumberFormatException ex){
            return false;
        }
    }
    /*
        Check if Input is Long
     */
    public boolean checkInputIsLong(String str){
        try{
            Long.parseLong(str);
            return true;
        }catch(NumberFormatException ex){
            return false;
        }
    }

    public void inputArrayElements(int size){
        arraySize = new int[size];
        String val = null;
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at " + (i+1) + " location: ");
            val =  scanner.nextLine();
            //Check if value is integer
            if(checkInputIsInteger(val)){
                arraySize[i] = Integer.parseInt(val);
            }else{
                inputFailed = true;
                System.out.println("Sorry, Only integer values allowed");
                break;
            }
        }
    }

    public void printArray(){
        if(arraySize !=null){
            System.out.println("Elements in the array:> ");
            for(int cnt=0; cnt< arraySize.length; cnt++){
                System.out.print(arraySize[cnt]+ " ");
            }
            System.out.println("");
        }
    }

    public int sumOfArray(){
        int sum=0;
        for(int cnt=0; cnt<arraySize.length;cnt++){
            sum = sum + arraySize[cnt];
        }

        return sum;
    }

    public int maxOfArray(){
        int max = arraySize[0];
        for(int i=1; i<arraySize.length; i++){
            if(arraySize[i]>max){
                max = arraySize[i];
            }
        }
        return max;
    }

    public void inputLongArray(int size){
        longArraySize = new long[size];
        String val = null;
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at " + (i+1) + " location: ");
            val =  scanner.nextLine();
            //Check if value is integer
            if(checkInputIsLong(val)){
                longArraySize[i] = Long.parseLong(val);
            }else{
                inputFailed = true;
                System.out.println("Sorry, Only long values allowed");
                break;
            }
        }
    }

    public void printLongArray(){
        if(longArraySize !=null){
            System.out.println("Elements in the array:> ");
            for(int cnt=0; cnt< longArraySize.length; cnt++){
                System.out.print(longArraySize[cnt]+ " ");
            }
            System.out.println("");
        }
    }

    public long sumOfLongArray(){
        long sum=0;
        for(int cnt=0; cnt<longArraySize.length;cnt++){
            sum = sum + longArraySize[cnt];
        }

        return sum;
    }

    public void spaceSepeartedInput(){
        System.out.println("Enter a space input of size 4>");
        String val =  scanner.nextLine();
        StringTokenizer strToken = new StringTokenizer(val);
        int count = strToken.countTokens();

        int[] tokenArray = new int[count];
        for(int xx=0; xx<count; xx++){
            tokenArray[xx]= Integer.parseInt((String)strToken.nextToken());
        }
        for(int cnt=0; cnt< count; cnt++){
            System.out.println(tokenArray[cnt]);
        }
    }
}
