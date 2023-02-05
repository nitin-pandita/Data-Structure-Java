import java.util.ArrayList;
import java.util.List;


public class FindMissingNumber {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        // from 1 to n means apply cyclic sort
        for (int i = 0; i < nums.length; ) {
            int CorrectIndex = nums[i]-1;
            if (nums[i] <= nums.length && nums[i] != nums[CorrectIndex]) { // if arr[i] was equal to n then skip
                // swap values
                int temp = nums[i];
                nums[i] = nums[CorrectIndex];
                nums[CorrectIndex] = temp;
            } else {
                i++;
            }
        }
        // checking the missing number
        List<Integer> ans = new ArrayList<Integer>(); // Array list to store the missing element in list type
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {// index + 1 means if the number is at the correct index as index = value -1
                // so number will be index + 1
                ans.add(index + 1); // add function of ArrayList

            }
        }

        // case 2 if the n is not present in the array
        return ans;
    }
    }

