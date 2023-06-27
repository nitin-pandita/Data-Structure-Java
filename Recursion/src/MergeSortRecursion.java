import java.util.Arrays;

public class MergeSortRecursion {
    public static void main(String[] args) {
        int[] arr  = {5,4,3,2,1};
        System.out.println(Arrays.toString(MergeSort(arr)));
    }

    static int[] MergeSort(int[] arr) {
        // base condition
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = MergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = MergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return sort(left, right);
    }

    static int[] sort(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {

                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }

        return mix;
    }
}
