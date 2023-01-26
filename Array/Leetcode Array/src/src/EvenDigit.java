package src;

public class EvenDigit {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num: nums
             ) {
            if (even(num)){
                count++;
            }
        }
        return count;
    }

     static boolean even(int nums) {
        int numberofDigit = digit(nums);
         return numberofDigit % 2 == 0;
     }
    // this function will give us the number of element in the array

    static int digit(int num){
        int count = 0; // initial count is 0
        while(num > 0){
            count++; // incrementing the count
            num = num/10; // we are reducing the number
        }
        return count;
    }


}
