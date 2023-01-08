package Functions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    boolean ans = ArmstrongNumber(n);
//        System.out.println(ans);
        // for three digit armstrong number
        for (int i = 1000; i <=9999 ; i++) {
            if (ArmstrongNumber(i)){
                System.out.println(i+ " ");
            }
        }
    }
    static boolean ArmstrongNumber(int j){
        int original = j;
        int sum = 0;
        while(j > 0){
            int rem = j % 10;
            int cube = rem*rem*rem;
            j = j / 10;
            sum += cube;
        }
        return sum == original;
    }

}
