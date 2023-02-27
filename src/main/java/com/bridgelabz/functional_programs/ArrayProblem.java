package com.bridgelabz.functional_programs;

import java.util.Scanner;

public class ArrayProblem {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to two dimensional array");
        ArrayProblem arrayProblem = new ArrayProblem();
        System.out.println("Please enter no of rows for array");
        int rows = arrayProblem.input.nextInt();
        System.out.println("Please enter no of columns for array");
        int columns = arrayProblem.input.nextInt();
        int[][] array = arrayProblem.getArray(rows, columns);
        arrayProblem.printArray(array, rows, columns);

    }

    void printArray(int[][] array, int rows, int columns) {
        System.out.println("Two dimensional array is :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }

    }

    int[][] getArray(int rows, int columns) {
        int[][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter element of array");
                array[i][j] = input.nextInt();
            }

        }

        return array;
    }
}