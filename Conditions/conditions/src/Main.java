import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter three numbers: ");

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;

        if (b > max){
            max = b;
        }
        if (c > max){
            max= c;
        }
        System.out.println("The greatest Number is: "+max);


    }
}