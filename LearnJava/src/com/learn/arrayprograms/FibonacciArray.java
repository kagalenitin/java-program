package com.learn.arrayprograms;

/**
 * Created by nkagale on 3/7/16.
 */
public class FibonacciArray {
    public static void main(String args[]){

        int[] arr = fibonacci(0);
        if(arr!=null){
            if(arr.length<1){
                System.out.println("Sorry");
            }
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+ " ");
            }
        }

    }

    static int[] fibonacci(int n){
        if((n<=1) || (n>10)){
            return new int[0];
        }else{
            int[] fibo = new int[n];

            fibo[0] = 0;
            fibo[1] = 1;
            for(int i=2; i<n; i++){
                fibo[i] = fibo[i-1] + fibo[i-2];
            }
            return fibo;
        }
    }
}
