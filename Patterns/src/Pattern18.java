import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        // star pattern
//        *
//       ***
//      *****
//     *******

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i ; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i -1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
