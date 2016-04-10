package com.learn.arrayprograms;

/**
 * Created by nkagale on 4/8/16.
 */
public class MatrixTranspose {

    public static void main(String arg[]){
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        transpose(matrix);
    }

    public static void transpose(int[][] mat){
        for(int i=0; i<3; i++){
            for(int j=0; j<(i/2); j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        System.out.println("Print the matrix transpose");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
