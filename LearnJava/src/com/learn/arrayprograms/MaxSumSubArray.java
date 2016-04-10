package com.learn.arrayprograms;
import java.lang.*;
/**
 * Created by nkagale on 3/15/16.
 */
public class MaxSumSubArray {

    public static void main(String arg[]){
        int[] arr = new int[]{3, -2, 5, 1, 9};
        System.out.println("The max. value of subarray is " + maxSumSubArrayDnC(arr, arr.length));
    }

    /*
    Brute Force method
     */
    public static int maximumSumSubArray(int ar[], int n){
        int ans = Integer.MIN_VALUE;

        for(int cnt=0; cnt<n; cnt++){
            int maximumSum = 0;
            for(int cnt1=1; cnt1<=n;cnt1++){
                if((cnt+cnt1)>n)
                    break;
                maximumSum+= ar[cnt + cnt1 -1];
                ans = Math.max(ans, maximumSum);
            }
        }
        return ans;
    }

    /*
        Divide and Conquer
     */
    public static int maxSumSubArrayDnC(int ar[], int n){
        int ans = Integer.MIN_VALUE;
        if(n==1){
            return ar[0];
        }
        int half = n/2;
        int leftMSS = 0;
        int rightMSS = 0;
        leftMSS = maxSumSubArrayDnC(ar, half);
        rightMSS = maxSumSubArrayDnC(ar, n-half);

        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        int sum=0;
        for(int i=half; i< n; i++){
            sum += ar[i];
            rightSum = Math.max(rightSum, sum);
        }
        sum=0;
        for(int i=(half-1); i>=0; i++){
            sum +=ar[i];
            leftSum = Math.max(leftSum, sum);
        }
        ans = Math.max(leftMSS, rightMSS);
        return Math.max(ans, leftSum+rightSum);
    }

    public static int maxArrayKadane(int ar[], int n){
        int ans=0, sum=0;
        for (int i=0; i<n; i++){
            if(sum + ar[i] >0)
                sum+=ar[i];
            else
                sum=0;
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
