public class RotationCount {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6}; // index at last is the pivot
        System.out.println(rotation(arr));
    }
    static int rotation(int [] arr){
        int pivot = findPivout(arr);



        return pivot + 1; // count the number of time the arr has been rotated
    }

// for non duplicate items
static int findPivout(int [] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;
        // 4 cases;

        if (mid < end && arr[mid] >= arr[mid + 1]) {
            return mid;
        }
        if (mid > start && arr[mid] <= arr[mid - 1]) {
            return mid - 1;
        }
        if (arr[start] > arr[mid]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }
    return  -1;
}
}
