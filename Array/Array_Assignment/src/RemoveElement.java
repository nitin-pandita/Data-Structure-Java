import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int [] arr = {3,45,23,4,5,54,234};
//        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to remove from the list: ");
        int delete = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            int [] updated = null;
            if(delete != arr[i]){
                updated = arr;
                System.out.print(Arrays.toString(updated));

            }
        }

    }
}
