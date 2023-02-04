import java.util.ArrayList;
import java.util.List;

public class AllDuplicated {
    public static void main(String[] args) {

    }
    static List<Integer> findDuplicates(int[] arr) {
        List <Integer> h = new ArrayList<>();

        // for iterating over the loop
            for (int i = 0; i < arr.length;) {
                // we will check if  index + 1 is equal to the value at the index

                if(arr[i] != i + 1){
                    int correctIndex = arr[i] -1 ;
// if not then swap the values
                    if(arr[i] != arr[correctIndex]){
                        int temp = arr[i];
                        arr[i] = arr[correctIndex];
                        arr[correctIndex] = temp;
                    }else{
                        // if the value is already there mean the number is the duplicate item return it
                        List <Integer> ans = new ArrayList<>();

                        for(int j = 0; j < arr.length; j++){
                            ans.add(arr[i]);
                        }
                        return ans;

                    }
                }else{
                    // otherwise move to next element
                    i++;
                }
            }
            return h;
        }
    }

