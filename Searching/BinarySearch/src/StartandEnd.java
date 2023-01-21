import java.util.Arrays;

public class StartandEnd {
    public static void main(String[] args) {
        int [] arr = {5,7,7,8,8,10};
        int target = 8;
        int []ans = searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] arr, int target) {
        int [] ans = {-1,-1}; // if none of the element found in the array return -1,-1
        int start = search(arr,target,true);
        int end = search(arr,target,false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }
    static int search(int [] arr, int target, boolean Leftside){
        int ans = -1; // potential ans
        int start = 0;
        int end = arr.length - 1;
// Binary search program from here
        while(start <= end){
            int mid = start + (end - start) /2;
            if(target < arr[mid]){
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                ans = mid; // updating the answer
                if(Leftside){ // can there be more elements in left
                    end = mid -1;
                }else{ // otherwise on the right
                    start = mid +1;
                }
            }
        }
        return ans;
    }


}
