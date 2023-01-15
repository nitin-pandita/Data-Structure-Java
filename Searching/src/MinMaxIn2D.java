public class MinMaxIn2D {
    public static void main(String[] args) {
        int [][] arr = {
                {1,22,45},
                {56,23,12},
                {456,67,23},
                {23,435,56,476,6}
        };

        int ans = max(arr);
        System.out.println(ans);
    }
    static  int max(int [][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}

