class MissingNumber {
    public static void main(String[] args) {
        int [] arr =  {3,0,1};
        missingNumber(arr);
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] arr) {
        // from 1 to n means apply cyclic sort
        for (int i = 0; i < arr.length;) {
            int CorrectIndex = arr[i];
            if(arr[i] <arr.length && arr[i] != arr[CorrectIndex]){ // if arr[i] was equal to n then skip
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
            if(arr[i] != i){
                return i;
            }
        }
        // case 2 if the n is not present in the array
        return arr.length;
    }
}