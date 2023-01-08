import java.util.Scanner;

public class Palindorome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for Palindorone"); // Palindrome means reverse of a number is the same as original number

        int n = sc.nextInt();

        boolean ans  = palin(n);
        System.out.println(ans);

    }
    static boolean palin(int number){
        int original = number;
        while(number > 0){
            int rem = number % 10;

            number = number / 10;

            int sum = rem  + 0;
        }
        return original == number;
    }
}
