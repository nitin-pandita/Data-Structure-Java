public class FistMissing {
    public static void main(String[] args) {
        int [] arr = {1,2,0};
        System.out.println(missing(arr));
    }
    static int missing(int[] arr){

        // from 1 to n means apply cyclic sort
        for (int i = 0; i < arr.length;) {
            int CorrectIndex = arr[i]-1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[CorrectIndex]){ // if arr[i] was equal to n then skip
                // swap values
                int temp = arr[i];
                arr[i] = arr[CorrectIndex];
                arr[CorrectIndex] = temp;
            }else{
                i++;
            }
        }
        // checking the missing number
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
                return i+1;
            }
        }
        // case 2 if the n is not present in the array
        return arr.length+1;
    }
}
