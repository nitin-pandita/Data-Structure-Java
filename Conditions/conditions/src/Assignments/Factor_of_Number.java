package Assignments;

import java.util.Scanner;

public class Factor_of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number for Factor: ");

        int input = sc.nextInt();

        for(int i = 1; i <= input; i++){

            if(input % i == 0){ // 60 % 1,2,3,4,5,6,7,8,9..... == 0
                System.out.println(i+ " ");
            }
        }
    }
}
