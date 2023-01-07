import java.util.Scanner;

public class SumOfNnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        int ans = sum(n);
        System.out.println("The sum of Numbers are: "+ans);
    }
    static int sum(int num){
        int sum = 0;
        for (int i = 0; i <=num; i++) {
            sum += i;
        }
        return sum;
    }
}
