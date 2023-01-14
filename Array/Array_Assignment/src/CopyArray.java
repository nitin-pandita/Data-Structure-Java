import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,45,234,56}; // array

        int [] copy = new int [6];
        for (int i = 0; i < arr.length; i++) {

            copy[i] = arr[i]; // making copy array equal to the current array

        }
        System.out.println(Arrays.toString(copy));
    }
}
