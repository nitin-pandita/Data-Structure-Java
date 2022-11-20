package com.nitin;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//
//        int sum = num1 + num2;
//
//        System.out.println("The Sum is: "+sum);
        // type casting
//        int num = (int)(89.4f);
//        System.out.println(num);

        byte a =45;
        int b = 3423;
        char c = 'a';
        short d = 1020;
        float e = 23.34f;
        double f = 32.23;
        double result = (f * e) + (d / c) + (b - a);
        System.out.println((f * e)+ " " + (d / c)+ " " + (b - a));
        System.out.println(result);
    }
}
