public class PatterQuestion {
    public static void main(String[] args) {
        // patter question
        int [][] arr = new int[10][10];

        // for row
        for (int i = 0; i < 10; i++) {
            // for col
            for (int j = 0; j < 10; j++) {
                // printf convert string to int

                System.out.printf("%2d ",arr[i][j]);
            }
            System.out.println();
        }
    }
}
