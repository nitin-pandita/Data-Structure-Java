public class MinMax {
    public static void main(String[] args) {
        int [] arr = {23,435,12,478,334};

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
                System.out.println("The min value is: "+min);
            }

        }
        System.out.println("The Max value is: "+max);


    }
}
