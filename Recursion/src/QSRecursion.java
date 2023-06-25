import java.util.Arrays;

public class QSRecursion {
    public static void main(String[] args) {
            int[] arr = {5,2,4,3,2,1,7};

            sort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] nums, int low , int high){
        if(low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;
        int pivot = nums[mid];


        while(s <=e) {

             while(nums[s] < pivot) {
                 s++;
             }

             while(nums[e] > pivot) {
                 e--;
             }

             if(s <= e) { // when start and end are at the same position
                 int temp = nums[s];
                 nums[s] = nums[e];
                 nums[e] = temp;

                 s++;
                 e--;
             }
             // now my pivot is at the correct position lets sort the halves;


            sort(nums,low, e);
             sort(nums,high,s);


        }

    }
}
