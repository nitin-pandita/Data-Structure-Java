import java.util.Arrays;

public class FindUniqueNumber {
    public static void main(String[] args) {
        int [] arr = {1 , 2 ,4 ,2 , 1 , 4, 8};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;

        for(int i : arr) {
            unique ^= i; // a ^ a = 0 and a ^ 0 = a
        }
        return unique;
    }


}
