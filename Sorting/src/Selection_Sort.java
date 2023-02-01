import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int [] arr = {12,3,45,5,67,33};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int [] arr){
        // we need to find the maximum element and then swap with the right index;
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1; // to get the last element
            int maxIndex = getMaxelement(arr,0,last); // this will find the max element
            swap(arr,maxIndex,last); // swap the max element with the last element
        }
    }
    static void swap(int []arr,int start,int end){
        int temp = arr[start]; // swap function
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static int getMaxelement(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if(arr[max] < arr[i]){
                max = i; // max element
            }
        }
        return max;
    }
}

