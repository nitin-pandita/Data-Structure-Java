import java.util.Scanner;

public class CheckItem {
    public static void main(String[] args) {
        // Item Check in array

        int [] arr = {1,34,4,56,516};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to find in the string: ");
        int search = sc.nextInt();
        for (int i = 0; i <=arr.length-1; i++) {
            if( search == arr[i]){
                System.out.println("Yes the item is Present at index "+i);

            }
        }
    }
}
