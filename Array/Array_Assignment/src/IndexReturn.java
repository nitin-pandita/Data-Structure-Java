import java.util.Scanner;

public class IndexReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Search: ");
        int search = sc.nextInt();
        int [] arr = {23,45,56,231,6127,333};
        for (int i = 0; i <=arr.length-1; i++) {
            if(search == arr[i]){
                System.out.println("The Index of the Searched Element is: "+i);
            }


        }


    }
}
