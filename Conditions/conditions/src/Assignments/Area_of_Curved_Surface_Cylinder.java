package Assignments;

import java.util.Scanner;

public class Area_of_Curved_Surface_Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the Radius of Cylinder: ");
        float radius = sc.nextFloat();
        System.out.print("Enter the Height of Cylinder: ");
        float height = sc.nextFloat();


        float area = (2 * 3.14159f * radius) * height;

        System.out.println(area);

    }



}
