import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            int startingChar = 'A' + i - 1;
            for (int j = 1; j <=n; j++) {

                System.out.print((char)(startingChar));

                startingChar++;
            }
            System.out.println();
        }
    }
}
