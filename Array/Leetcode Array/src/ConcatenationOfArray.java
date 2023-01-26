import java.util.Arrays;

public class ConcatenationOfArray {
    // Concatenation meaning adding
    public static void main(String[] args) {
        int [] arr = {1,2,1};
        int [] ans = getConcatenation(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n * 2];

        for (int i = 0; i < nums.length; i++) {
            // we are adding number from both side
            //it will add the number from left side
            ans[i] = nums[i];
             ans[i+n] = nums[i]; // add number from right side
            }
        return ans;

    }
    }

