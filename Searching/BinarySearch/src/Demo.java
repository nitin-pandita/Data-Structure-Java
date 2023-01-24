public class Demo {
    // let's try to implement Binary Search Program
//    public static void main(String[] args) {
//        int [] arr = {2,5,7,9,12,23,45,67,89,99};
//        int target = 2;
//        System.out.println(binary(arr,target));
//    }
//
//    static int binary(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        while(start <= arr[end]){
//            int mid = start + (end - start)/2;
//
//            if(target > arr[mid]){
//                start = mid + 1;
//            } else if (target < arr[mid]) {
//                end = mid -1;
//            }else{
//                return mid;
//            }
//        }
//        return -1;

//    ---------------------------------------------------------------------
//    Ceiling Program in Java
    // Ceiling means smallest element in array greater than or equal to target
//    public static void main(String[] args) {
//        int [] arr = {2,5,7,9,12,23,45,67,89,99};
//        int target = 77;
//        System.out.println(Ceiling(arr,target));
//    }
//    static int Ceiling(int [] arr, int target){
//
//        int start = 0;
//        int end = arr.length -1;
//
//
//        while(start <= end){
//
//            int mid = start + (end - start) / 2;
//
//            if(target > arr[mid]){
//                start =  mid + 1;
//
//            } else if (target < arr[mid]) {
//                end = mid -1;
//            }else{
//                return mid;
//            }
//        }
//        return start; // if the element was not found in the array mean its outside the array start = end + 1
//    }
    //------------------------------------------------------------------------------------

    //    write a program to find a number in a infinite array;
//    public static void main(String[] args) {
//        int[] arr = {23, 45, 47, 49, 56, 57, 67, 68, 78, 79, 88, 89, 99};
//        int target = 79;
//        System.out.println(ans(arr, target));
//    }
//
//    static int ans(int[] arr, int target) {
//        int start = 0;
//        int end = 1;
//
//        while (target > arr[end]) {
//            int newStart = end + 1;
//            end = end + (end - start + 1) * 2;
//
//            start = newStart;
//        }
//        return binarySearch(arr, target, start, end);
//    }
//
//    static int binarySearch(int[] arr, int target, int start, int end) {
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target > arr[mid]) {
//                start = mid + 1;
//            } else if (target < arr[mid]) {
//                end = mid - 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//
//    }
//    -----------------------------------------
//        Rotated Array
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr, int target){
        int peak = findPivot(arr);
        if (peak == -1){
            return binarysearch(arr,target,0,arr.length-1);
        }
        // case 1;
        if(peak == target){
            return peak;
        }
        // case 2;
        if(arr[0] >= target){
            return binarysearch(arr,target,0,peak-1);
        }else{
            return binarysearch(arr,target,peak+1,arr.length-1);
        }

    }
    static int binarysearch(int [] arr, int target,int start,int end){
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end  = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;

    }
    static int findPivot(int [] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            // there will be case 4;
            // case 1;
            if(  mid < end && arr[mid] >= arr[mid +1]){
                return mid;
        }
            if (mid > start && arr[mid] <= arr[mid -1]){
                return mid -1;
            }
            if(arr[start] >= arr[mid]) {
                end = mid - 1;
            }
            else{
                start = mid +1;
            }

        }
        return  -1;
    }
}

