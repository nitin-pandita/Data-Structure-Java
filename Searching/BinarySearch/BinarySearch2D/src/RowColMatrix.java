import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int [][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {33,34,38,50}
        };
        int target = 38;
        int [] ans = searching(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    static int [] searching(int [][] arr,int target){
//        int r = 0;
//        int c = arr.length -1;

        // method 1
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if(arr[r][c] == target){
                    return new int[]{r,c};
                }
                if(arr[r][c] < target){
                    r++;
                }else{
                    c--;
                }
            }
        }
        // method 2
//        while (r < arr.length && c >= 0 ){
//            if(arr[r][c] == target){
//                return new int[]{r,c};
//            }
//            if(arr[r][c] < target){
//                r++;
//            }else{
//                c--;
//            }
//        }
        return new int[]{-1,-1};
    }
}
