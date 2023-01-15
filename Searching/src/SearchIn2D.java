import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,6,7},
                {11,34,78},
                {78,45,23,657}
        };
        int target = 34;
        int [] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int [][] arr, int target){
        // iterate in the 2d array
        for (int row = 0; row < arr.length; row++) {
            // now iterating the column
            for (int col = 0; col < arr[row].length; col++) {

                if(arr[row][col] == target){
                    return new int[] {row,col}; // here we are creating new object to store the value in it

                }
            }
        }
        return new int[] {-1,-1};
    }
}
