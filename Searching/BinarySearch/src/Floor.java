public class Floor {

        public static void main(String[] args) {
            int [] arr = {12,34,56,67,78,88,90};
            int target = 70;
            System.out.println(Floor(arr,target));
        }

        // Floor mean greatest element in array smaller than or equal to the target
        static int Floor(int [] arr,int target){
            int start = 0;
            int end  = arr.length - 1;

            while(start <= end ){
                int mid = start + (end - start) / 2;

                if(target > arr[mid]){
                    start = mid +1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }else{
                    return mid;
                }
            }
            // if not in the while loop mean not in the array it will be outside of start and end
//        so it becomes  e target s  so answer will be e
//        we want the smallest and equal number than target and that is s
            return end;
        }
    }

