public class RotatedArray {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr,target));
    }
    static int search(int[] nums, int target) {
            // in this we are have 3 cases
        int pivot = findPivot(nums);
        if(pivot == -1){ // it means the array is not rotated
            return BinarySearch(nums,target,0,nums.length-1);
        }
        // case 1;
        if(nums[pivot] == target){
            return pivot;
        }
        // case 2;
        if(target >= nums[0]){
            return BinarySearch(nums,target,0,pivot-1);
        }else{
            return BinarySearch(nums,target,pivot+1,nums.length -1);
        }
    }
    static int BinarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2; // in some cases the size may exceed for larger values so we use
            // an optimize way to find the middle element

            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    static int findPivot(int [] arr){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start +(end - start)/2;
            // there will be four cases
            // case 1"
            if(mid < end && arr[mid] > arr[mid +1]){ // what if the last element is mid
                return mid;
            }
            // case 2;
            if(mid > start && arr[mid] < arr[mid -1]){
                return mid -1;
            }
            // case 3;
            if(arr[start] >= arr[mid]) {
                end = mid - 1;
                // case 4;
            }else{
                start = mid +1;
            }
        }
        return -1;
    }
}
