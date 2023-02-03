import java.util.Scanner;

public class Pattern2 {
    // pattern 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) { // how many rows
            for (int j = 1; j <= n; j++) { // how many col
                // for making
//                1111
//                2222
//                3333
//                System.out.println(i); // what to print
//                System.out.print(j);
                System.out.print(n- j + 1 ); // 4 - 1 + 1, 4 - 2 + 1
            }
            System.out.println();
        }
    }
}
