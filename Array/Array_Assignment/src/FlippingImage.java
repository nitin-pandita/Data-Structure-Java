import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 0, 0}
                , {1, 0, 1}
                , {0, 0, 0}
        };

        System.out.println(Arrays.deepToString(flipping(arr)));
    }

    static int[][] flipping(int[][] image) {
//        int row = image.length;
//        int col = image[0].length;
//
////            Revert
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                image[i][j] = image[i][col - j - 1];
//            }
//        }
//
//        // invert
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                image[i][j] = image[i][j] == 1 ? 0 : 1;
//            }
        //              Method two with Xor thing
        // base condition
        // if my array is empty
        if (image.length == 0 || image[0].length == 0 || image == null) {
            return image;
        }

        // we have to revert the row and swap the values
        for (int[] row : image) {
            int start = 0;// taking start and end to swap values
            int end = image.length - 1;

            while (start <= end) {
                if (row[start] == row[end]) {
                    row[start] ^= 1;  // ^ = Zor means it will convert it 0 to 1 and 1 to 0;

                    row[end] = row[start]; // swaping the value here

                }
                // then moving forward from start and reducing from end
                start++;
                end--;
            }
            // in last return the image

        }
        return image;

    }

}
