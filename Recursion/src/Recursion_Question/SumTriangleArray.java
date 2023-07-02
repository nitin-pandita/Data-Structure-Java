package Recursion_Question;

import java.util.Arrays;

public class SumTriangleArray {
    public static void main(String[] args) {
            int[] arr = {1,2,3,4,5};
            SumTriangle(arr);
    }
    static void SumTriangle(int[] arr){
        // base condition
        if(arr.length < 1){
            return;
        }
        // dummy array to store the sum of the array
        int[] temp = new int[arr.length -1];
        for (int i = 0; i < arr.length-1; i++) {
            int x = arr[i] + arr[i+1];
            temp[i] = x;
        }

        SumTriangle(temp);
        System.out.println(Arrays.toString(arr));
    }
}
