package Assignments;

import java.util.Scanner;

public class Substract_Product_Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N: ");

        int n = sc.nextInt();
        int product = 1; // because if we take product zero then everything will be zero
        int sum = 0; // sum to store the sum value
        while (n > 0) {

            product *= n % 10; // take the last value
            sum += n % 10; // take the last value

            n /= 10; // remove the last value
        }
        int result = product - sum;
        System.out.println("The Ouput is: " + result);
    }
}