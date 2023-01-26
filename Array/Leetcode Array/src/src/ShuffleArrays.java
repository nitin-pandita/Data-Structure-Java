package src;

import java.util.Arrays;

public class ShuffleArrays {
    public static void main(String[] args) {
        int [] arr = {2,5,1,3,4,7};
        int size = 3;
        int [] ans = shuffle(arr,size);
        System.out.println(Arrays.toString(ans));
    }
    static int [] shuffle(int[] arr, int n){
        int [] ans = new int[2*n];

        for (int i = 0; i < n; i++) {

            ans[2 * i] = arr[i]; // updating the new array with old array
            // it consists of 2n elements as given

            ans[2 * i + 1] = arr[n + i]; // n + i matlab y vala elements
            // upar vala sa huma phala element mila usa aga vala ka huma isa milaga
        }
        return ans;
    }
}
