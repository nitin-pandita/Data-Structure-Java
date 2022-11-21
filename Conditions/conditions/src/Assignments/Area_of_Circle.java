package Assignments;

import java.util.Scanner;

public class Area_of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Radius of Circle");

        float radius = sc.nextFloat();

        float area = 3.14f * (radius * radius);

        System.out.print("Area of Circle is: "+area);

    }
}
