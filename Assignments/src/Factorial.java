import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number for Factorial: ");
        int num = sc.nextInt();

        int ans = factorial(num);
        System.out.println("The factorial is: "+ans);
    }
    static int factorial(int n){
        int start = 1;
        int sum = 0;
        for (int i = 1; i <=n ; i++) {

            start = start * i;
        }
        return start;
    }
}
