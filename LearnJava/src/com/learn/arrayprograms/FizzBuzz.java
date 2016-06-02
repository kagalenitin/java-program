package com.learn.arrayprograms;

/**
 * Created by nkagale on 4/13/16.
 */
public class FizzBuzz {
    public static void main(String arg[]){
        for(int i = 1; i <= 100; i++){
            String test = "";
            test += (i % 15) == 0 ? "fizzbuzz" : "";
            test += (i % 3) == 0 ? "fizz" : "";
            test += (i % 5) == 0 ? "buzz" : "";
            System.out.println(!test.isEmpty() ? test : i);
        }
    }
}
