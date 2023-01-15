public class SearchInRange {
    // search an array in range of index [1,4]

    public static void main(String[] args) {
        int  []  arr ={1,45,456,67,123,4511};

        int target = 67;

        int ans = search(arr,target);
        System.out.println(ans);

    }
    static int search(int [] arr, int target){
        for (int i = 1; i <= 4 ; i++) {
            int compare = arr[i];
            if(compare == target){
                return i;
            }
        }
        return -1;
    }
}
