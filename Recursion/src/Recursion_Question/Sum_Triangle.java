package Recursion_Question;

import com.sun.source.tree.BinaryTree;

import java.util.Arrays;

public class Sum_Triangle {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        triangle(arr);


    }

    static void triangle(int[] arr) {
        if (arr.length < 1){
            return;
        }
        int [] collection = new int[arr.length-1];
            // base condition
        for (int i = 0; i < arr.length-1; i++) {
            int sum = arr[i] + arr[i+1]; // sum of consecutive numbers
            collection[i] = sum;
        }

        triangle(collection);// because the number are being reduce and we want to break it down too

        System.out.println(Arrays.toString(arr)); // print current array in the end so that smaller array are
        // printed first


    }

}
