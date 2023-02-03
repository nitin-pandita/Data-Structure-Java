import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // first we will print the spaces and then the remaining stars
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) { // for printing spaces
                System.out.print(" ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*"); // for printing stars
            }
            System.out.println();
        }
    }
}
