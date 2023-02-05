import org.w3c.dom.html.HTMLAreaElement;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
//        int [] arr = {7,2,5,10,8};
//        int piece = 2;
//        int target = 18;
//        System.out.println((floor(arr,target)));
//        System.out.println(splitArray(arr,piece));
        int [] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr,target));

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
//static int floor(int [] arr , int target){
//    int start = 0;
//    int end = arr.length -1;
//
//    while(start <= end){
//        int mid = start + (end - start)/2;
//
//        if(arr[mid] == target){
//            return mid;
//        }
//        if(target < arr[mid+1]){
//            return mid+1;
//        }
//        return start;
//    }
//    return -1;
//    ---------------------------------------------------
//    static int splitArray(int [] arr,int k){
//        int start = 0;
//        int end = 0;
//
//        // for making a range
//        for (int j : arr) {
//            int max = Math.max(start, j); // min ans
//            end += j;
//        }
//
//        while(start < end){
//            int mid = start + (end - start)/2;
//            int sum = 0;
//            int piece = 1;
//
//            for (int num:arr
//                 ) {
//                if(sum + num > mid){
//                    // create new array
//                    sum = num;
//                    piece++;
//                }else{
//                    sum += num;
//                }
//            }
//            if(piece > k){
//                start = mid +1;
//            }else{
//                end = mid;
//            }
//        }
//        return start;
//----------------------------------------------------------------
static int search(int[] arr, int target){
        int pivot = findPivot(arr);
        // array is not rotated;
    if(pivot == -1){
        return binarySearch(arr,target,0,arr.length-1);
    }
    if(arr[pivot] == target){
        return pivot;
    }if(target > arr[0]){
        return binarySearch(arr,target,0,pivot-1);
    }else{
        return binarySearch(arr,target,pivot+1,arr.length-1);
    }
}
    static int findPivot(int [] arr){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start +( end - start)/2;

            if(mid < end && arr[mid] >= arr[mid +1]){
                return mid;
            }
            if(mid > start && arr[mid] <= arr[mid -1]){
                return  mid -1;
            }
            if(arr[start] >= arr[mid]) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;

}
static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid +  1;
            }else{
                return mid;
            }
        }
        return -1;
}
}
