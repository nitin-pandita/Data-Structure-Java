import java.util.Arrays;

public class Mismatch {
    public static void main(String[] args) {
        int [] arr = {1,2,2,4};
        System.out.println(Arrays.toString(mismatch(arr)));
    }
    static int[] mismatch(int[] arr){
        for (int i = 0; i < arr.length;) {

            int index = arr[i] -1;
            if(arr[i] != arr[index] ){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {// index + 1 means if the number is at the correct index as index = value -1
                return new int[]{arr[index],index+1};
                // arr[index] is the duplicate item andindex + 1 is the missing number
            }
        }
        return new int[]{-1,-1};
    }
}
