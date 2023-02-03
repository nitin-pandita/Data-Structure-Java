import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int [] arr = {3,5,2,1,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr){
        // method 1
//        for (int i = 0; i < arr.length;) {
//
//            int index = arr[i] -1;
//            if(arr[i] != arr[index] ){
//                int temp = arr[i];
//                arr[i] = arr[index];
//                arr[index] = temp;
//            }else{
//                i++;
//            }
//        }
        // method 2
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }

     static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
