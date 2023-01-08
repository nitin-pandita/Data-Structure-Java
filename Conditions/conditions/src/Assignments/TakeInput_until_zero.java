package Assignments;

import java.util.Scanner;

public class TakeInput_until_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to get start: ");

        int input = sc.nextInt();

        int sum = 0;
        while(input != 0){
            System.out.println("Enter a Number and press 0 to exit:  ");
            input = sc.nextInt();
            sum = sum + input;
        }
        System.out.println("The sum is: "+sum);



        }
}
