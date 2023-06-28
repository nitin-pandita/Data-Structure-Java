import java.util.Arrays;

public class QuickSortRecursion {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        QuickSort(arr,0,arr.length- 1);
        System.out.println(Arrays.toString(arr));
    }
    static void QuickSort(int[] arr, int low, int high) {
        // merge sort will contain a pivot
        if(low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];

        while(s <= e) {
            while(arr[s] < pivot) {
                s++;
            }
            while(arr[e] > pivot) {
                e--;
            }
            if(s <= e) {
                // now we swap
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        QuickSort(arr,low,e);
        QuickSort(arr,high, s);

    }
}
