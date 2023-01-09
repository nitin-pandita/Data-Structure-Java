import java.util.Scanner;

public class MutliDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int [][] arr = new int[4][3]; // initialised the number of row and column
//
//        // for taking the row we use firs loop
//        for (int row = 0; row < arr.length; row++) {
//            // for taking the column in the row
//            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col] = sc.nextInt();
//            }
//        }
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        int [][] arr = new int[2][3];

        // Input
        for (int row = 0; row < arr.length; row++) {
            // for row in col
            for (int col = 0; col < arr[row].length; col++) {
                // jitni row ki lenght hogyi utna mujhe column chiya
                arr[row][col] = sc.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
    }
}
