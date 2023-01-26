package src;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {2,5,7,8,10,5};
        int target = 7;
        System.out.println(sum(arr,target));
    }

    static int sum(int[] arr, int target) {
        int nums = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length + 1; j++) {
                nums = arr[i] + arr[j];
                 target =  nums;

            }

        }
        return nums;
    }

}
