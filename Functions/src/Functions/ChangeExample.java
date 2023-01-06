package Functions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeExample {
    public static void main(String[] args) {
        // creating array
        int [] arr  = {1,2,43,56,7};
        change(arr);

        System.out.println(Arrays.toString(arr)); // value will get change
    }
    static  void change(int[] nums){ // creating the copy of the reference variable
        nums[0] = 99; // if you make a change via reference variable , same object will be changed.
    }
}
