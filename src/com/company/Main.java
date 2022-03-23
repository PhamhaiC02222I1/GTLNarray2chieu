package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so dong: ");
        int row=input.nextInt();
        System.out.println("nhap so cot: ");
        int column=input.nextInt();
        int[][] matrix=new int[row][column];

//
        for ( int i = 0; i < row;i++) {
            for ( int j = 0; j < column; j++) {
                System.out.print("Nhap phan tu thu ["+i+","+j+"]: ");
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Mang vua nhap: ");
        for ( int i = 0; i < row;i++) {
            for ( int j = 0; j < column; j++) {
                System.out.print(matrix[i][j]+ "\t");
            }
            System.out.println("");
        }
        System.out.printf("GTLN la: "+max(matrix,row,column));
    }
    public static int max(int[][] matrix,int row,int column){
        int max=matrix[0][0];
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                if (matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }
        }return max;
    }
}
