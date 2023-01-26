package src;

public class RichestCustomer {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {5,4,5}
        };
        System.out.println(arr(arr));
    }

    static int arr (int [][] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int rowmax = 0;
            for (int j = 0; j < arr[i].length; j++) {
                rowmax += arr[i][j];

                if(rowmax > max){
                    max = rowmax;
                }
            }

        }
        return max;
    }

}
