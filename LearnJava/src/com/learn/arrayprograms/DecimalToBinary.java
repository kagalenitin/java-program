package com.learn.arrayprograms;

/**
 * Created by nkagale on 3/15/16.
 */
public class DecimalToBinary {
    public static void main(String arg[]){
        decimalToBinary(12);
    }

    public static void decimalToBinary(int number){
        StringBuffer stringBuffer = new StringBuffer();
        while(number>0){
            stringBuffer.append(number%2);
            number = number / 2;
        }
        System.out.println(stringBuffer.reverse());
        System.out.println("Binary equivalent of "+ number);
    }

}
