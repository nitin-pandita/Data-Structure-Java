import java.util.Scanner;

public class Pattern5_ReverseTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i-j+1); // 1 - 1 + 1 = 1, 2 - 1 + 1 = 2

            }
            System.out.println();
        }
    }
}
