package Recursion_Question;

public class MinMaxRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, -6};
        System.out.println("Min: "+minmax(arr, arr.length - 1));
        System.out.println("Max: "+max(arr,arr.length-1));
    }

    static int minmax(int[] arr, int temp) {
        // base condition (where the recursion is going to end)

        if (temp == 0) {
            return arr[0];
        }

        return Math.min(arr[temp], minmax(arr, temp - 1));// calling minmax for repeating the steps
    }
    static int max(int [] arr, int temp){
        if (temp == 0) {
            return arr[0];
        }
        return Math.max(arr[temp],max(arr,temp-1));

    }
}
