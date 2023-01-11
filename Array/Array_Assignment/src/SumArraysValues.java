import java.util.Scanner;

public class SumArraysValues    {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter "+i+"th value of array index: ");
            arr[i] = sc.nextInt();


        }
        int ans = sum(arr);
        System.out.println("The sum of the Arrays is: " +ans);


    }
    static int sum(int [] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
