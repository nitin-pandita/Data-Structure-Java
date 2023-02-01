import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int [] arr){
        boolean swapped; // for not making the loop to run for every element as it is already sorted

        // run the loop for n - 1;
        for (int i = 0; i < arr.length; i++) {
            swapped =false;
            // for each step, max item will come at the last;
            for (int j = 1; j < arr.length - i; j++) { // same as <= arr.length - i - 1;
                // if the item is smaller the previous item swap the values
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {// swapped is false;
                break;
            }
        }
    }
}
