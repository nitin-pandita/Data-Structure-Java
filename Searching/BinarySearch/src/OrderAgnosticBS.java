public class OrderAgnosticBS {
    public static void main(String[] args) {
        int [] arr = {3,45,54,56,66,77,79,89,90};
        int target = 54;
        System.out.println(OrderAgnostic(arr,target));
    }

    static int OrderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
