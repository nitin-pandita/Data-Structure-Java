public class HighestAltitude {
    public static void main(String[] args) {
        int [] arr = new int []{
            -4, -3, -2, -1, 4, 3, 2
        };
        System.out.println(altitude(arr));
    }

    static int altitude(int[] arr) {

        int max_Alt = 0;
        int curr_Alt = 0;

        for (int i = 0; i < arr.length; i++) {
            curr_Alt += arr[i]; // adding the altitude to the current_Alt
            max_Alt = Math.max(curr_Alt,max_Alt); // comparing which is greatest curr_alt or max_alt and making
//            it to max_Alt
        }
        return max_Alt;
    }
}
