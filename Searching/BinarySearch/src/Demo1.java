import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int [] arr = {5,7,9,18,28,30};
        int target = 18;
        System.out.println((floor(arr,target)));
    }
//    static int[] searchRange(int[] nums, int target) {
//        int [] ans = {-1,-1};
//        int start = search(nums,target,true);
//        int end = search(nums,target,false);
//
//        ans[0] = start;
//        ans[1] = end;
//
//        return ans;
//    }
//
//    static int search(int [] nums, int target, boolean Leftside){
//        int ans = -1;
//        int start = 0;
//        int end = nums.length -1;
//        while(start <= end){
//            int mid = start + (end - start)/2;
//            if(target < nums[mid]){
//                end = mid - 1;
//            } else if (target > nums[mid]) {
//                start = mid + 1;
//            }else{
//                ans = mid;
//                if(Leftside){
//                    end = mid - 1;
//                }else{
//                    start = mid + 1;
//                }
//            }
//        }
//        return ans;
//    }
static int floor(int [] arr , int target){
    int start = 0;
    int end = arr.length -1;

    while(start <= end){
        int mid = start + (end - start)/2;

        if(arr[mid] == target){
            return mid;
        }
        if(target < arr[mid+1]){
            return mid+1;
        }
        return start;
    }
    return -1;
}
}
