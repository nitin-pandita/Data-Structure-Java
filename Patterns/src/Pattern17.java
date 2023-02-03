import java.util.Scanner;
//      1
//    1 2 1
//   1 2 3 2 1
// 1 2 3 4 3 2 1
//
//
public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // number of rows
            for (int spaces = 1; spaces <=n-i ; spaces++) {
                System.out.print(" ");
            }
            int p = 1;
            for (int j = 1; j <= i ; j++) { // increment the first half
                System.out.print(p);
                p++;
            }
            p = i -1; // decreasing the numbers
            for (int j = 1; j <= i -1; j++) { // decrement the first half
                System.out.print(p);
                p--;
            }
            System.out.println();

        }
    }
}
