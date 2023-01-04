package Assignments;

import java.util.Scanner;

public class findgreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int my = sc.nextInt();

        int max = 0;

        while(my != 0){
            System.out.println("Enter the Number and press 0 to exit");
            my = sc.nextInt();

            if(my > max){
                max = my;
            }
        }
        System.out.println("The maxium number is: "+max);
    }
}
