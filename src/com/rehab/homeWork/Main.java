package com.rehab.homeWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Task 1 : rectangle area

        int length = 2;
        int width = 5;
        int area = length * width;
        System.out.println(area);

        // task 2 : (BMI)

        double wieght = 69;
        double height = 1.64;
        double bodyMassIndex = wieght / (height * height);
        System.out.println(bodyMassIndex);

        // Task 3 : Temperature Converter

        double c = 26;
        // // Variable (c) means temperature in Celsius
        double f = (9 / 5) * c + 32;
        System.out.println(f);

        // Task 4 : Max (int) value + 1

        int max = 2147483647;
        int extraMax = max + 1;
        System.out.println(extraMax);

        // Task 5 : Rounding a number

        double v = 99.12345;
        int s = (int) v;
        System.out.println(v);
        System.out.println(s);

        // task 6 : Checking age

        boolean isGreater;
        int age = 36;
        isGreater = age >= 18;
        System.out.println(isGreater);

        // task 7 : Encryption of symbols

        char firstChar = 'm';
        char secondChar = (char) ((firstChar) + 5);
        System.out.println(firstChar);
        System.out.println(secondChar);

        // task 8 : Data processing

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = a + b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);

    }
}
