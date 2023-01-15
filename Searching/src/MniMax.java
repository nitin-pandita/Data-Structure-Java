public class MniMax {
    public static void main(String[] args) {
        // find min and max
        int [] arr = {34,45,61,23,454,11,2};
        int minvalue= min(arr);
        int maxvalue = max(arr);
        System.out.println("The Minimum value is: "+minvalue);
        System.out.println("The Maximum value is:"+maxvalue);
    }
    static int max(int [] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static int min(int [] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }

        }
        return min;

    }
}
