package com.learn.arrayprograms;

/**
 * Created by nkagale on 3/22/16.
 */
public class ArmstrongNumber {
    public static void main(String arg[]){
        System.out.println("Is 523 an Armstrong number? " + isArmstrong(523));
        System.out.println("Is 37 an Armstrong number? " + isArmstrong(37));
        System.out.println("Is 153 an Armstrong number? " + isArmstrong(153));
    }

    public static boolean isArmstrong(int number){
        boolean isArmStrong=false;

        int temp = number;
        int val;
        int cnt =0, sum=0;
        while(number>0){
            val = number % 10;
            number = number / 10;
            sum = sum + (val * val * val);
        }

        if(sum == temp){
            isArmStrong = true;
        }

        return isArmStrong;
    }
}
