package Functions;

import java.util.Scanner;

public class Function1 {
    public static void main(String[] args) {
        int ans = sum2();

        System.out.println(ans);
    }
    // return the value
//    int + int  = int
    static int sum2(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }
    static void sum(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum is :"+sum);
    }
// Syntax for functions
    /*
        return_type name() {
        //body
        return statement;
        }
    */
}
