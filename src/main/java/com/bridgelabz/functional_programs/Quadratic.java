package com.bridgelabz.functional_programs;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of a ");
        int a = input.nextInt();
        System.out.println("Enter value of b ");
        int b = input.nextInt();
        System.out.println("Enter value of c ");
        int c = input.nextInt();
        Quadratic quadratic = new Quadratic();
        quadratic.getRoots(a, b, c);
    }

    void getRoots(int a, int b, int c) {
        double delta = b * b - 4 * a * c;
        if (delta >= 0) {
            double rootOne = (-b + Math.sqrt(delta)) / (2 * a);
            double rootTwo = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Roots are " + rootOne + " & " + rootTwo);
        } else {
            System.out.println("Roots are not real values");
        }

    }
}
