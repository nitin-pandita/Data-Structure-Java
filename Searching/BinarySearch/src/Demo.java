public class Demo {
    // let's try to implement Binary Search Program
    public static void main(String[] args) {
        int [] arr = {2,5,7,9,12,23,45,67,89,99};
        int target = 2;
        System.out.println(binary(arr,target));
    }

    static int binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= arr[end]){
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
