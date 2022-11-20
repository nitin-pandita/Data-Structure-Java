import java.util.Scanner;

public class Couting_Occurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a Number: ");

        int number = in.nextInt();

        System.out.println("Enter the element you want to find: ");

        int find = in.nextInt();

        int count = 0;
        while(number > 0){
            int rem = number % 10; // it will give us the last element

            if(rem == find){ // comaparing if rem and find are equal
                count++;
            }
            number /= 10; // removing the last elements
        }
        System.out.println(count);
    }
}
