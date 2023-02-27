package com.bridgelabz.functional_programs;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        System.out.println("Welcome to National Weather Service");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Temperature(in Fahrenheit):" + '\n' + "Note: Should be less than 50");
        int t = input.nextInt();
        System.out.println("Enter wind speed(in miles per Hour)" + '\n' + "Note: Range for speed is 3 to 120");
        int v = input.nextInt();
        WindChill windChill = new WindChill();
        windChill.getWindChillTemperature(t, v);
    }

    void getWindChillTemperature(int t, int v) {
        double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println("WindChill temperature is " + w);
    }
}
