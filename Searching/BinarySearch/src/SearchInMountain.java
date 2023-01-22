public class SearchInMountain {
    public static void main(String[] args) {

    }

    static int search(int [] arr, int target){
        int peak = peakmountians(arr);
        int firstTry = OrderAgnostic(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
            // try to search in second half
        return OrderAgnostic(arr,target,peak+1,arr.length-1);
    }

    static int peakmountians(int [] arr){

        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    static int OrderAgnostic(int[] arr, int target,int start,int end) {


        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {


            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
