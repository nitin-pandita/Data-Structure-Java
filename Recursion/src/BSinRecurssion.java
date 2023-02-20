public class BSinRecurssion {
    public static void main(String[] args) {
        int [] arr = {1,2,4,45,56,67,78};
        int target = 78;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr, int target, int s, int e){

        // here we have taken s and e as argument as we have already discussed that we need them for future function

        // then find the  mid
        int m = s + (e - s)/2;

        if(arr[m] == target){
            return m;
        }
        if(target < arr[m]){ // i have search in right and I can't find the number please check in the left
            return search(arr,target,s,m-1);
        }
        return search(arr,target,m+1,e);
    }

}
