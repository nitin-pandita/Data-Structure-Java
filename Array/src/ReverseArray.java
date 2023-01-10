import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the "+i+" index value: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: "+ Arrays.toString(arr));
        swap(arr,0,3);
        System.out.println("Swapped array is: "+Arrays.toString(arr));

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    // In this function we will have start and end
    static void reverse(int [] arr1){
        int start = 0;
        int end = arr1.length - 1;
        while(start < end){
            swap(arr1,start,end);
            start++;
            end--;
        }

    }
    // function is used to swap values and we use this function we reverse the string
    static int swap(int [] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        return temp;

    };
}
