package Recursion_Question;

public class MinMaxEle {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -2, 8, 6};
        int min = arr.length;

        System.out.println(MinMax(arr,min));
    }

 static int MinMax (int[] arr, int min) {
     if (min == 1)
         return arr[0];

         return Math.min(arr[min - 1], MinMax(arr, min - 1));

 }
}
