public class RichestCustomer {
    public static void main(String[] args) {
        int [][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts){
        int max = 0;
        for (int[] account : accounts) {

            int rowmax = 0;

            for (int i : account) {

                rowmax += i;

            }
            if (rowmax > max) {
                max = rowmax;
            }
        }

        return max;

    }
}
