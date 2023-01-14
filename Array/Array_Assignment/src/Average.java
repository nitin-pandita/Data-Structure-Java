public class Average {
    public static void main(String[] args) {

        // average program

        int [] arr = {1,3,45,21};

        System.out.println(average(arr));
    }

    static int average(int [] arr1){
        int average = sum(arr1)/ arr1.length;

        return average;
    }
    static int sum(int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
