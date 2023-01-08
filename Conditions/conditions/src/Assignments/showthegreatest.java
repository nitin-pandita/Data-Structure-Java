package Assignments;

import java.util.Scanner;

public class showthegreatest {
    public static void main(String[] args){
        System.out.print("Enter a Number to get started: ");
        Scanner in = new Scanner(System.in);

        int start = in.nextInt();

        int max = 0;
        while(start != 0){

            System.out.println("Enter Number and Press 0 to exit: ");
            start = in.nextInt();

            if(start > max) {
                max = start;
            }

        }
        System.out.println("The greatest Number is: "+max);

    }
}


