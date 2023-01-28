import java.util.Arrays;

public class RunningSum1D {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int [] ans = runningSum(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] runningSum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // updating the array
            arr[i] = arr[i] + arr[i -1];
            // second index     // previous index
        }
        return arr;
    }}
