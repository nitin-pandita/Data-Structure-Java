import java.util.Arrays;
import java.util.Scanner;

public class NoFixedCol {
    public static void main(String[] args) {

        int [][] arr = {
                {1,2,3,9},
                {4,5,6},
                {12,45,657,231,12}
        };

        // for iterating the outside row
        for (int row = 0; row < arr.length; row++) {
            // the number of row is the total no of col we want;
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
    }
}
