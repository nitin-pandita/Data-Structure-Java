import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {

//        int [][] num = new int[3][];
        Scanner sc  = new Scanner(System.in);
        // syntax
        // datatype [][] reference variable = new datatype [row][col];
        int [][] num =  new int[3][3];

        // input
        // length will take only row numbers
        for (int row = 0; row < num.length; row++) {
                for (int col = 0; col < num[row].length; col++){
                    num[row][col] = sc.nextInt();
                }
        }

        // output
        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++){
                System.out.print(num[row][col] + " ");
            }
            System.out.println();
        }


//        System.out.println(num[1][0]); // here we are accessing arr 1 and 0th element
    }
}
