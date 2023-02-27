package com.bridgelabz.functional_programs;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        System.out.println("Welcome to distance calculator");
        Distance distance = new Distance();
        int[] array = distance.getPoint();
        distance.getDistance(array);
    }

    void getDistance(int[] array) {
        double distance = Math.sqrt(Math.pow(array[0], 2) + Math.pow(array[1], 2));
        System.out.println("Distance is equal to: " + distance);
    }

    int[] getPoint() {
        int[] array = new int[2];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x of point");
        array[0] = input.nextInt();
        System.out.println("Enter y of point");
        array[1] = input.nextInt();
        return array;
    }
}
