import java.util.Arrays;

public class CurrentSmallestNumber {
    public static void main(String[] args) {
        int [] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallestNumber(arr)));
    }
    static int [] smallestNumber(int [] arr){
        // create an array
        int [] ans = new int[101];

        // count the number of occerance of each number
        for (int num: arr
             ) {
            ans[num]++;
        }
        //calculate the prefix sum
        for (int i = 1; i < ans.length; i++) {
            ans[i] += ans[i-1];
        }
        // number of elements smaller than that particular element
        // would be the value stored at ans[arr[i]-1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 0 : ans[arr[i] - 1];
        }
        return arr;
    }

}
