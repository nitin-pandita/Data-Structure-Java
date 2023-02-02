import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {

        // pattern 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");
        int n = sc.nextInt();
        int row = 1;

        for (int i = 1; i <= n; i++) { // row ka liya
            for (int j = 1; j <= n; j++) { // col
                System.out.print("*");
            }
            System.out.println();
        }
        }

}