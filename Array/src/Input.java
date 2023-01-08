import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        arr[0] = 145;
        arr[1] = 245;
        arr[2] = 415;
        arr[3] = 453;
        arr[4] = 415;
        // arr   [145,245,425,453,415]
        System.out.println(arr[2]);

        // for n number of integers we use for loop

        for (int i = 0; i < arr.length; i++) {
                        // here length is of integer type
            System.out.println("Enter your array element "+i);
            arr[i] = sc.nextInt();


        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("At index "+i+" value is " +arr[i]);
        }
    }
}
