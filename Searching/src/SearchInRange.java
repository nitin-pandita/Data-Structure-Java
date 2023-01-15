public class SearchInRange {
    // search an array in range of index [1,4]

    public static void main(String[] args) {
        int  []  arr ={1,45,456,67,123,4511};
        int start = 1;
        int end = 4;
        int target = 67;

        int ans = search(arr,target,start,end);
        System.out.println(ans);

    }
    static int search(int [] arr, int target,int start, int end){
        for (int i = start; i <= end ; i++) {
            int compare = arr[i];
            if(compare == target){
                return i;
            }
        }
        return -1;
    }
}
