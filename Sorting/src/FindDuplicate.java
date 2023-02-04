public class FindDuplicate {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(duplicateItem(arr));
    }
    static int duplicateItem(int [] arr){
        // for iterating over the loop
        for (int i = 0; i < arr.length;) {
            // we will check if  index + 1 is equal to the value at the index

            if(arr[i] != i + 1){
                int correctIndex = arr[i] -1 ;
// if not then swap the values
                if(arr[i] != arr[correctIndex]){
                    int temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;
                }else{
                    // if the value is already there mean the number is the duplicate item return it
                    return arr[i];
                }
            }else{
                // otherwise move to next element
                i++;
            }
        }
        return -1;
    }
}
