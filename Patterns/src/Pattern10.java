import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int startingvalue = 'A'+ i - 1;
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(startingvalue));
                startingvalue++;
            }
            System.out.println();
        }
    }
}
