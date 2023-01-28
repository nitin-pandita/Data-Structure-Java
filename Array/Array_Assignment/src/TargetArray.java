import java.util.ArrayList;
import java.util.Arrays;

public class TargetArray {
    public static void main(String[] args) {
        int [] nums = {0,1,2,3,4};
        int [] index = {0,1,2,2,1};

        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        // If there is only one element, return early.
        if(index.length == 1 ){
            return nums;
        }

        int[] target = new int[nums.length];
        ArrayList tempArr = new ArrayList();

        // Take advantage of ArrayList.add() so we don't have to
        // manually reorder array elements on each add().
        for(int i = 0;i<nums.length;i++){
            // this will shift the number forward and add the element in place of that
            tempArr.add(index[i],nums[i]);
            System.out.println(tempArr);
        }

        // Fill our int[] with the elements in our ArrayList
        for(int k = 0;k<tempArr.size();k++){
            // Because ArrayList.get() returns Object type, we have
            // type cast to an integer.
            target[k] = (Integer)tempArr.get(k);
        }
        return target;
    }

}
