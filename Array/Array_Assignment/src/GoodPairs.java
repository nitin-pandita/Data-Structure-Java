public class GoodPairs {
    public static void main(String[] args) {
            int [] arr = {1,2,3,1,1,3};
        System.out.println(pair(arr));
    }
    static int pair(int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j] && i < j){ // good pair element
                    count++;
                }
            }
        }
        return count;
    }
}
