import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int k){
        if (k < 1){
            return false;
        }
        int c = 2;
        while(c * c <= k){
            if(k % c == 0){
                return false;
            }
            c++;
        }
        return c * c > k;
    }

}
