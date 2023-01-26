public class SplitArray {
    public static void main(String[] args) {
        int [] arr  = {7,2,5,10,8};
        int pieces = 2;
        System.out.println(splitArray(arr,pieces));
    }
    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
// we have to find the min and maximum for the range
        for (int i = 0; i < nums.length; i++) {
            // min ans = max value in array
            // max ans = sum of values in Array
            start = Math.max(start,nums[i]); /// min ans
            end += nums[i]; // maximum ans
        }

        while(start < end){
            // try for the middle as potential ans
            int mid = start + (end - start)/2;

            // calculating how many pieces we can divide this to get max sum;
            int sum = 0;
            int pieces = 1;

            for (int num: nums
                 ) {
                if (sum + num > mid) { // current sum + num is greater than allowed sum
                    // it means you cannot add this in  subarray, make new one
                    //say you add this num in new subarray then sum = num
                    // because when the sum was exceeding from the allowed sum then were creating a new array
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }
            // binary search applying
            if(pieces > k){
                start = mid +1; // if the number of pieces are greater than take mid +1
            }else{
                end = mid; // if not then make end equal to mid;
            }



        }
        return start;
    }
}
