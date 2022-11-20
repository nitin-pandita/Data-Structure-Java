import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Nth Number: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2; // because we have 2 values already, so we have to take the third index.
        while(count <= n){

            int temp = b; //
            b = b + a; // changing the value of b to new number.
            a = temp; // changing the value of a to b
            count++;

        }
        System.out.println(b);


    }

}
