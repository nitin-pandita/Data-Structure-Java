public class SellStock {
    // leetcode problem number 121
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxprofit(arr));
    }

     static int maxprofit(int[] arr) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
         System.out.println(minPrice);

         for (int j : arr) {
             minPrice = Math.min(minPrice, j);
             System.out.println(minPrice);

             maxProfit = Math.max(maxProfit, j - minPrice);

         }
         return  maxProfit;
    }

}
