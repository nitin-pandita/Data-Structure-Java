public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {12,43,56,-1,45,-12,-41,45,87};
        int target = 45;

        int ans = linear(arr,target);
        System.out.println("The index for the searched item is: "+ans);
    }

    // if we want to return the element not the index
    static int linearSearch2(int [] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        // enhance for loop
        for (int condition : arr) {
            if (condition == target) {
                return condition;
            }
        }
        return -1;
    }
    // search in the array
    static int linear(int [] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            int condition = arr[index];
            if(condition == target){
                return index;
            }
        }
        return -1;
    }
}
