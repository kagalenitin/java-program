package com.learn.arrayprograms;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SumOfElementsInArray sumOfElementsInArray = new SumOfElementsInArray();
        int arraySize = 0;
        try{

            System.out.println("Tokenized Array");
            sumOfElementsInArray.spaceSepeartedInput();

            String inputValue =sumOfElementsInArray.readArrayInputSize();
            if(inputValue !=null){
                arraySize = Integer.parseInt(inputValue);
                System.out.println(arraySize + " is the size of array");
            }

            sumOfElementsInArray.inputArrayElements(arraySize);
            if(sumOfElementsInArray.inputFailed){
                System.out.println("The program failed");
            }else{
                sumOfElementsInArray.printArray();
                System.out.println("The sum of array is: " + sumOfElementsInArray.sumOfArray());
            }

            System.out.println("The max value in array is: " + sumOfElementsInArray.maxOfArray());

            System.out.println("================= Long ====================");
            sumOfElementsInArray.inputLongArray(arraySize);
            sumOfElementsInArray.printLongArray();
            System.out.println("The sum of array is: " + sumOfElementsInArray.sumOfLongArray());

        }catch(Exception ex){
            System.out.println("Wrong Input");
        }

    }
}
