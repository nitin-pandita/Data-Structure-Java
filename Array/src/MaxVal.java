public class MaxVal {
    public static void main(String[] args) {
        // find the maximum value in the array
        int [] arr = {1,2,3,34,115,56};

        System.out.println(Max(arr));
        System.out.println(MaxRange(arr,0,2));
    }

    // when finding in the range
    static  int MaxRange(int [] arr, int start, int end){

        int max = arr[start];
        for (int i = 1; i <= end; i++) { // end isiliye likha kyuki huma number chiya na ki array
                if(arr[i] > max){
                    max = arr[i];
                }
        }
        return max;
    }

     static int Max(int[] arr) {

        int max= arr[0]; // let's take the first element as the greatest number
         for (int i = 1; i < arr.length; i++) {
             if(arr[i] > max){ // if the other element is greater than the other update the value
                 max = arr[i];
             }
         }
         return max;
    };
}
