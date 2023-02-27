package com.bridgelabz.functional_programs;

import java.util.Scanner;

public class ArrayTriples {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayTriples arrayTriples = new ArrayTriples();
        System.out.println("Enter no of elements you want in array");
        int noOfElements = arrayTriples.input.nextInt();
        int[] array = arrayTriples.getArrayInput(noOfElements);
        arrayTriples.checkForTriplesEqualsZero(array);
    }

    void checkForTriplesEqualsZero(int[] array) {
        int triplesCount = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.println("Triples are: " + array[i] + " " + array[j] + " " + array[k]);
                        triplesCount++;
                    }

                }

            }

        }

        System.out.println("No of triples in an array are: " + triplesCount);
    }

    int[] getArrayInput(int noOfElements) {
        int[] array = new int[noOfElements];
        for (int i = 0; i < noOfElements; i++) {
            System.out.println("Enter element");
            array[i] = input.nextInt();
        }

        return array;
    }
}
