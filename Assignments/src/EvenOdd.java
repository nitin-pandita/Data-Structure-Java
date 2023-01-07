import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        boolean ans = EvenOdd(n);
        System.out.println(ans);

    }
    static boolean EvenOdd(int k){
        return k % 2 == 0;
    }
}
