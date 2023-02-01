import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int [] arr = {23,45,1,3,65,12};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int [] arr){
        // external loop will run from 0 to n-2;
        for (int i = 0; i < arr.length -1; i++) { // same as <= arr.length - 2
            // j is always greater than 0 and j is decrementing
            for (int j = i+1; j > 0; j--) { // j will always start from i + 1;

                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
