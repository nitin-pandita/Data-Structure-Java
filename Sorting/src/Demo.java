import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
//        bubble(arr);
//        selection(arr);
        System.out.println(allduplicateitem(arr));
    }

     static List<Integer> allduplicateitem(int[] arr) {
         // appliying cyclic sort
         for (int i = 0; i < arr.length;) {
             int correctIndex = arr[i] -1;
             if(arr[i] != arr[correctIndex]){
                 int swap = arr[i];
                 arr[i] = arr[correctIndex];
                 arr[correctIndex] = swap;
             }else{
                 i++;
             }
         }
         List<Integer> ans = new ArrayList<Integer>(); // Array list to store the missing element in list type
         for (int index = 0; index < arr.length; index++) {
             if (arr[index] != index + 1) {// index + 1 means if the number is at the correct index as index = value -1
                 // so number will be index + 1
                 ans.add(arr[index]); // add function of ArrayList

             }
         }
         return ans;
    }

}
