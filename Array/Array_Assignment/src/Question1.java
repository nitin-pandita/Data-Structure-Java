import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        // build an array from Permutation
        int[] nums = {0, 2, 1, 5, 3, 4};

         buildArray(nums);
        System.out.println(Arrays.toString(nums));
        }
    static int[] buildArray(int [] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums[i]];


        }
        return arr;

    }

}
