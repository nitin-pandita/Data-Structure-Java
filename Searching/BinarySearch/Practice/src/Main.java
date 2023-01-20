import javax.sound.sampled.Line;

public class Main {
    public static void main(String[] args) {
        // Linear Search Program
// time compleity is O(1);
//        space complixity is  O(n);

        int [] arr = {1,34,56,67,77,89,98};
        int target = 77;
        System.out.println(Linear(arr,target));

    }
    static int Linear(int [] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                return i;
            }

        }
        return -1;
    }



}