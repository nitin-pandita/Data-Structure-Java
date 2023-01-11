import java.util.Arrays;

public class SortArray {

    // sorting of array
    public static void main(String[] args) {
        int [] arr = {1,34,12,45,6,56,23};



        System.out.println("The Array is: "+ Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("The Sorted Array is: "+ Arrays.toString(arr));
    }
}
