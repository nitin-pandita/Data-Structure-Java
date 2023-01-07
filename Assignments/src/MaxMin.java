import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the third Number: ");
        int num3 = sc.nextInt();

        int ans = maxmin(num1,num2,num3);
        System.out.println("The greatest number is: "+ans);

    }
    static int maxmin(int a,int b,int c){
        if(a >  b && a > c){
            return a;
        }
        else if (b > a && b > c){
            return b;
        }
        else {
            return c;
        }
    }
}
