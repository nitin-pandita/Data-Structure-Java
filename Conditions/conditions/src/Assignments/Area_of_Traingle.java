package Assignments;

import java.util.Scanner;

public class Area_of_Traingle {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.println("Enter the Base of Triangle: ");

        float base = in.nextFloat();

        System.out.println("Enter the Height of Triangle: ");

        float height = in.nextFloat();

        float area = (height * base)/2;

        System.out.println(area);
    }
}
