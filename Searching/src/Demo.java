public class Demo {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};

//        System.out.println(findNumbers(nums));
//        System.out.println(digit(-121));
//        System.out.println(even(2231));
        System.out.println(digit2(234521));
    }
    static  int findNumbers(int[] nums){
        int count = 0;
        for (int num:nums
             ) {
            if(even(num)){
                count ++;
            }
        }
        return count;
    }
// function for finding even
     static boolean even(int num) {
        int IsEvenNumber = digit(num);
         return IsEvenNumber % 2 == 0;
     }


//     -------------------
    // optimized way of finding the digit
    static int digit2(int num){
        return (int)(Math.log10(num)) + 1; // more optimized
    }
    // function for counting the number of number
    static int digit(int num){
        if (num < 0){ // for allowing to take the negative value
            num = num * -1;
        }

        int count = 0;
        while(num > 0){
            count++;
            num = num /10;
        }

        return count;
    }
}
