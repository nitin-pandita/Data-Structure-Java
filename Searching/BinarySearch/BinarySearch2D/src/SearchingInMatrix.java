import java.util.Arrays;

public class SearchingInMatrix {
    public static void main(String[] args) {
        int [][] arr= {
            {1,2,3},
            {45,91,23},
            {44,768,23}
        };
        int target = 768;
        int []ans = searching(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searching(int [][] arr, int target){
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if(arr[r][c] == target){
                    return new int[]{r,c};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
