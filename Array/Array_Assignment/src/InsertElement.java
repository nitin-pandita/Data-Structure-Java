import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        // Write a Java program to insert an element (specific position) into an array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element to be inserted: ");
        int element = sc.nextInt();

        Integer [] arr = {34,234,546,23,67};
//   -------    Method first ----------

//        int n = arr.length;
//        int [] newArr = new int[n + 1];
//        for (int i = 0; i < n; i++) {
//            newArr[i] = arr[i];
//        }
//        newArr[n] = element; // large array and added the element to it
//        System.out.println(Arrays.toString(newArr));

        // Method Two is ArrayList

        ArrayList<Integer> mylist = new ArrayList<Integer>(Arrays.asList(arr)); // converting array into list

        mylist.add(element);

        arr = mylist.toArray(arr); // now converting list to array

        System.out.println(Arrays.toString(arr)); // printing the array
    }


}
