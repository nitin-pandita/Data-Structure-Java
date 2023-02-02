import java.util.Scanner;

public class Pattern4_Triangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = sc.nextInt();
                    int counter = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter);
                counter++; // increase the number
            }
            System.out.println();
        }
//        int i = 1;
//        int counter = 1;
//
//        while(i <= n){
//            int j = 1;
//            while (j <= i){
//                System.out.print(counter);
//                counter++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
    }
}
