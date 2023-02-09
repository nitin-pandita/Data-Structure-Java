import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number we be Searched in Array: ");
        int search = sc.nextInt();
       // linear search
        int [] arr = {18,12,9,14,77,50};

        for (int i = 0; i < arr.length-1; i++) {
            if(search == arr[i]){
                System.out.println("The Element was found at: "+i);
            }

        }
            System.out.println("Element Not Found");

    }
}