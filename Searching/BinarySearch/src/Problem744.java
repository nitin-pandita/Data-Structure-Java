public class Problem744 {
    public static void main(String[] args) {
        char [] arr = {'c','f','j'};
        char target = 'g';

        System.out.println(targetFind(arr,target));
    }

    static int  targetFind(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return letters[start] % letters.length; // yaha hum bol raha hai ki huma question mai phala index return karna
// hai to uska liya hum start % length of array
        // kyuki jab hum phala kr raha tha toh start = end + 1 means it was equal to the lenght of the list
    }
}
