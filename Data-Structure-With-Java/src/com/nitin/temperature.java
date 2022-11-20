package com.nitin;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celcius: ");
        float tempC = sc.nextFloat();

        float conversion = (tempC * 9/5) + 32;

        System.out.println("Temperature in Farenhatite is: "+conversion);



    }
}
