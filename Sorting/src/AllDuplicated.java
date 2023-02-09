import java.util.ArrayList;
import java.util.List;

public class AllDuplicated {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }

    static List<Integer> findDuplicates(int[] nums) {
// Cyclic sort algorithm
        for (int i = 0; i < nums.length; ) {
            int CorrectIndex = nums[i] - 1;
            if (nums[i] != nums[CorrectIndex]) { // if arr[i] was equal to n then skip
                // swap values
                int temp = nums[i];
                nums[i] = nums[CorrectIndex];
                nums[CorrectIndex] = temp;
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<Integer>(); // Array list to store the missing element in list type
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {// index + 1 means if the number is at the correct index as index = value -1
                // so number will be index + 1
                ans.add(nums[index]); // add function of ArrayList

            }
        }
        return ans;
    }
}

