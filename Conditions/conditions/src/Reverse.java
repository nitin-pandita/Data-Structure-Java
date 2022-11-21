import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a Number: ");

        int input = in.nextInt();

        int ans =0;

        while(input > 0){
            int rem = input % 10;

            input /= 10;

            ans = ans *10 + rem;
        }
        System.out.println(ans);
    }
}
