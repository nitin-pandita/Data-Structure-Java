package src;

import java.util.Arrays;

// leetcode problem
class sum_1 {
    public static void main(String[] args) {
        int [] arr = {9,9,9,9,9};
        System.out.println(Arrays.toString(ans(arr)));
    }
    static int[] ans(int [] digits){
        for (int i = digits.length-1; i >= 0; i--) {
            if(digits[i] < 9){
                digits[i] += 1;
                return digits;
            }

            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}