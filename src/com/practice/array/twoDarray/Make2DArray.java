package com.practice.array.twoDarray;

public class Make2DArray {
    public static void main(String[] args) {
        int row= 3;
        int column =4;
        int arr[][] = new int[row][column];
        int c =1;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j] =c++;
            }
        }
        for(int i=0;i< row;i++){
            for(int j=0;j< column;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
