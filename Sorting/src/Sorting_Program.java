import java.util.Arrays;

public class Sorting_Program {
    public static void main(String[] args) {
        int [] arr = {12,3,8,30,9,33};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int [] arr){
        // run the loop for n - 1;
        for (int i = 0; i < arr.length; i++) {
            // for each step, max item will come at the last;
            for (int j = 1; j < arr.length; j++) { // same as arr.length - 1;
                // if the item is smaller the previous item swap the values
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
