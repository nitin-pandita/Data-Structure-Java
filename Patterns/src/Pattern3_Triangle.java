import java.util.Scanner;

public class Pattern3_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int startingNumber = i; // as the starting index should be same
            for (int j = 1; j <= i; j++) {
                System.out.print(startingNumber);
                startingNumber++; // increase the number
            }
            System.out.println();
        }
    }
}
